package com.company;

public class SumOfSeries {
    public static void main (String[] args){

        // Sum = 1 - 1/2+1/3+1/4...

        float sum = 0.0f;
        int sign = 1;

        for (int i =1; i <= 4 ; i ++){

            sum = sum + 1.0f/i*sign;

            sign = sign*-1;
        }

        System.out.println("Sum = " + sum);



    }

}
