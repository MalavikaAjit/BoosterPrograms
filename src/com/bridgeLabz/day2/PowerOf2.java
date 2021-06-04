package com.bridgeLabz.day2;

import com.bridgeLabz.day2.util2.Utility;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("  Enter the Exponent Value : ");
        double exponent = scan.nextInt();
        Utility.power(exponent);
    }
}
