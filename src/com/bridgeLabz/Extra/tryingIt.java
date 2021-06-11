package com.bridgeLabz.Extra;

public class tryingIt {
    public static void function (int []sortedArray, int lastEle){
        int counter =0;
        int i;
        for( i= lastEle ; i<= sortedArray.length ; i++){
            if(sortedArray[i] != i){
                System.out.println("missing element"+i);
                counter++;
            }
            System.out.println(counter+" no of elements missing ");
        }
    }
    public static void main(String[] args)  {
        int[] intArray = {5,2,4,6};
        function (intArray , 6 );
    }
     /*int i = 1;
        while (i < arr.length ) {
            int diff = arr[i] - arr[i - 1];
            if (diff == 1) {
            }else{
               int  missing = diff+1;
                System.out.println("\n" + "Missing number is " + missing);
            }
            i++;
        }*/
       /* int missed = 0;
        for (int i = 0; i < arr.length; i++) {
            int missed = 0;
            int index = i + 1;
            if (arr[i] != index) {
                missed = index;
               // break;
            }
            System.out.println("\n" + "Missing number is " + missed);
    }*/
        /*for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]+1!=arr[i+1])
            {
                System.out.println( "missing "+arr[i]+1);
            }*/
       /* for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                System.out.println(i+1);
            }
        }*/
}
