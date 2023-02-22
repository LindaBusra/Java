package JavaLessons.day13_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Array06 {
    public static void main(String[] args) {


///  If a list has 15 or 13, remove them.
//Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(31);
        list.add(15);
        list.add(13);
        list.add(54);

        ArrayList<Integer> newList = new ArrayList<>();

        for(int w:list){

            if(w==15 || w==13) {

                continue;
            }
            newList.add(w);
        }

        System.out.println(newList);


//---------------------------------------------------------------------------------------


// Example -Print the elements of the array on the console


        String array[] = { "Ron", "Harry", "Hermoine" };

        for(int i=0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }


//-------------------------------------------------------------------------------------------


//Java Program to Find the Middle Element of an Array

        //Original array
        int arr[] = {12, 22, 34, 22, 54, 6, 52, 8, 9, 34, 54, 68,10,20,30};
        // Printing the array
        System.out.println("The array elements are : "+ Arrays.toString(arr));
        int startIndex = 0, lastIndex = arr.length - 1;
        // Setting the mid index
        int midIndex = startIndex + (lastIndex-startIndex)/2;
        System.out.println("The mid index is "+midIndex+" and the element at mid is "+arr[midIndex]);


    }
}
