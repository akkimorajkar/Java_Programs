package com.company;

import sun.awt.AWTAccessor;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {


        ArrayList arl = new ArrayList();

        System.out.println(arl.size()); // This is physical capacity, ArraList is intialized with Virtual capacity of 10

        arl.add(100); //0  // add method to add values to ArrayList
        arl.add(200); //1

        System.out.println(arl.size()); // for array ar.length & for Arraylist we use arl.size

        arl.add(300); //2

        System.out.println(arl.size());

        arl.add(400); //3

        System.out.println(arl.size());

        arl.add('A'); //4

        arl.add("Akshay"); //5

        arl.add("44.44"); //6

        arl.add(true); //7


        System.out.println(arl.get(7)); //get method to fetch the value from particular index

        System.out.println(arl.size());

        arl.remove(5); // method to remove the value from particular index

        System.out.println(arl.size());

        System.out.println(arl.get(5));

        System.out.println(arl.size()); // Size after removal

        for (int i = 0; i < arl.size(); i++) {  // Displaying Arraylist values with For Loop

            System.out.println(arl.get(i));

        }

        for( Object ob : arl){  // Displaying Arraylist values with For Each loop

            System.out.println(ob);

        }

        /* The default capacity of ArrayList is 10 which is virtual capacity */


        ArrayList arl2 = new ArrayList(5); // Here we are initializing the Virtual capacity not the physical

        ArrayList<String> arl3 = new ArrayList<String>(); /* Arraylist declared only for String Class data

                                                           & now only String Typr data can be accepted */

        arl3.add("Akshay");
        arl3.add("Priyanka");

        for (String st : arl3) {

            System.out.println(st);

        }

        ArrayList<Object> arl4 = new ArrayList<Object>(); // To initialize ArrayList when u r not sure of the data Type


    }

}
