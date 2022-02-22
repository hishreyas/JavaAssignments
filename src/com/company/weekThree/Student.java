package com.company.weekThree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Student
{
    int rollNo;
    String name;
    float percentage;
    static int count;
    Student(){}
    Student(String n,float p)
    {
        count++;
        rollNo=count;
        name=n;
        percentage=p;
    }
    void display()
    {
        System.out.println(rollNo+"\t"+name+"\t"+percentage);
    }
    float getPercentage()
    {
        return percentage;
    }
    static void counter()
    {
        System.out.println(count+" object is created");
    }
    public static void sortStudent(Student[] s)
    {
        for(int i=0; i < s.length; i++){
            for(int j=1; j < (s.length-i); j++){
                if(s[j-1].getPercentage() > s[j].getPercentage()){

                    Student temp = s[j-1];
                    s[j-1] = s[j];
                    s[j] = temp;
                }

            }
        }

        for (Student student : s) student.display();
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of Student:");
        int n=Integer.parseInt(br.readLine());
        Student p[]=new Student[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Name:");
            String name=br.readLine();
            System.out.print("Enter percentage:");
            float per=Float.parseFloat(br.readLine());
            p[i]=new Student(name,per);
            counter();
        }
        Student.sortStudent(p);
    }


}
