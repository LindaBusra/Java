package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array27 {

    public static void main(String[] args) {


//Moves all elements of a given 3-element array to one left position
//write a program. Sample; If array is { 1, 2, 3, 4, 5 } then the output will be [2, 3, 4, 5, 1].


        int arr[] = { 1, 2, 3, 4, 5 };

        int spare = arr[0];

        for(int i=0; i<arr.length-1; i++) {

            arr[i] =arr[i+1];       //ar[0]=2, ar[1]=3, ar[2]=4, ar[3]=5
        }

        arr[arr.length-1] = spare;

        System.out.println(Arrays.toString(arr));



//-----------------------------------------------------------------------------------------------


   /*  Find the middle element in an integer array
       Example 1: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       Example 2: (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 3         */


        int [] arry= {12, 5, 8, 21, 13, 15, 50};

        Arrays.sort(arry);
        int middleIdx= arry.length/2;  //3.5==> 3
        System.out.println(Arrays.toString(arry));//[5, 8, 12, 13, 15, 21, 50]
        System.out.println(middleIdx);

        if(arry.length % 2 !=0 ){
            System.out.println(middleIdx);
        }else {
            int middle = (arry[middleIdx] + arry[middleIdx - 1]) / 2;
            System.out.println(middle);
        }

    }
}
