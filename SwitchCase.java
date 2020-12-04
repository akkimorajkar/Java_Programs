package com.company;

public class SwitchCase {

    public static void main (String[] args){


        String student_name = "Parag";

        int marks = -1;

        switch (student_name){

            case "Akshay" :

                marks = 90;
                System.out.println("Student "+ student_name + " got Marks = "+ marks);
                break;
            case "Sushil" :
                marks = 80;
                System.out.println("Student "+ student_name + " got Marks = "+ marks);
                break;
            default:
                System.out.println("Please pass the Correct Student Name. " + student_name+ " is invalid");
                break;

        }


    }

}
