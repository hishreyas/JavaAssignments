package com.company.weekTwo;

public class MyNumber {
    private final int number;

    /**
     * Default constructor set default to 0
     */
    public MyNumber()
    {
        number=0;
    }

    /**
     * Initialize the MyNumber Object with provided number as parameter
     * @param number number to initialize the Object
     */
    public MyNumber(int number)
    {
        this.number=number;
    }

    /**
     * Function checks whether
     * number is negative or not
     * @return Boolean
     */
    public Boolean isNegative()
    {
        return number<0;
    }

    /**
     * Function checks whether
     * number is positive or not
     * @return Boolean
     */
    public Boolean isPositive()
    {
        return number>0;
    }

    /**
     * Function checks whether
     * number is zero or not
     * @return Boolean
     */
    public Boolean isZero()
    {
        return number==0;
    }

    /**
     * Function checks whether
     * number is even or not
     * @return Boolean
     */
    public  Boolean isEven()
    {
        return number%2==0;
    }

    /**
     * Function checks whether
     * number is odd or not
     * @return Boolean
     */
    public Boolean isOdd()
    {
        return !isEven();
    }

    /**
     * Function use to get number value
     * @return Boolean
     */
    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        int number;

        if(args.length==1)
        {
            number=Integer.parseInt(args[0]);
            MyNumber myNumber=new MyNumber(number);

            System.out.println("MyNumber: "+myNumber.getNumber());
            System.out.println("isNegative: "+myNumber.isNegative());
            System.out.println("isPositive: "+myNumber.isPositive());
            System.out.println("isZero: "+myNumber.isZero());
            System.out.println("isEven: "+myNumber.isEven());
            System.out.println("isOdd: "+myNumber.isOdd());

        }
        else
        {
            System.out.println("Insufficient arguments");
        }

    }

}
