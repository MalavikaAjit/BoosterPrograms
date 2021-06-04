package com.bridgeLabz.day3;

import com.bridgeLabz.day3.util3.Utility;

import java.util.Scanner;

public class secondLargestSmallest {
    public static void main(String args[]){
        int a[]={1,2,5,6,3,2};
        int b[]={44,66,99,77,33,22,55};
        System.out.println("Second smallest: "+Utility.getSecondSmallest(a));
        System.out.println("Second largest : "+Utility.getSecondLargest(b));
    }
}
