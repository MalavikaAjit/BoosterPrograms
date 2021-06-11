package com.bridgeLabz.Extra;

public class armstrongNo {
    public static void main(String[] args)  {
        int finalNo=0,reminder,value;
        int number=153;
        value=number;
        while(number>0)
        {
            reminder=number%10;
            finalNo=finalNo+(reminder*reminder*reminder);
            number=number/10;

        }
        if(value==finalNo)
            System.out.println(" is armstrong number");
        else
            System.out.println(" is Not armstrong number");
    }
}
