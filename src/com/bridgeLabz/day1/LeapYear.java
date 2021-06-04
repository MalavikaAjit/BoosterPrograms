package com.bridgeLabz.day1;

import com.bridgeLabz.day1.util1.Utility;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter an year ");
		int year =scan.nextInt();
	    Utility.findLeapYear(year);
    }
}