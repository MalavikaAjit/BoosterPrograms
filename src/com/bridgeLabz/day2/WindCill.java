package com.bridgeLabz.day2;

import com.bridgeLabz.day2.util2.Utility;

import java.util.Scanner;

public class WindCill {
    public static void main(String[] args) {
        System.out.println("Enter the temperature");
        Scanner scan = new Scanner(System.in);
        double t = scan.nextInt();
        System.out.println("Enter the wind speed ");
        double v = scan.nextInt();

        System.out.println("The temperature is " + Utility.windChill(t, v) + "F");
    }
}
