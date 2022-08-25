package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
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
    }
}
