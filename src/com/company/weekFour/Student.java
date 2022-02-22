

import sy.SYMarks;
import ty.TYMarks;

import java.util.Scanner;

public class Student {
    private String name;

    public Student()
    {

    }

    public Student(String name, int rollNumber, SYMarks syMarks, TYMarks tyMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.syMarks = syMarks;
        this.tyMarks = tyMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public SYMarks getSyMarks() {
        return syMarks;
    }

    public void setSyMarks(SYMarks syMarks) {
        this.syMarks = syMarks;
    }

    public TYMarks getTyMarks() {
        return tyMarks;
    }

    public void setTyMarks(TYMarks tyMarks) {
        this.tyMarks = tyMarks;
    }

    private int rollNumber;
    private SYMarks syMarks;
    private TYMarks tyMarks;

    public String calculateGrade()
    {
        float percentage=getPercentage();

        if(percentage>=70)
            return "A";
        else if(percentage>=60)
            return "B";
        else  if(percentage>=50)
            return "C";
        else if(percentage>=40)
            return "Pass";
        return "Fail";
    }

    public float getPercentage()
    {
        return (((float)syMarks.getTotal()+(float)tyMarks.getTotal())/500)*100;
    }

    @Override
    public String toString() {
        return "Student Result\n" +
                "name:" + name + "\trollNumber:" + rollNumber +
                "\n"+ syMarks + tyMarks+
                "Percentage:"+getPercentage()+
                "\tGrade: "+calculateGrade();
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Student student=new Student();
        System.out.println("Enter name and roll number:");
        student.setName(sc.nextLine());
        student.setRollNumber(sc.nextInt());
        System.out.println("Enter SY Marks of Computer,Maths,Electronics");
        student.setSyMarks(new SYMarks(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        System.out.println("Enter TY Marks of Theory,Practicals");
        student.setTyMarks(new TYMarks(sc.nextInt(),sc.nextInt()));
        System.out.println(student);
    }


}
