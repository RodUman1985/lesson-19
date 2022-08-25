package com.company;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here
MyList list= new MyList();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.print();
 // классы Date и Calendar
        // в date запишется текущее время ОС
        Date date = new Date();
        System.out.println(date);
        date.setTime(34892734);
        System.out.println(date);
        Date date2= new Date(452352352);
        System.out.println(date2);
  // форматирование даты
        SimpleDateFormat format = new SimpleDateFormat(" yyyy ## MMM ## HH : mm  G ");
        format.format(date);
        System.out.println(format.format(date));
       //  format = new SimpleDateFormat("MM yy dd");
       // Scanner sc= new Scanner(System.in);
       // String s=sc.nextLine();
      // Date d = format.parse(s);
       // System.out.println(d);
        //класс Calendar (абстрактный(!))
        Calendar c =Calendar.getInstance();
        System.out.println(c);
        c.set(Calendar.MONTH,Calendar.SEPTEMBER);
        c.set(Calendar.DAY_OF_MONTH,3);
        System.out.println(c);
        c.add(Calendar.YEAR,1);
        c.add (Calendar.HOUR, -2);
        System.out.println(c);
        Date d = c.getTime();
        System.out.println(format.format(d));
        GregorianCalendar t=new GregorianCalendar();
    }
}
