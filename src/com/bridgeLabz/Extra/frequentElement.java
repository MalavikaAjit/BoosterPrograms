package com.bridgeLabz.Extra;

import java.util.Scanner;

public class frequentElement {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scan.nextInt();
        int [] array = new int[length];
        System.out.println("enter an array ");
        for(int i = 0; i<length; i++) {
           array[i] = scan.nextInt();
        }
        int [] fr = new int [array.length];
        int visited = -1;
        for(int i = 0; i < array.length; i++){
            int count = 1;
            for(int j = i+1; j < array.length; j++){
                if(array[i] == array[j]){
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + array[i] + "    |    " + fr[i]);
        }
    }
}
