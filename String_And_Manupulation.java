package com.company;

import java.util.Scanner;

public class String_And_Manupulation {

    public static void main (String[] args) {

        String str = "This is my Java Code & I am so happy about it"; //String Length starts from index 0

        System.out.println(str.length()); // Ans = 45

        System.out.println(str.charAt(0)); // Character at index position

        System.out.println(str.charAt(44)); // Index Out ofBound Exception

        System.out.println(str.indexOf("T")); // 1st occurence of T

        System.out.println(str.indexOf("t",3)); // Giving the index value > then the first occurence of t'this metod is case sensitive

        System.out.println(str.indexOf("s", str.indexOf("s")+1));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the user name ");

        String username = sc.nextLine();

        String str2 = "Welcome"+ username;

        if(str2.indexOf(username)> 0){

            System.out.println("The user ");

            System.out.println("This is new Branch created Locally named as Brnach_Locally ");

        }

    }
}
