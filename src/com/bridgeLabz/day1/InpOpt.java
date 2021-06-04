package com.bridgeLabz.day1;

import java.util.Scanner;

import com.bridgeLabz.day1.util1.Utility;

public class InpOpt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("enter value of a");
		int a=scan.nextInt();
		System.out.println("enter value of a");
		int b = scan.nextInt();
		System.out.println("enter value of a");
		int c = scan.nextInt();
		Utility.operations(a, b, c);
    }
}
   
