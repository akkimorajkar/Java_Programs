package com.company;

public class Increment_Decrement {

    public static void main (String []args){

        int a = 5;
        int b = a++;
        System.out.println(a); //6
        System.out.println(b); //5

        int c = -5;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        int e = -1;
        int f = ++e;
        System.out.println(e); //0
        System.out.println(f); //0

        int g = 2;
        int h = g--;
        System.out.println(g);// 1
        System.out.println(h); // 2

        int i = 2;
        int j = --i;
        System.out.println(i);// 1
        System.out.println(j);// 1

    }

}
