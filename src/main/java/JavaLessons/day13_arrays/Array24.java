package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array24 {

    public static void main(String[] args) {


// Type a code to print all elements of an array in reverse order by putting "*" before each of them on the same line


        int[] arr = {1, 4, 5, 7, 8};

        Arrays.sort(arr);
        for (int k = arr.length - 1; k >= 0; k--) {

            System.out.print("*" + arr[k]);
        }

        System.out.println();

//---------------------------------------------------------------------------------


//Type code to print the elements whose indexes are even numbers.


        int[] arr2 = {1, 4, 5, 7, 8, 12, 20};


        for (int j = 0; j < arr2.length; j++) {

            if (j % 2 == 0) {

                System.out.print(arr2[j] + " ");
            }
        }


    }}