package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array29 {
    public static void main(String[] args) {



// Example 1- Write a Java program to test if an array contains a specific value.
        String[] vowels = {"A", "I", "E", "O", "U"};


        String ch = "A";

        for(String w:vowels) {

            if (w.equals(ch)) {

                System.out.println(ch +" found in the vowels list.");
            }
        }



//-----------------------------------------------------------------------------------------------------------------------------

//Example 2- Write a Java program to copy an array by iterating the array

        int[] my_array4 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int[] newArray = new int[my_array4.length];

        for(int i=0; i<my_array4.length; i++) {

            newArray[i] = my_array4[i];
        }

        System.out.println(Arrays.toString(newArray));



//-----------------------------------------------------------------------------------------------------------------------------


//Example 3- Write a Java program to copy an array by iterating the array

        int[] my_array5 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] new_array = new int[10];

        for(int i=0; i<my_array5.length; i++) {

            new_array[i] = my_array5[i];
        }

        System.out.println(Arrays.toString(new_array));




    }
}
