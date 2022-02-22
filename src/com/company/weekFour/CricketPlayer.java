


import java.util.Scanner;

public class CricketPlayer {
    private String name;
    private int noOfInnings;
    private int noOfTimesNotOut;

    public float getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(float battingAverage) {
        this.battingAverage = battingAverage;
    }

    private float battingAverage;

    public CricketPlayer()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfInnings() {
        return noOfInnings;
    }

    public void setNoOfInnings(int noOfInnings) {
        this.noOfInnings = noOfInnings;
    }

    public int getNoOfTimesNotOut() {
        return noOfTimesNotOut;
    }

    public void setNoOfTimesNotOut(int noOfTimesNotOut) {
        this.noOfTimesNotOut = noOfTimesNotOut;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    private int totalRuns;


    public static float avg(CricketPlayer cricketPlayer)
    {
        return (float) cricketPlayer.getTotalRuns()/((float)cricketPlayer.getNoOfInnings()-(float)cricketPlayer.getNoOfTimesNotOut());
    }
    public static void sort(CricketPlayer[] cricketPlayers)
    {
        for(int i=0; i < cricketPlayers.length; i++){
            for(int j=1; j < (cricketPlayers.length-i); j++){
                if(cricketPlayers[j-1].getBattingAverage() > cricketPlayers[j].getBattingAverage()){

                    CricketPlayer temp = cricketPlayers[j-1];
                    cricketPlayers[j-1] = cricketPlayers[j];
                    cricketPlayers[j] = temp;
                }

            }
        }
    }

    @Override
    public String toString() {
        return "\n\tname:"+name+"\tnoOfInnings:" + noOfInnings +
                "\tnoOfTimesNotOut:" + noOfTimesNotOut +
                "\tbattingAverage:" + battingAverage +
                "\ttotalRuns" + totalRuns+"\n" ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many players:");
        CricketPlayer[] cricketPlayers = new CricketPlayer[sc.nextInt()];
        for (int i=0;i<cricketPlayers.length;i++) {
            System.out.println("Enter Cricket Player Details: Name,Total Number of Innings,Number of Times Not Out,Total Runs");
            CricketPlayer cricketPlayer=new CricketPlayer();
            cricketPlayer.setName(sc.next());
            cricketPlayer.setNoOfInnings(sc.nextInt());
            cricketPlayer.setNoOfTimesNotOut(sc.nextInt());
            cricketPlayer.setTotalRuns(sc.nextInt());
            cricketPlayer.setBattingAverage(CricketPlayer.avg(cricketPlayer));
            cricketPlayers[i]=cricketPlayer;
        }
        CricketPlayer.sort(cricketPlayers);
        for (CricketPlayer cricketPlayer : cricketPlayers)
        {
            System.out.println(cricketPlayer);
        }


    }
}
