package com.bridgeLabz.day4.util4;

public class Utility {
    //check a string is palindrome or not
    public static void stringPlaindrome(String a) {
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not palindrome.");
        }
    }
    /*public static void calenderDate(int day, int month){
        int day0 = (day + x + 31 * (month / 12)) % 7;
        if (day0 == 0) {
            System.out.println("Sunday ");
        } else if (day0 == 1) {
            System.out.println("Monday ");
        } else if (day0 == 2) {
            System.out.println("Tuesday ");
        } else if (day0 == 3) {
            System.out.println("Wednesday ");
        } else if (day0 == 4) {
            System.out.println("Thursday ");
        } else if (day0 == 5) {
            System.out.println("Friday ");
        } else if (day0 == 6) {
            System.out.println("Saturday ");
        }
        System.out.println(day0);
    }*/
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
}
