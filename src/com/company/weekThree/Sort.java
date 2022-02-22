package com.company.weekThree;
import java.io.*;
public class Sort
{

    public static void main(String[] args) throws IOException
    {

        int [] arr=new int[args.length];
        for(int i=0;i<args.length;i++) //Array Initialization
        {
            arr[i]=Integer.parseInt(args[i]);
        }

        int temp = 0; //Temporary variable to store the element

        for (int i = 0; i < args.length; i++) //Holds each Array element
        {
            for (int j = i+1; j < args.length; j++) //compares with remaining Array elements
            {
                if(arr[i] > arr[j]) //Compare and swap
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
