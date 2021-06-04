package com.bridgeLabz.day2.util2;
// Day 2 problems

public class Utility {
    //Max and Min of 5 Random numbers
    public static void randomNumber(){
        double random1 = Math.random();
        double random2 = Math.random();
        double random3 = Math.random();
        double random4 = Math.random();
        double random5 = Math.random();

        double min1 = Math.min(random1, random2);
        double min2 = Math.min(random3, min1) ;
        double min3 = Math.min(random4, min2);
        double minOfAll = Math.min(random5, min3);
        System.out.println(" Minimum is " +minOfAll);

        double max1 = Math.max(random1, random2);
        double max2 = Math.max(random3, max1) ;
        double max3 = Math.max(random4, max2);
        double maxOfAll = Math.max(random5, max3);
        System.out.println(" Maximum is " +maxOfAll);

        double avg = random1 + random2 + random3 + random4 + random5/5;
        System.out.println(" avg" +avg);
    }
    //Flip a coin and print the percentage of heads and tails
    public static void coinToss(double flips){
        int heads = 0;
        int tails = 0;
        int counter = 1;
        while (counter <= flips) {
            Math.random();
            System.out.print(counter + "\t" +  Math.random());

            if ( Math.random() < .5) {
                heads++;
                System.out.println("\t heads");
            } else {
                tails++;
                System.out.println("\t tails");
            }
            counter++;
        }
        System.out.println("Number of Heads = " + heads);
        System.out.println("Number of Tails = " + tails);
    }
    //powers of 2 that are less than or equal to 2^n
    public static void power( double exponent){
        int  i;
        long result = 1;
        for(i = 1; i <= exponent; i++)
        {
            result = result * 2;
        }
        System.out.println("\n The Final result of 2 result " + exponent + " = " + result);
    }
    //Conversion od temperature from Celsius to Fahrenheit
    public static double tempConvToF(double c){
        double value=0;
        value=((9*c)/5)+32;
        return value;
    }
    //Conversion od temperature from Fahrenheit to Celsius
    public static double tempConvToC(double f){
        double value=0;
        value= (f - 32) * 5/9;
        return value;
    }
    //trignometric operations
    public static void trignometry(double degrees){
        double radians=Math.toRadians(degrees);
        double sin = Math.sin(degrees);
        double cos = Math.cos(degrees);
        double tan = Math.tan(degrees);
        System.out.println(degrees+ "in radians" +"="+ radians+"\n" +"sin of " + degrees+ "="+ sin+"\n" +"cos of " + degrees+ "="+ cos+"\n"+"tan of " + degrees+ "="+ tan);
    }
    //Harmonic number
    public static void hValue(double n){
        double i;
        double sum=0;
        for( i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.println("Harmonic value = "+sum);
    }
    //taking t and v and prints the wind chill using formula
    public static double windChill(double t, double v) {
        double w = 0;
        if ((t < 50) || v < 120)
        {
            w = (35.74 + 0.6215 * t + (0.4275 * t - 35.75)) * Math.pow(v, 0.16);
        }
        return w;
    }
}
