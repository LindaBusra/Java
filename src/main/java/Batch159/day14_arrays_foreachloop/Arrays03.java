package Batch159.day14_arrays_foreachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

            /*
    Assume that we have an array of positive integers from m to n which includes all odd numbers from m to n except one.
    Write a function that finds the missing odd number in the list.
    Example: Input [1,3,5,7,9,13,15,17] -->Output: 11,      Input [9,7,3] -->Output: 5
     */

        int arr[] = new int[]{1, 3, 5, 7, 9, 13, 15, 17};

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - arr[i - 1] == 4) {
                System.out.println(arr[i - 1] + 2);
            }

        }

    }
}