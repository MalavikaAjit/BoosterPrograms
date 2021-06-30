package com.bridgeLabz.day5;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        MathFunction.factorial(number);
    }
}
