package com.bridgeLabz.day5;

import java.util.Scanner;

public class harmonic {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        MathFunction.harmonicNumber(value);
    }
}
