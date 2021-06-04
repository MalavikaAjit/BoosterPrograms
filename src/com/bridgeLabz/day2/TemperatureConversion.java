package com.bridgeLabz.day2;

import com.bridgeLabz.day2.util2.Utility;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String arg[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int choice=scan.nextInt();
        switch(choice)
        {
            case 1:  System.out.println("Enter  Fahrenheit temperature");
               double f=scan.nextDouble();
               System.out.println("Celsius temperature is = "+Utility.tempConvToF(f));
               break;
            case 2:  System.out.println("Enter  Celsius temperature");
               double c=scan.nextDouble();
               System.out.println("Fahrenheit temperature is = "+Utility.tempConvToF(c));
               break;
            default:  System.out.println("please choose valid choice");
        }
    }
}
