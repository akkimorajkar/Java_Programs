package com.company;

import java.util.Scanner;

public class Finding_Element_Display_Index {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number u want to Search");

        int n = sc.nextInt();

        int ar[] =new int[11];

        for (int i = 0; i<=10; i++){

            ar[i] = i+1;

        }

        int j;

        for ( j =0; j<=10; j++) {

            if(ar[j] == n){

                System.out.println("The index of number is " + j );

                break;

            }


        }

        if (j > 10){

            System.out.println("The number is not present");
        }



    }

}
