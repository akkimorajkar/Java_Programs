package com.company;

import java.util.Scanner;

public class ReverseOfString {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");

        String str = sc.nextLine();

        char ch[] = str.toCharArray();

        String rev = "";

        for (int i = ch.length-1 ; i>=0 ; i--){

            rev +=ch[i];

        }

        float ReverseNumber = Float.parseFloat(rev);

        float add = ReverseNumber + 10.1f;

        System.out.println(add);


    }

}
