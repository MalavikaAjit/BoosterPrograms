package com.bridgeLabz.day3;

import com.bridgeLabz.day3.util3.Utility;

import java.util.Scanner;

public class PrimeNoInRange {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starting Number : ");
        int start = sc.nextInt();
        System.out.print("Enter Ending Number : ");
        int end = sc.nextInt();
        System.out.println("Prime numbers between "+start+" and "+end+" are :  " );
        Utility.prime(start,end);

    }
}
