package com.company.weekOne;

import java.util.Scanner;

/**
 * Roll no:6
 * MenuDrivenOperations
 */
public class MenuDrivenOperation {

    public  static void  main(String[] args) {
        System.out.println("Enter choice:");
        System.out.println("1.Calculate the volume of cylinder");
        System.out.println("2.Find the factorial of given number");
        System.out.println("3.Check the number is Armstrong or not");
        Scanner scanner=new Scanner(System.in);

        while (true) {
            int choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter radius and height of cylinder");
                    System.out.println("Volume of cylinder:"+calculateVolume(scanner.nextFloat(),scanner.nextFloat()));
                    break;
                case 2:
                    System.out.println("Enter number");
                    System.out.println("Factorial:"+factorial(scanner.nextInt()));
                    break;
                case 3:
                    System.out.println("Enter number");
                   if(isArmstrong(scanner.nextInt()))
                       System.out.println("Number is Armstrong");
                   else
                       System.out.println("Number is not Armstrong");
                   break;
                default:
                    System.out.println("Enter valid choice");
            }
        }

    }

    public static double calculateVolume(float radius,float height) {
        return Math.PI*radius*radius*height;
    }

    public static long factorial(int num) {
        if (num==0)
            return 1;

        return factorial(num-1)*num;
    }

    public static boolean isArmstrong(int num)
    {
        int n=order(num);
        int temp=num,sum=0;

        while (temp!=0) {
            int r=temp%10;
            sum+=Math.pow(r,n);
            temp/=10;
        }
        return sum==num;
    }

    public static int order(int num) {
        int n = 0;
        while(num != 0)
        {
            n++;
            num/=10;
        }
        return n;
    }

}
