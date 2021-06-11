package com.bridgeLabz.Extra;

public class palindrome {
    public static void main(String args[]){
        int rem,sum=0;
        int n=125;
        int value=n;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(value==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
