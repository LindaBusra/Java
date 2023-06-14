package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array17 {

    public static void main(String[] args) {




//Example 1- Create a String array and print the elements whose length is less than 5

/*Note:to get the number of characters from a String use "length()"
to get the number of characters from an Arrays04 use "length"

Short way to create an array and add elements into the array  String names [] = {"Ali", "Thomas"}; */


        String names [] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for(String w:names) {

            if(w.length()<5) {
                System.out.print(w + " ");          //Ali Mark Tom
            }
        }



//-------------------------------------------------------------------------------------------



//Example 2- Find specific element in the array. For example 45


        int num[] = {1,2,3,4,67,78,5};

        Arrays.sort(num);
        System.out.println("After sort array is : " + Arrays.toString(num));    //[1, 2, 3, 4, 5, 67, 78]


        int find = 45;

        System.out.println(Arrays.binarySearch(num,find));      //-6  It gives order number


        int find1 = -2;
        System.out.println(Arrays.binarySearch(num, find1));    //-1



//------------------------------------------------------------------



//Example 3-Create a String array and print the elements before Tom

        String students [] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for(String w: students) {

            if(w.equals("Tom")) {
                break;
            }
            System.out.print(w+ " ");
        }
        System.out.println();           //Ali Thomas Mark Jackson



//------------------------------------------------------------------



    }
}
