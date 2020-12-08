package com.company;

public class ValueOfSeries {

    public static void main (String[] args){

        //Program to print Sum = 1/1! + 1/2! + 1/3! + 1/4!....

        int factorial = 1;
        float sum = 0;

        for (int i = 1; i <= 10; i ++){

            factorial *= i ;

            sum += 1.0f/factorial;
        }

        System.out.println(sum);
    }

}
