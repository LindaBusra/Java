package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {




// Java Program to Check Alphabet using if else  1. way


        char c = '*';

        if( (c>='z' && c<='a') || (c>='Z' && c<='A')) {
            System.out.println(c + " is alphabet");
        } else {
            System.out.println(c + " is not alphabet");
        }



// Java Program to Check Alphabet using if else  2. way


        char ch = 'k';

        String res = Character.isAlphabetic(ch) ? (ch + " is alphabet") : (ch + " is not alphabet") ;
        System.out.println(res);





//Java Program to Check Alphabet using isAlphabetic() Method with if

        char d = 'a';

        // checks if c is an alphabet
        if (Character.isAlphabetic(d)) {
            System.out.println(d + " is an alphabet.");
        }
        else {
            System.out.println(d + " is not an alphabet.");
        }



    }
}
