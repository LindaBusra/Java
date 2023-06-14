package Others.MyPractice.P1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q09 {



    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

/* Create a program checks if a String is palindrome or not.
If a word, phrase, or sequence that reads the same backward as forward then it is called "Palindrome",
For example, "madam" or "nurses run".           */



        System.out.println("Enter a text please");
        String str = scan.nextLine();
        str = str.trim().toLowerCase();


        isPalindrome(str);

        palindromeCheck();

    }


    public static void isPalindrome(String str) {

        String temp ="";

        for(int i=str.length()-1; i>=0; i--) {

            temp += str.charAt(i);
        }


        if(temp.equals(str)) {
            System.out.println("The text is palindrome.");
        } else {
            System.out.println("The text is not palindrome.");
        }

    }

    public static void palindromeCheck() {

        System.out.println("Enter a text please");
        String input = scan.nextLine();
        input = input.trim().replaceAll(" ", "");

        StringBuilder input2 = new StringBuilder(input);

        input2.reverse();

        System.out.println(input.contentEquals(input2) ? "The text is palindrome." : "The text is not palindrome.");
    }











}
