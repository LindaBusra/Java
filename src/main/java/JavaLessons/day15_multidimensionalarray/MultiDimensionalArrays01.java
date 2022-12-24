package JavaLessons.day15_multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

    public static void main(String[] args) {



   //if an array has arrays as elements it is called "multidimensional array"

   // [  [2,3 ], [5,9], [10,7 ], [-3,8 ]     -->  //index of 7 is arr[2][1]

    int arr[][] = new int[4][2];



    //How to print a multidimensional array

        System.out.println(Arrays.deepToString(arr));   //  [ [0,0], [0,0], [0,0], [0,0] ]

    //How to assign values to multidimensional array elements

        arr[2][1] =7;
        System.out.println(Arrays.deepToString(arr));   // [[0, 0], [0, 0], [0, 7], [0, 0]]


        arr[0][0] = 2;
        arr[0][1] = 3;

        arr[1][0] = 5;
        arr[1][1] = 9;

        arr[2][0] = 10;
        arr[2][1] = 7;

        arr[3][0] = -3;
        arr[3][1] = 8;

        System.out.println(Arrays.deepToString(arr));       // [[2, 3], [5, 9], [10, 7], [-3, 8]]



//How to create multidimensional array in short way

 //     Long way:  String brr[][] = new String[3][4];      //outher array have 3 elements, inner array have 4 elements

        String brr[][] = { {"Tom","Jim"}, {"Angie"}, {"Carl", "Chris", "Ali"} };  //bu sekilde Array yaptigimizda, ic arraylerin uzunlugu farkli olabiliyor

        System.out.println(Arrays.deepToString(brr));       // [[null, null, null, null], [null, null, null, null], [null, null, null, null]]




//How to print a specific element from a multidimensional array on the console

        System.out.println(brr[2][1]);           // Chris
        System.out.println(brr[0][0]);          // Tom



//How to print a specific element from outer array
        System.out.println(Arrays.toString(brr[2]));   // to print an array we were using Arrays.toString()
                                                        // [Carl, Chris, Ali]



//-----------------------------------------------------------------------------------------




//Example : Type code to find number of elements  in a multidimensional array

        String crr[][] = { {"Tom","Jim"}, {"Angie"}, {"Carl", "Chris", "Ali"} };


        int sum = 0;

        for(String[] w : crr) {
            sum = sum + w.length;
        }
        System.out.println("Number of elements  in this multidimensional array is: " + sum);



//-----------------------------------------------------------------------------------------







    }
}
