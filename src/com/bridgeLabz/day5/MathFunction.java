package com.bridgeLabz.day5;

import java.util.Scanner;

public class MathFunction {
    public static void sinCalculation(double number)
    {
        double calculation = Math.sin(number);
        System.out.println("\n" +"cos value  " + calculation);
    }
    public static void cosCalculation(double number)
    {
        double calculation = Math.cos(number);
        System.out.println("\n" +"cos value  " + calculation);
    }
    public static void binary(int number) {
        int[] binary = new int[100];
        int i = 0;
        while (number != 0) {
            binary[i] = number % 2;
            number = number / 2;
            i++;
        }
        System.out.println("\n" +"The binary value is: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }
    public static void harmonicNumber(int number) {
        double result = 0;
        for (int i = 1; i <= number; i++) {
            //System.out.print("1/" + i + " + ");
            result += (float) 1 / i;
        }
        System.out.println("\n" + "harmonic No " + result);
    }
    public static void main(String[] args)  {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

        cosCalculation(value);
        sinCalculation(value);
        harmonicNumber(value);
        binary(value);
    }
}
