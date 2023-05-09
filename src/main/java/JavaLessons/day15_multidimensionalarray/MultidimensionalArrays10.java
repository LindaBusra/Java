package JavaLessons.day15_multidimensionalarray;

import java.util.Arrays;

public class MultidimensionalArrays10 {
    public static void main(String[] args) {



//if you use arrays as elements in an array then it is called "multidimensional array"

//How to create multidimensional array

 int mda1[][] = new int[3][2];       //[ [11,9], [5,4], [1,21] ]   //3 element, her biri 2li:inner part


//in this syntax, inner ones must have same length.

//How to print m. array on the console

        System.out.println(Arrays.deepToString(mda1));   //I did not assigned any value. [[0, 0], [0, 0], [0, 0]]

//How to assign values

        mda1[0][0]=11;
        mda1[0][1]=9;

        mda1[1][0]=5;
        mda1[1][1]=4;

        mda1[2][0]=1;
        mda1[2][1]=21;

        System.out.println( Arrays.deepToString(mda1));



//How to create multidimensional array in short way

int mda2[][] = { {2,3}, {12}, {21,34,56}, {4}}   ;

        System.out.println(Arrays.deepToString(mda2));




//How to print a specific inner array on the console

        System.out.println(Arrays.toString(mda2[2]));           //[21, 34, 56]



//How to find the number of elements in a multidimensional array.  //Example:{ {2,3}, {12}, {21,34,56}, {4}}

//for-each

        int mda3[][] = { {2,3}, {12}, {21,34,56}, {4}}   ;

        int sum = 0;

        for(int w[]: mda3) {

            sum += w.length;

        }
        System.out.println("the number of elements in a multidimensional array: " + sum);




//------------------------------------------------------------------------------------------------




//Print the elements which have "a" from a 2 dimensional String array.


        String arr1[][]     = { {"learn", "java", "it"}, {"is", "easy"} };


        for(String w[] : arr1) {

            for(String m: w) {

                if(m.contains("a")) {

                    System.out.print(m + " ");
                }
            }
        }




    }
}
