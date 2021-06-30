package com.bridgeLabz.Extra;

 import java.io.*;
import java.util.Scanner;

   public class BuzzNo {
        static boolean checkNumber(int number)
        {
            if(number % 10 == 7 || number % 7 == 0)
                return true;
            else
                return false;
        }
        public static void main(String args[])
        {
            Scanner scan =new Scanner(System.in);
            System.out.println("Enter first number");
            int n1 = scan.nextInt();
            if( checkNumber(n1)){
              System.out.println(n1 + " is a Buzz number");
            }
            else{
                System.out.println(n1 + " is not a Buzz number");
            }
    }
}
