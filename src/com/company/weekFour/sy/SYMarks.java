package sy;

public class SYMarks {
    public int getComputerTotal() {
        return computerTotal;
    }

    public SYMarks(int computerTotal, int mathsTotal, int electronicsTotal) {
        this.computerTotal = computerTotal;
        this.mathsTotal = mathsTotal;
        this.electronicsTotal = electronicsTotal;
    }

    public void setComputerTotal(int computerTotal) {
        this.computerTotal = computerTotal;
    }

    public int getMathsTotal() {
        return mathsTotal;
    }

    public void setMathsTotal(int mathsTotal) {
        this.mathsTotal = mathsTotal;
    }

    public int getElectronicsTotal() {
        return electronicsTotal;
    }

    public void setElectronicsTotal(int electronicsTotal) {
        this.electronicsTotal = electronicsTotal;
    }

    private int computerTotal;
    private int mathsTotal;
    private int electronicsTotal;

    public int getTotal()
    {
        return computerTotal+mathsTotal+electronicsTotal;
    }

    @Override
    public String toString() {
        return "SYMarks: \n" +
                "\tcomputerTotal:" + computerTotal +
                "\tmathsTotal=" + mathsTotal +
                "\telectronicsTotal=" + electronicsTotal +"\n";
    }
}
