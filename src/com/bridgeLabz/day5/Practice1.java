package com.bridgeLabz.day5;

public class Practice1 {
    public static void main(String[] args)  {

    int finalNo=0,reminder;
    int [] arr = new int [] {2, 3, 5, 10,10,7};
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements : " + sum);
        int result= sum * 10;
        int originalValue = result;
        System.out.println("result is : " + result);
        while(result>0) {
            reminder = result % 10;
            finalNo = finalNo + (reminder * reminder * reminder);
            result = result / 10;
        }
        if(finalNo==originalValue) {
            System.out.println(finalNo + " armstrong number");
        }else {
            System.out.println(finalNo + " Not armstrong number");
        }
    }
}
