package Batch159.day13_dowhileloop_arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {


        // 1)Arrays are for storing multiple data in same data type.

        //How to create an Arrays04
        String stdNames [] = new String[5];             //int length = 5;
        System.out.println(Arrays.toString(stdNames));  // [null, null, null, null, null]    (container in Heap memory when we created Arrays04)

        //How to add elements into an array
        stdNames[2] = "Tom";
        stdNames[4] = "Alex";
        stdNames[0] = "Mary";
        stdNames[1] = "Jim";
        stdNames[3] = "Jhon";

        //How to print an array on the console
        System.out.println(stdNames);    //address in stack memory  [Ljava.lang.String;@7291c18f
        System.out.println(Arrays.toString(stdNames));// [Mary, Jim, Tom, Jhon, Alex]

        //How to get a specific element from an array
        System.out.println(stdNames[3]);        //Jhon

        //How to get number of elements in an array
        System.out.println(stdNames.length);            //in String length(), because we dont give the length from start
        //when I created Arrays04, I said it has 5 elements, it puts that number in (int length=5), so it is just length.

        //Example 1: Find the total number of characters used in stdNames array elements

        //1.way
        int total = 0;
        for(int i=0; i<stdNames.length; i++) {

            total += stdNames[i].length();
        }
        System.out.println("The total number of characters: " + total);


        //2.way : for-each loop --> enhanced loop
        int sum = 0;

        for(String w : stdNames) {
            sum += w.length();
        }

        System.out.println("The total number of characters: " + sum);
    }
}
