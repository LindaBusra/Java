package Batch159.day14_arrays_foreachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

// 1)Arrays04 can contain just "primitive" data types and "references"

        //Example 1: Create an integer array with 4 elements, then find the sum of all elements

        Integer nums [] = new Integer[4];
        System.out.println(Arrays.toString(nums));  // for Wrapper class, java gives as default [null, null, null, null]

        int arr[] = new int[4];
        System.out.println(Arrays.toString(arr));   // [0, 0, 0, 0]

        nums[0] = 12;
        nums[1] = 8;
        nums[2] = 10;
        nums[3] = 7;

        int sum = 0;

        for( int w : arr) {
            sum += w;
        }

        System.out.println("the sum of all elements:" +  sum);



        //Example 2: Create a String array with the length 5, print the elements whose length is more than 6 on the console.

        String [] cities = new String[5];
        System.out.println(Arrays.toString(cities));    //[null, null, null, null, null]

        cities[0] = "Miami";
        cities[1] = "New York";
        cities[2] = "Jacksonville";
        cities[3] = "California";
        cities[4] = "Tampa";

        for(String w: cities) {

            if(w.length()>6){
                System.out.println(w);
            }
        }
        System.out.println("\n");



        //Example 3: Create a String array with the length 5, print the elements before "California" on the console.

        String [] city = new String[5];
        System.out.println(Arrays.toString(city));    //[null, null, null, null, null]

        city[0] = "Miami";
        city[1] = "New York";
        city[2] = "Jacksonville";
        city[3] = "California";
        city[4] = "Tampa";
        for(String w: city) {

            if(w.equals("California")) {
                break;
            } else {
                System.out.println(w);
            }
        }
        System.out.println();



        //Example 4: Create a String array with the length 5, print the elements exclusive "California" on the console.

        for(String w: city) {

            System.out.println(w);
            if(w.equals("California")) {
                break;
            }
        }
        System.out.println();




        //Example 5: Create a String array with the length 5, print the elements except "California" and "Miami" on the console.

        for(String w: city) {

            if(w.equals("California") || w.equals("Miami")) {
                continue;           //skip these elements
            }
            System.out.println(w);
        }


    }
}
