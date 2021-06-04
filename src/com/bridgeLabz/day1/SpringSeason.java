package com.bridgeLabz.day1;

import java.util.Scanner;

import com.bridgeLabz.day1.util1.Utility;

public class SpringSeason {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println(" Enter Date , d");
        int d= scan.nextInt();
        System.out.println(" Enter month , m");
        int m= scan.nextInt();
        Utility.dayMonth(d, m);

    }
}
