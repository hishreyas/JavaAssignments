package com.company.weekOne;

import java.util.Scanner;

/**
 * Roll no:6
 * ReverseArray
 */
public class ReverseArray {
    public static void main(String[] args)
    {
        System.out.println("Enter array size");
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[scanner.nextInt()];
        acceptArray(scanner,arr);
        printReverse(arr);
    }
    public static void acceptArray(Scanner scanner,int[] arr)
    {
        for (int i=0;i<arr.length;i++)
            arr[i]=scanner.nextInt();
    }
    public static void printReverse(int[] arr)
    {
        for(int i= arr.length-1;i>=0;i--)
            System.out.print(" "+arr[i]);

    }
}
