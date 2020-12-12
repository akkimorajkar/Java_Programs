package com.company;

public class Array_Numbes_Pattern {
    public static void main (String[] args){

        int ar[] = new int[40];

        for (int i = 0; i<39; i++){

            if (i<10){

                String str = "0"+i;

                ar[i] = Integer.parseInt(str);

            }
            else

            ar[i] = i;

        }

        for (Integer i : ar){

            System.out.println(i);
        }






    }

}
