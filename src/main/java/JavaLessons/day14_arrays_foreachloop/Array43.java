package JavaLessons.day14_arrays_foreachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Array43 {

    public static void main(String[] args) {


//Example 1- Type code to print the sum of minimum and max integers in on Arrays04

        int[] arr = {12,56,89,5,34,92};


        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length-1];

        System.out.println("The min: " + min + " "  + " the max:" + max);

        System.out.println("the sum of minimum and max integers is " + (min + max));


//-------------------------------------------------------------------------------------------------


//Example 2- Get string from user and type code to find the number of words in the String
        //String str = {Learn Java earn money}


        Scanner scan = new Scanner(System.in);
        System.out.println("Type a string please");
        String str = scan.nextLine();

        String newStr[] = str.split(" ");

        System.out.println("The total number of words are " + newStr.length);


    }
}
