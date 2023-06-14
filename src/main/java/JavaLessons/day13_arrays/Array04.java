package JavaLessons.day13_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {



//Split an array with a specific character or word

        String st1= "I like to move it move it";

        String st2[] = st1.split("it");
        System.out.println(Arrays.toString(st2));       // [I like to move ,  move ]



//----------------------------------------------------------------------------------------------


//To print Arrays04


        int arr[]={2,11,45,9};

        for(int w: arr) {

            System.out.print(w + " ");      //2 11 45 9
        }


        //or

        int i =0;

        while(i<arr.length)   {

            System.out.print(arr[i] + " ");     //2 11 45 9
            i++;
        }



//----------------------------------------------------------------------------------------------



// Check if tge given array is equal to other givens array

        int[] ary1 = {1,2,3};
        int[] ary2 = {1,2,3};

        boolean isEqual = Arrays.equals(ary1,ary2);     //equals check just the data, == check data and referances
        System.out.println(isEqual);            //true
        System.out.println();




    }
}