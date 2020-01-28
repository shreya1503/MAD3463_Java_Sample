package com;

public class Arithmetic
{
     int add(int a, int b)
    {
        int add;
        add =   a + b;
        return add;
    }

     float add(float a, float b)
    {
        float sum;
        sum = a + b;
        return sum;
    }

     String add(String a, String b)
    {
        String str = null;
        str = a + b;
        return str;
    }

    String add(String a, int b)
    {
        return a + b;
    }

     String add(int a, String b)
    {
        return a + b;
    }

    int add(int a, int b, int c)
    {
        return a + b + c;
    }

    float add(int a, int b, float c)
    {
        return (float)add(a, b) + c;
    }

    float add(float a, int b)
    {
        return a + b;
    }

    float add(float a, int b, int c)
    {
        return a + (float)add(b,c);
    }

    String add(String a, int b, float c)
    {
        return a + b + c;
    }

    double add(int a, double b)
    {
        return a + b;
    }

    float add(int a, float b)
    {
        return a + b;
    }


}
