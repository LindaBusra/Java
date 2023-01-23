package JavaLessons.day14_arrays_foreachloop;

import java.util.Arrays;

public class Array42 {

    public static void main(String[] args) {

        //Example 3- Type code to check if a specific element exists in an Array or not, for example 98


        int arr[]  = {250, 85, 98, 25, 88, 654, 789};


        //1.way

        int find = 98;
        int count = 0;

        for(int w: arr) {

            if(w==find) {
                count++;
            }
        }

        if(count>0) {
            System.out.println(find + " exist");
        } else {
            System.out.println(find + " does not exist");
        }


       //2.way

        Arrays.sort(arr);       //everytime we need binary first use sort() method the use binarySearch()

        int indexOfNum = Arrays.binarySearch(arr, find);

        if(indexOfNum>0) {
            System.out.println(find + " exist");
        } else {
            System.out.println(find + " does not exist");
        }



    }
}
