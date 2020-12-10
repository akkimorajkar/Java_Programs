package com.company;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main (String[] args){

        double multinumber = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Number = ");

        int n = sc.nextInt();

        for(int i = n; i !=0; i/=10){

            int indi = i%10;

             multinumber += Math.pow(indi,3);

            System.out.println(multinumber);
        }

        System.out.println(multinumber);

        if (multinumber == n){

            System.out.println("Number is Armstrong number");
        }



    }

}
