package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array35 {

    public static void main(String[] args) {



//to count a specific element in the array


        int arr[] = {3, 2, 3, 4, 4, 5};

        int count = 0;

        for(int i=0; i<arr.length; i++) {

            if(arr[i]==3) {

                count++;

            }

        }

        System.out.println(count);        //2


 //-------------------------------------------------------------------------------------------------------



        int arr1[] = {2, 11, 0, 23, 7};

        Arrays.sort(arr1);            //0 2 7 11 23

        for(int i=4; i>=0; i--) {

            System.out.print(arr1[i] + " ");          //23 11 7 2 0


        }



//------------------------------------------------------------------------------------------------


        int arr2[] = new int[3];   // 0, 0, 0

        System.out.println(arr2[1]);   //0


        arr2[0] = 11;          //11, 12, 0

        arr2[1] = 12;

        System.out.println(Arrays.toString(arr2));




//--------------------------------------------------------------------------------------------------


// char arr[] = new char[4];    //default element for char is nothing
//for string is null, for boolean false,
//for numeric data type-->0

        arr[0] = 'A';

        arr[2] = 'E';

        arr[3] = 'M';

        System.out.println(Arrays.toString(arr));             // [A, , E, M]


//--------------------------------------------------------------------------------------------------


        int x[] = { 3, 5, 7 };

        int a = 0;

        int b = 0;

        while (a < x.length) {

            b = b + x[a];

            a++;

        }

        System.out.println(b);




    }
}
