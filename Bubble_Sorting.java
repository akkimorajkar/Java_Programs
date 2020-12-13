package com.company;

import java.util.Scanner;

public class Bubble_Sorting {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int ar[] =new int[11];

        System.out.println("Enter the numbers u want to start");

        for (int i = 0; i<=10; i++){

            ar[i] = sc.nextInt();

        }

        for (int i = 0; i<=ar.length-2; i++) {

            for (int j = 0; j < ar.length - 2; j++) {

                if (ar[j] > ar[j + 1]) {

                    int temp = ar[j];

                    ar[j] = ar[j + 1];

                    ar[j + 1] = temp;

                }


            }
        }

        System.out.println();

        for (Integer ie : ar){

            System.out.println(ie);
        }

    }

}
