package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array19 {

    public static void main(String[] args) {


//check if a specific element is the element of the array or not?  Example 12

        int arry[] = {12,23,13,2,3};

        int num = 12;

        Arrays.sort(arry);          //2,3,12,13,23
        int indexOfNum = (Arrays.binarySearch(arry,num));      //2-->index no

        if(indexOfNum>=0) {
            System.out.println(num + " is the element of the array");
        } else {
            System.out.println(num + " is not the element of the array");
        }



        //if element is not exist it gives order no of element. but if the element exist it gives index no of element



//----------------------------------------------------------------------------------------------------



//check if a specific element is the element of the array or not?  Example 5

        int[] a = {12,23,12,2,3};

        Arrays.sort(a);         ////2,3,12,13,23
        int num1 = 5;

        int index = (Arrays.binarySearch(a, num1));       //-3  it gives order no for the elements don't exist

        if(index>=0) {
            System.out.println(num1 + " is the element of the array");
        } else {
            System.out.println(num1 + " is not the element of the array");
        }



    }
}
