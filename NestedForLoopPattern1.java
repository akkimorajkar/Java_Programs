package com.company;

import java.util.Scanner;

public class NestedForLoopPattern1 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines");

        int n = sc.nextInt();

        for (int i = 1; i <= n/2 ; i++){

            for (int j = 1 ; j <= n/2-i ; j++){

                System.out.print(" ");
            }

            for (int k = 1 ; k<=i ; k++){

                System.out.print(k);

            }

            for (int l = i-1 ; l>=1 ; l--){

                System.out.print(l);

            }

            System.out.println();
        }


    }

}
