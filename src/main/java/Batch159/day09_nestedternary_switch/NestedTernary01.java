package Batch159.day09_nestedternary_switch;

import java.util.Scanner;

public class NestedTernary01 {

    public static void main(String[] args) {

   /*
                Type java code by using nested ternary.
                Write a program to check if a year is "leap year" or not.
                i) If the year is divisible by 100 then it must be divisible by 400. ==> 1600+, 2000+, 1800-
                ii) If a year is not divisible by 100 then it must be divisible by 4. ==> 2004+, 1996+, 2021-
    */

        int year =2040;

        String result = year%100==0 ? (year%400==0 ? "leap year" : "not leap year") : (year%4==0 ? "leap year" : "not leap year");
        System.out.println(result);


    /*      Type code to check the password
            If it has more than 8 characters, initial should be 'i'
            If it has no more than 8 characters initial should be 'K'
            Solve the task by using nested-ternary          */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the password please");
        String password = scan.next();
        char ch = password.charAt(0);


        //1.way
        String isValid = password.length()>8 ? (ch=='i' ?  "Valid password" : "Invalid password") :  (ch=='K' ?  "Valid password" : "Invalid password");
        System.out.println(isValid);


        //2. way
        if(password.length()>8) {
            if(ch=='i') {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }
        } else {
            if(ch=='K') {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }
        }

    }
}
