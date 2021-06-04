package com.bridgeLabz.day2;

import com.bridgeLabz.day2.util2.Utility;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times will the coin be flipped? ");
        int flips = scan.nextInt();
        Utility.coinToss(flips);
    }
}

