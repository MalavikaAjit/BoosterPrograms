package com.bridgeLabz.day1;

import java.util.Scanner;

import com.bridgeLabz.day1.util1.Utility;

public class Quadratic {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("enter value of a");
	        int a = scan.nextInt();
	        System.out.println("enter the value of b ");
	        int b = scan.nextInt();
	        System.out.println("Enter the value of constant c ");
	        int c = scan.nextInt();
	        
	        Utility.rootsOfQuadratic(a, b, c);
	    }
}
