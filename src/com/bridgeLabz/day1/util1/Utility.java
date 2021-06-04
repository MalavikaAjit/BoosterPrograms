package com.bridgeLabz.day1.util1;

import java.util.Scanner;
// Day 1 problems
public class Utility {
    //Addition of two nos
    public static int add(int fno, int sno) {
        return fno+sno;
    }
    //Reverse a given no
    public static int reverse(int number)
    {
        int remainder = 0, reverse =0;
        while(number >0) {
            remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        return reverse;
    }
    //Sum of two dice numbers
    public static int SumofDice (int die1, int die2)
    {
        int sum = die1 + die2;
        return sum;
    }
    //check whether given year is leap year
    public static void findLeapYear(int year) {
        if (year %4 == 0 && year%100!= 0 ||  year%400 == 0 ) {
            System.out.println(year+"  is leap year ");
        }
        else {
            System.out.println(year+"  is not leap year ");
        }
    }
    //print true if the day and month comes between March 20 and June 20
    public static void dayMonth(int d, int m) {
        if(m == 3  && d >= 20 && d <31) {
            System.out.println(" true");
        }
        if ( m > 3 && m < 7 && d > 1 && d < 31 ) {
            System.out.println(" true");
        }
        if ( m == 6 && d >= 1 && d < 20) {
            System.out.println(" true");
        }
        else {
            System.out.println(" false");
        }
    }
    //roots of quadratic eqations
    public static void rootsOfQuadratic(int a, int b, int c) {
        int delta = (b * b - 4 * a * c);
        double root1 = (-b + Math.sqrt(delta) / (2 * a ));
        double root2 = (-b - Math.sqrt(delta) / (2 * a ));
        System.out.println("the first root  " +root1);
        System.out.println("the second root  " +root2);
    }
    //Mathematical operations with 3 nos
    public static void operations(int a, int b, int c) {
        int opt1 = a+b*c;
        int opt2 = a*b+c;
        int opt3 = a % b +c;
        int opt4 = c + a / b;
        System.out.print("result1 = "+ opt1 +"  result2=  " +  opt2 +"  result3=  "+  opt3 +"  result4=  "+  opt4 );
    }
    // Eucledian distance from a point (x,y) to origin(0,0)
    public static double distanceOfPoint(int x , int y){
        double distance;
        return distance = Math.sqrt(x * x + y * y);
    }
}

