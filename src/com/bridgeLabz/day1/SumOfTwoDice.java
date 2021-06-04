package com.bridgeLabz.day1;

import com.bridgeLabz.day1.util1.Utility;

public class SumOfTwoDice {
	public static void main(String[] args) {
		int die1 = (int)(Math.random()*6) + 1;
        int die2 = (int)(Math.random()*6) + 1;
        System.out.println("the sum of the random numbers "+ Utility.SumofDice(die1,die2));
	}
}
