package com.bridgeLabz.day1;

public class PrintThreeNames {
	    public static void main(String[] args) {
	    String [] reverseArray = {"Alice" , "Bob" , "Carol"};
	    System.out.println("Original Array:");
	    for(int i=0;i<reverseArray.length;i++)
	         System.out.print(reverseArray[i] + "  ");
	    System.out.println("reverse order:");
	        for(int i=reverseArray.length-1;i>=0;i--)
	         System.out.print(reverseArray[i] + "  ");
	    }
	}

