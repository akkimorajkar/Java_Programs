package com.company;

import java.util.Scanner;

public class Reverse_Of_Array {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int ar[] = new int[11];

        for (int i =0 ; i <=10 ;i++){

            System.out.println("Enter the number");

            ar[i] = sc.nextInt();
        }
        for (int i = 11-1; i>=0; i--){

            System.out.print(ar[i]+ " ");

        }





    }

}
