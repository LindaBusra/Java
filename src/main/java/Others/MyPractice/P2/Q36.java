package Others.MyPractice.P2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q36 {

    public static void main(String[] args) {



//Example 1) Get a string from user and count all characters different from space.


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();


        str =str.replaceAll(" ", "");
        System.out.println(str.length());





//Example 2) Create a method to count all words in a string.


        countCh("This is my sentences");

    }

    public static void countCh(String str1) {

        String arr[] = str1.replaceAll(" ", "").split("");
        System.out.println(arr.length);

    }

}