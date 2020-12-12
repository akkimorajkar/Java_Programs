package com.company;

public class Reverse_Of_Array_In_Same_Array {

    public static void main(String[] args){

        int ar[] = new int[11];


        for (int i = 0; i<=10; i++){

            ar[i] = i;

        }

        for (Integer i: ar) {

            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i<=10/2; i++){

            int temp = ar[10-i];

            ar[10-i] = ar[i];

            ar[i] = temp;

        }

        for (Integer i: ar) {

            System.out.println(i);
        }


    }

}
