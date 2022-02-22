package com.company.weekEight;

import java.util.Scanner;

public class MyDate {
    public int day;
    public int month;
    public int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static MyDate accept(int day, int month, int year) throws InvalidDateException{

        if (year > 0 && day>0 && month>0 && day<=noOfDaysInMonth(month,year)) {
            return new MyDate(day,month,year);
        }
        throw new InvalidDateException();
    }

    static class InvalidDateException extends Exception {
        public InvalidDateException() {
            super(InvalidDateException.class.getSimpleName());
        }
    }

    static int noOfDaysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;
        }

    }


    public void display(){
        System.out.println("Date :"+day +"-" +month +"-"+ year);
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("Enter date in dd mm yy:");
            try {
                MyDate myDate=MyDate.accept(input.nextInt(),input.nextInt(),input.nextInt());
                myDate.display();
            } catch (InvalidDateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
