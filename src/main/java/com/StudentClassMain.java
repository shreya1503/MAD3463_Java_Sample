package com;

import java.util.Date;

public class StudentClassMain
{
    public static void main(String[] args)
    {

        Student s1 = new Student();

        s1.setData(1, "Shreya", "Vaghasiya", new Date(2020, 0, 24),
                Gender.FEMALE, 70, 70,65,75,80,60);

        s1.printData();
        s1.calculateMarks();
        s1.percentage();
        s1.result();

        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.add(10,2));
        System.out.println(arithmetic.add(10,5.0));
        System.out.println(arithmetic.add(10,2.0f));
        System.out.println(arithmetic.add(10,2));
        System.out.println(arithmetic.add("Hello",2));
      //  System.out.println(arithmetic.add("Hello",2.0f));



    }
}
