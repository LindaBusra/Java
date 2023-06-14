package Others.MyPractice.P3;

import java.util.*;

public class Q61 {

    public static void main(String[] args) {


        /*
       Crteate a program checks if a String is PALINDROME or not.
       If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
       For Example : "madam" or "nursesrun" .
     */



        isPalindrome01("nursesrun");        //by using for loop

        isPalindrome02("nursesrun");        //by using StringBuilder



    }



    public static void isPalindrome01(String str) {

        String temp = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            temp += str.charAt(i);
        }

        if (temp.equals(str)) {

            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

    }


    public static void isPalindrome02(String str) {

        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2= sb.reverse();

        if(sb.equals(sb2)) {
            System.out.println("String is Palindrome");
        } else {
        System.out.println("String is not Palindrome");
        }
    }



}