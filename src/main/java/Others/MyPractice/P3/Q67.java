package Others.MyPractice.P3;

import java.util.ArrayList;
import java.util.HashSet;

public class Q67 {

    public static void main(String[] args) {

  /*      * Delete the repeating numbers in the given array, except the first one, without repeating.
                Write a program that converts * to an array of numbers.
                *
  * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
  * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
  */

        //1. way

        int arr [] = {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10} ;

        ArrayList<Integer> newArr = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {

            if(!newArr.contains(arr[i])) {

                newArr.add(arr[i]);
            }
        }


        System.out.println(newArr);




//2. way

        HashSet<Integer> unrepeated = new HashSet<>();

        for( Integer w : arr) {

            unrepeated.add(w);
        }

        System.out.println(unrepeated);



    }
}
