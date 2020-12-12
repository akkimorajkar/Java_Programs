package com.company;


public class Array_Finding_The_Number {

    public static void main(String[] args) {

        int ar[] = new int[100]; // Size is Fixed in Static Array
                                 // Only One Type of Data can be Stored so we have Object Array for this


        for (int i = 0; i <= 99; i++) {

            ar[i] = i+1;

        }

        for (int i = 0; i <= 99; i++) {

           System.out.print(ar[i] + " ");

        }

        for (int i = 0; i <= ar.length-1; i++) {

            if(ar[i] != i+1);{

                System.out.println("The number "+ i+1 + " is missing ");

            }

        }

    }
}
