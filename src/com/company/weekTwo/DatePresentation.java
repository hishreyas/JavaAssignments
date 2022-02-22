package com.company.weekTwo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePresentation {

    public static  void  main(String[] args)
    {
        Date currentDate= Calendar.getInstance().getTime();
        System.out.println("Current date is : "+getTimeInString(currentDate,"dd/MM/yyyy"));
        System.out.println("Current date is : "+getTimeInString(currentDate,"MM-dd-yyyy"));
        System.out.println("Current date is : "+getTimeInString(currentDate,"EEEEE MMMMM dd yyyy"));
        System.out.println("Current date and time is : "+getTimeInString(currentDate,"EEEEE MMMMM dd HH:mm:ss zzz yyyy"));
        System.out.println("Current date and time is : "+getTimeInString(currentDate,"dd/mm/yy HH:mm:ss aa SSSZ"));
        System.out.println("Current time is : "+getTimeInString(currentDate,"HH:mm:ss"));
        System.out.println("Current week of year is : "+getTimeInString(currentDate,"w"));
        System.out.println("Current week of month : "+getTimeInString(currentDate,"W"));
        System.out.println("Current day of the year is : "+getTimeInString(currentDate,"D"));

    }

    public static String getTimeInString(Date date,String pattern)
    {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
}
