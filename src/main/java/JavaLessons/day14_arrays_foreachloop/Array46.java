package JavaLessons.day14_arrays_foreachloop;

import java.util.Arrays;

public class Array46 {
    public static void main(String[] args) {



        //Example :Type code to check if a specific element exist in the array or not


        String str[] = {"Ali", "Tom", "Carl" , "Angie"};


        //1. way

        String name = "Carl";
        int count = 0;

        for(String w: str) {
            if(w.equals(name)) {
                count++;
            }
        }

        if(count>0) {
            System.out.println(name + " exist in the sentence");
        } else {
            System.out.println(name + " does not exist in the sentence");
        }


        /* 2.way ->We will use binarySearch() method
                -If the element exist binarySearch() method returns the index of the element*/

        Arrays.sort(str);
        int index = Arrays.binarySearch(str, "Carl");
        System.out.println(index);

        if(index>=0) {
            System.out.println("it exists");
        } else {
            System.out.println("it does not exists");
        }
    }
}
