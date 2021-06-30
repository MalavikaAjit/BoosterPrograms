package com.bridgeLabz.day5;

import java.util.Scanner;

public class sinCos {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        MathFunction.sinCalculation(value);
        MathFunction.cosCalculation(value);
    }
}
