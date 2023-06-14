package Others.MyPractice.P1;

import java.util.Arrays;
import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {

    	/*
	  Ask user to enter 2 Strings.
	  If the characters and the numbers of characters of the Strings are same then print "Anagram" on the console.
	  Otherwise, print "Not Anagram" on the console.
	  Ignore cases.
	  For example; "Mary" and "army" and "RAMY" are Anagrams.
	*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first String");
        String s1 = scan.next().toLowerCase();
        System.out.println("Enter the second String");
        String s2 = scan.next().toLowerCase();

        String arr1[] = s1.split("");
        Arrays.sort(arr1);
        String arr2[] = s2.split("");
        Arrays.sort(arr2);

        if (s1.length() != s2.length()) {
            System.out.println("It is not an anagram");
        } else if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("It is not an anagram");
        } else if (Arrays.equals(arr1, arr2)) {
            System.out.println("It is an anagram");
        } else {
            System.out.println("It is not an anagram");
        }






    }

}
