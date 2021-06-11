package com.bridgeLabz.day3.util3;
//Day 3 problems
public class Utility {
    //Second smallest no from an array
    public static int getSecondSmallest(int [] a){
        int temp;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];
    }
    //Second largest no from an array
    public static int getSecondLargest(int [] b){
        int temp;
        for (int i = 0; i < b.length; i++)
        {
            for (int j = i + 1; j < b.length; j++)
            {
                if (b[i] > b[j])
                {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        return b[5];
    }
    //Prime nos in a given range
    public static void prime(int st , int en){
        int count;
        for(int i = st ; i <= en ; i++)
        {
            count = 0;
            for(int j = 1 ; j <= i ; j++)
            {
                if(i % j == 0)
                    count = count+1;
            }
            if(count == 2)
                System.out.println(i);
        }
    }
    //check any number is repeated twice.
    public static void duplicate(int[] arr, int size) {
        System.out.println(" input array is: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    System.out.println("The repeated number is: " + arr[j]);
                else
                    System.out.println("No repeats");
                break;
            }
        }
    }
    //factors of n using prime factorisation
    public static void prime(int number) {
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.println(i);
                number = number / i;
            }
        }
    }
    public static void checkDuplicate(int[] arr, int size) {
        System.out.println("The input array is: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    System.out.println("The repeated number is: " + arr[j]);
                else
                    System.out.println("No repeats");
                break;
            }
        }
    }
}
