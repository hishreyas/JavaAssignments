package com.company.weekOne;

import java.util.Scanner;

/**
 * Roll no:6
 * Rectangle area and perimeter
 */
public class Rectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle");
        float length = scanner.nextFloat();
        float breadth = scanner.nextFloat();
        System.out.println("Area :"+(length*breadth));
        System.out.println("Perimeter:"+2*(length+breadth));
    }
}
