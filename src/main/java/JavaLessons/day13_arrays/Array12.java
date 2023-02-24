package JavaLessons.day13_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array12 {

    public static void main(String[] args) {



//Create an array by getting array elements from user

        Scanner scan =new Scanner(System.in);
        System.out.println("How many elements will you store inside the array?");
        int aNumber = scan.nextInt();

        String list[] = new String[aNumber];

        for(int i=0; i<aNumber; i++) {

            System.out.println("Type your " + (i+1) + ". element");
            list[i] = scan.next();  // or String el =scan.Next();  sArray[i] = el;  but 1.way is better for to save memory
        }

        System.out.println(Arrays.toString(list));




    }
}
