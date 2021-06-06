package com.bridgeLabz.day2;

import com.bridgeLabz.day2.util2.Utility;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        System.out.println("Enter the month ");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        System.out.println("Enter the day ");
        int day = scan.nextInt();
        System.out.println("Enter year ");
        int year = scan.nextInt();
        Utility.day(month,day,year);
    }
}
