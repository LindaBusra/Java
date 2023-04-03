package JavaLessons.day05_concatenation_modulus_nestedternary;

import java.util.Scanner;

public class NestedTernary07 {
    public static void main(String[] args) {


/*
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
         */

        int year = 2004;
        //(Condition)    ?             (Ternary 1)                       :                  (Ternary 2);
        String isLeapYear = (year % 100 == 0) ? (year % 400 == 0 ? "Leap year" : "Not leap year") : (year % 4 == 0 ? "Leap year" : "Not leap year");
        System.out.println(isLeapYear);



//----------------------------------------------------------------------------------------------------------



        //Ask user to enter a String. If the String has 2 characters, output will be
        //“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an abbreviations");
        String ch = scan.next();

        System.out.println((ch.length() == 2) ? "It is valid for state abbreviations" : "It is not valid for state abbreviations");

    }
}
