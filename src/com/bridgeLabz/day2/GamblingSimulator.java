package com.bridgeLabz.day2;

import com.bridgeLabz.day2.util2.Utility;

import java.util.Scanner;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Enter the number of stake");
        Scanner scan = new Scanner(System.in);
        int stake = scan.nextInt();
        System.out.println("Enter your goal ");
        int goal = scan.nextInt();
        System.out.println("Enter the trail or the limit ");
        int trail = scan.nextInt();
        Utility.gambling(stake,goal,trail);
    }
}
