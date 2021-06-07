package com.bridgeLabz.day3;

import com.bridgeLabz.day3.util3.Utility;

import java.util.Scanner;

public class RepeatedNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        Utility.duplicate(arr, size);
    }
}
