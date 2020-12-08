package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditional_Operator {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String Akshay_marks = br.readLine();
        int AkshayMarks = Integer.parseInt(Akshay_marks);

        String Sushil_marks = br.readLine();
        int SushilMarks = Integer.parseInt(Sushil_marks);

        String Srishti_marks = br.readLine();
        int SrishtiMarks = Integer.parseInt(Srishti_marks);

        int Higest_Scorrer = (AkshayMarks > SushilMarks)? ((AkshayMarks > SrishtiMarks)? AkshayMarks: SrishtiMarks ):((SushilMarks >SrishtiMarks)? SushilMarks:SrishtiMarks);

        System.out.println("The Highest Score is "+ Higest_Scorrer);

    }
}
