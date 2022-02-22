package com.company.weekTwo;

import java.util.*;

public class Matrix
{
    int[][] newMatrix(int dimension,Scanner sc)
    {
        int i,j;
        int[][] matrix=new int[dimension][dimension];
        for(i=0; i<dimension; i++)
            for(j=0; j<dimension; j++)
            {
                System.out.printf("Enter number " + i + " " + j + ":");
                matrix[i][j]=sc.nextInt();
            }

        return matrix;
    }


    void display(int array[][])
    {
        int i,j;
        for(i=0; i<array.length; i++)
        {
            for(j=0; j<array[i].length; j++)
                System.out.print(array[i][j] + "\t");
            System.out.println("");
        }
    }

    void addMatrix(int b1[][], int b2[][])
    {
        int[][] temp = new int[b1.length][b1.length];
        int i,j;
        for(i=0; i<temp.length; i++)
            for(j=0; j<b1.length; j++)
                temp[i][j] = b1[i][j] + b2[i][j];
        display(temp);
    }

    void subMatrix(int b1[][], int b2[][])
    {
        int[][] temp = new int[b1.length][b1.length];
        int i,j;
        for(i=0; i<temp.length; i++)
            for(j=0; j<b1.length; j++)
                temp[i][j] = b1[i][j] - b2[i][j];
        display(temp);
    }

    void multiplyMatrix(int b1[][],int b2[][])
    {
        int i,j,k;
        int[][] result = new int[b1.length][b1.length];
        for(i=0; i<b1.length; i++)
            for(j=0; j<b1.length; j++)
                for(k=0; k<b1.length; k++)
                {
                    result[i][j] = result[i][j] + b1[i][k] * b2[k][j];
                }
        display(result);
    }

    void transpose(int array[][])
    {
        int i,j;
        int[][] temp = new int[array.length][array.length];
        for(i=0; i<array.length; i++)
        {
            for(j=0; j<array.length; j++)
                temp[i][j]=array[j][i];
            System.out.println("");
        }
        display(temp);
    }




    public static void main (String[] args)
    {
        int matrix1[][];
        int matrix2[][];
        boolean shouldStop=false;
        Scanner sc = new Scanner(System.in);
        Matrix mat = new Matrix();

        System.out.println("Matrix Rows and Columns");
        int dimension = sc.nextInt();

        System.out.println("Insert matrix 1 \n");
        matrix1=mat.newMatrix(dimension,sc);
        System.out.println("Insert matrix 2 \n");
        matrix2=mat.newMatrix(dimension,sc);
        System.out.println("matrix 1 \n");
        mat.display(matrix1);
        System.out.println("\n matrix 2 \n");
        mat.display(matrix2);

        while(!shouldStop)
        {
            System.out.println("\n\n1. Multiplication");
            System.out.println("2. Addition");
            System.out.println("3. Subtraction");
            System.out.println("4. Transpose ");
            System.out.println("5. Exit\n\n");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("\n Multiplication of matrix \n");
                    mat.multiplyMatrix(matrix1,matrix2);
                    break;
                case 2:

                    System.out.println("\naddition of matrix  \n");
                    mat.addMatrix(matrix1,matrix2);
                    break;
                case 3:

                    System.out.println("\nsubtraction of matrix  \n");
                    mat.subMatrix(matrix1,matrix2);
                    break;
                case 4:

                    System.out.println("\n\nTranspose matrix 1");
                    mat.transpose(matrix1);
                    System.out.println("\n\nTranspose matrix 2");
                    mat.transpose(matrix2);
                    break;
                case 5:
                    shouldStop=true;
                    break;
                default:
                    System.out.println("Please choice valid option");
            }

        }
    }
}
