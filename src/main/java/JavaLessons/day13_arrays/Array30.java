package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array30 {

    public static void main(String[] args) {


/* Type a program like; given an array whose length is 3, return an array with the elements "rotated left"
        For example; if the array is [1, 2, 3] output will be [2, 3, 1].

*/
        int arr[] = {1,2,3};

        int brr[] = new int[arr.length];


        brr[arr.length-1] = arr[0];


        for(int i=1; i<arr.length; i++) {

            brr[i-1] = arr[i];
        }

        System.out.println(Arrays.toString(brr));

//-----------------------------------------------------------------------------------------------



/*Find the middle element in an integer array. Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10      */


    int a[] = {12, 8, 5, 21, 13, 15, 50, 10};

    Arrays.sort(a);     //5,12,17,18

        System.out.println(Arrays.toString(a));

      int middleIndex = a.length / 2;


        if(a.length%2==1) {

            System.out.println(a[middleIndex]);
        } else {

           int middle = (a[middleIndex] + a[middleIndex-1])/2;
            System.out.println(middle);
        }


    }
}
