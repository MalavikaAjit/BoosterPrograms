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
    public static void factorial(int number) {
        int i ;
        int fact = 0;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+ fact);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void maxim(int [] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length ; i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Maximum is " + max);
    }
    public static void min(int [] arr){
        int min = arr[0];
        for(int i = 0; i<arr.length ; i++){
            if(min > arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum is " + min);
    }
    public static void moneyInvested(int r , int T , int C){
        double amount = C/(1);
    }
}
