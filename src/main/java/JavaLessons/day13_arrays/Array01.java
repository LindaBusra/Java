package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {


    /*
    Java created Arrays structure to be able to store multiple data in it.

    When we create byte, short, int, long, float, double, char, boolean containers we can
    store just a single value in them, but sometimes we need to store multiple values in a
    single container.
    To be able to store multiply values, java created a new structure, its name is "array"

    Note:Arrays is to store multiple data in single data type. You can not store different data types in an array.

    Default element; for char is nothing, for string is null, for boolean is false, for numeric data type is 0
     */


    //How to create an Array:  (new:create from scratch)

    String names[] = new String[5];     //How many elements in array
    //To create an array, you must inform Java about the number of data you want to store in the array


    System.out.println(Arrays.toString(names));  //Print an array-->Arrays:class name, .toString() is a method

    names[0] = "Jim";
    names[1] = "Tom";
    names[2] = "Mary";
    names[3] = "Suzan";
    names[4] = "Mark";


    System.out.println(Arrays.toString(names));

    System.out.println(names[0]);   //To print a specific element in an Array



//-----------------------------------------------------------------------------------------------



//Example 1- Create an integer array and print the sum of the first and the last element on the console

int[] ages = new int[7];
System.out.println(Arrays.toString(ages));   //[0, 0, 0, 0, 0, 0, 0]

        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 25;
        ages[3] = 14;
        ages[4] = 17;
        ages[5] = 12;
        ages[6] = 14;


        System.out.println(Arrays.toString(ages));   //[12, 23, 25, 14, 17, 12, 14]

        System.out.println(ages[0] + ages[ages.length-1]);      //26







    }

}
