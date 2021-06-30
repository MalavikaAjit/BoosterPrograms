package com.bridgeLabz.day5;

import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array length:");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        MathFunction.maxim(arr);
        MathFunction.min(arr);
    }
}
