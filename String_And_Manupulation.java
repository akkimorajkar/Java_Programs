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

        System.out.println(str.indexOf("s", str.indexOf("s")+1)); // 2nd Ocurrence of s

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the user name ");

        String username = sc.nextLine();

        String str2 = "Welcome "+ username;

        if(str2.indexOf(username)> 0){

            System.out.println(str2);

           // System.out.println("This is new Branch created Locally named as Brnach_Locally ");

        }

        String str3 = "   Hello World   ";

        System.out.println(str3.trim()); // Trim Method for String

        System.out.println(str3.trim().replace(" ","_"));

        String value_date = "29/01/1993";

        System.out.println(value_date.replace("/",".")); //Replace Method for string

        String account_name = "Akshay_Morajkar";

        String Account_Name[] = account_name.split("_"); //Split Method for String

        System.out.println("AccountName =" + Account_Name[0]);

        System.out.println("LastName =" + Account_Name[1]);

        String tranId = "your Transaction id is 987456";

        System.out.println(tranId.substring(tranId.indexOf("is")+3, tranId.length())); //Substring Method to segregate a part of String


    }
}
