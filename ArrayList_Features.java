package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_Features {

    public static void main (String[] args){

        ArrayList<Integer> marklist = new ArrayList<Integer>();

        marklist.add(10);
        marklist.add(20);
        marklist.add(40);
        marklist.add(30);
        marklist.add(9);

        System.out.println(marklist);

        marklist.add(2,200);

        Collections.sort(marklist);

        System.out.println(marklist);

        Collections.swap(marklist,3,4);

        System.out.println(marklist);

        //marklist.removeAll(marklist);

        //System.out.println(marklist);

        List<String> langList = Arrays.asList("Java", "Ruby", "Python", "Scala");

        System.out.println(langList);

        System.out.println(langList.size());

        List<String> colorlist = Arrays.asList("Green","Blue","Red","Yellow");

        System.out.println(colorlist);

        ArrayList<String> countrylist = new ArrayList<String>();

        countrylist.add("India");
        countrylist.add("France");
        countrylist.add("Germany");

        countrylist.addAll(colorlist);

        for (String st : countrylist){

            System.out.println(st);

            if (st == "India"){

                System.out.println("I am an Indian");
            }


        }

    }






}
