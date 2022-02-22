package ty;

public class TYMarks {
    private int theory;

    public int getTheory() {
        return theory;
    }

    public TYMarks(int theory, int practicals) {
        this.theory = theory;
        this.practicals = practicals;
    }

    public void setTheory(int theory) {
        this.theory = theory;
    }

    public int getPracticals() {
        return practicals;
    }

    public void setPracticals(int practicals) {
        this.practicals = practicals;
    }

    private int practicals;

    public int getTotal()
    {
        return theory+practicals;
    }

    @Override
    public String toString() {
        return "TYMarks: \n" +
                "\ttheory=" + theory +
                "\tpracticals=" + practicals +"\n";
    }
}
