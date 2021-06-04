package com.bridgeLabz.day1;

import com.bridgeLabz.day1.util1.Utility;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
		System.out.print("Enter x y coordinate of point  : x,y  \n");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.print(" Euclidean distance from the point (x, y) to the origin (0, 0) is " + Utility.distanceOfPoint(x,y));
	 }
}
