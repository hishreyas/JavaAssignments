package com.company.weekThree;
import java.util.*;
public class Person
{
    String firstName,middleName,lastName;
    int len;
    void accept()
    {
        System.out.println("Enter First Name :");
        Scanner s=new Scanner(System.in);
        firstName=s.next();
        System.out.println("Enter Middle Name :");
        middleName=s.next();
        System.out.println("Enter Last Name :");
        lastName=s.next();
        len=middleName.length();
        String f=middleName.substring(0,1);
        String l=middleName.substring(1,len);
        f=f.toUpperCase();
        middleName=f+l;
    }
    void display()
    {
        System.out.println("Last Name :"+lastName);
        System.out.println("First Name :"+firstName);
        System.out.println("Middle Name :"+middleName);
    }
    public static void main(String a[])
    {
        Person p=new Person();
        p.accept();
        p.display();
    }
}
