package com.bridgeLabz.day2;

import com.bridgeLabz.day2.util2.Utility;

import java.util.Scanner;

public class Harmonic {
    public static void main(String arg[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        double n=scan.nextDouble();
        Utility.hValue(n);
    }

}
