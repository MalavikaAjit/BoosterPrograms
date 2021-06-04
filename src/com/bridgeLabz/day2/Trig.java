package com.bridgeLabz.day2;

import com.bridgeLabz.day2.util2.Utility;

import java.util.Scanner;

public class Trig {
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter an angle in degrees");
        double degrees=scan.nextDouble();
        Utility.trignometry(degrees);
    }
}
