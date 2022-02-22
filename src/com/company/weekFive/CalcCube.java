package com.company.weekFive;

import java.util.Scanner;

interface Cube
{
    int calculateCube(int num);
}

public class CalcCube {
    public static void main(String[] args) {
        int num=0;
        System.out.println("Enter num:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        Cube cube=(int x)-> x * x * x;
        System.out.println("Cube:"+cube.calculateCube(num));
    }
}
