package com.bridgeLabz.Extra;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 7, 1};
        int temp = 0;
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("sorted elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int diff = arr[0];
        int missingNo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (diff != arr[i] - i ) {
                while (diff < arr[i] - i) {
                   missingNo=i + diff;
                   System.out.println("\n" +"missing number " + missingNo);
                   diff ++;
                }
            }
        }
    }
}



