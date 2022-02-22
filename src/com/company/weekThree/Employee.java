package com.company.weekThree;
import java.util.Scanner;
public class Employee {
    int id;
    String name;
    String deptName;
    float salary;
    static int employeesCount=0;
    Employee(){
        id=0;
        name="";
        deptName="";
        salary=0;
    }
    Employee(int id,String name,String deptName,float salary ){
        this.id=id;
        this.name=name;
        this.deptName=deptName;
        this.salary=salary;
        employeesCount++;
    }
    public void display(){
        System.out.println("Employee Id :"+id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee Department: "+deptName);
        System.out.println("Employee Salary :"+salary);
    }
    public static void main(String[] args){
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("How many employees you want to enter :");
        n=sc.nextInt();
        Employee[] ob=new Employee[n];
        for(int i=0;i<n;i++){
            sc= new Scanner(System.in);
            System.out.println("Enter Id of employee "+(i+1)+" :");
            int id=sc.nextInt();
            System.out.println("Enter Name of employee "+(i+1)+" :");
            sc.nextLine();
            String name= sc.nextLine();
            System.out.println("Enter dept name of employee "+(i+1)+" :");
            String deptName=sc.nextLine();
            System.out.println("Enter salary of employee "+(i+1)+" :");
            float salary = sc.nextFloat();
            ob[i]=new Employee(id,name,deptName,salary);
            System.out.println("\nNumber of Objects : "+employeesCount);
        }
        for(int i=0;i<n;i++)
        {
            ob[i].display();
        }
    }
}
