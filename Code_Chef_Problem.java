package com.company;

import java.util.Scanner;

public class Code_Chef_Problem {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextInt();
        while(T>0){
            long n=sc.nextLong();
            long k= sc.nextLong();
            long q=0;
            long days=1;
            long qLeft=0;

            while(days<=n){
                q= sc.nextLong();
                qLeft+=q;

                if(qLeft<k){
                    break;
                }

                qLeft -= k;
                ++days;

            }

            String s;
            if(days<=n){
                s= sc.nextLine();
            }else{
                days +=(qLeft/k);

            }

            System.out.println(days);
            --T;
        }
    }
}

