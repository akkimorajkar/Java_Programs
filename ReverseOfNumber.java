package com.company;

import java.util.Scanner;

public class ReverseOfNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");

        float n = sc.nextFloat();

        float rev = 0.0f;

        for (float i = n ; i !=0 ; i = i/10){

            rev = rev*10 + i %10;

        }

        System.out.println("Reverse = " + rev );


    }
}
