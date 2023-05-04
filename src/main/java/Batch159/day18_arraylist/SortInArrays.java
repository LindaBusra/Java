package Batch159.day18_arraylist;

import java.util.Arrays;

public class SortInArrays {

    public static void main(String[] args) {

        char[] arr = {'b', 'e', 'a', 'd'};

        //How to sort array elements in natural order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //How to check if a special element in an array or not

        int brr[] = {12, 3, 5, 10, 2};

        //1.Step:Sort the array elements
        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));

        //2.Step:Use binarySearch() method
        int r1= Arrays.binarySearch(brr, 12); //If the output is valid index(from 0 to ...), it means the array has the element
        int r2= Arrays.binarySearch(brr, 4);   //If the element 4 exist in the array, it would be in index 2, it means order 3, so result is -3

        System.out.println(r1);
        System.out.println(r2);

    }
}
