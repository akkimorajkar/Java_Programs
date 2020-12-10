package com.company;

import java.util.Scanner;

public class Continue_Statement_Example {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n;

        for (int i = 1 ; i <= 10 ; i++){

            n = sc.nextInt();

            if (n>99){

                System.out.println("Number is greater than 99");

                i--;

                continue;

            }

            int sum = n;

            if (i>0){


                sum += n;

                System.out.println(sum);

            }

        }





    }
}
