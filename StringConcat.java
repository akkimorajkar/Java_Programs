package com.company;

public class StringConcat {

    public static void main(String[] args){

        String x = "Hello";

        String y = "World";

        int a = 100;
        int b = 200;

        double c = 12.33;
        double d = 23.44;

        System.out.println(a+b+x+y); // Output : 300HelloWorld

        System.out.println(x+y+a+b); // Output : HelloWorld100200

        System.out.println(x+y+(a+b)); // Output : HelloWorld300

        System.out.println(a+b); //Output : 300

        System.out.println(20/4); //Output : 5

        System.out.println(20/3); //Output : 6

        System.out.println(20/3.0); //Output : 6.666666666666667


    }

}
