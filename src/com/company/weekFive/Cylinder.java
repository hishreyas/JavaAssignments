package com.company.weekFive;

import java.util.Scanner;

interface Operation
{
    double PI=3.142;
    double area();
    double volume();
}

public class Cylinder implements Operation {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }


    @Override
    public double area() {
        return (2 * PI * radius) * (radius+height);
    }

    @Override
    public double volume() {
        return PI * (radius * radius) * height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        System.out.println("Enter radius and height of Cylinder");
        Scanner sc=new Scanner(System.in);
        Cylinder cylinder=new Cylinder(sc.nextDouble(),sc.nextDouble());
        System.out.println("Area:"+cylinder.area());
        System.out.println("Volume:"+cylinder.volume());
    }
}
