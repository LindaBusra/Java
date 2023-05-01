package Batch159.day15_multidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    public static void main(String[] args) {


    //How to create multidimensional array

        int [][] a = new int[3][2];   //I have to declare number of elements

    //Arrays.toString(a) is to print one dimensional arrays
        System.out.println(Arrays.toString(a));     //[[I@7291c18f, [I@34a245ab, [I@7cc355be]   address of 1., 2. og 3. inner
    //Arrays.deepToString(a) is to print multidimensional arrays
        System.out.println(Arrays.deepToString(a)); //[[0, 0], [0, 0], [0, 0]]

    //How to add elements into a multidimensional array
    a[0][0]=8;
    a[0][1]=10;
    a[1][0]=7;
    a[1][1]=5;
    a[2][0]=11;
    a[2][1]=3;

        System.out.println(Arrays.deepToString(a));     //[[8, 10], [7, 5], [11, 3]]

    //How to create s multidimensional array in short way, we can make the number of inner elements different
    int [][] b = {{9,12,3}, {5,4},{8},{10,6}};
        System.out.println(Arrays.deepToString(b));



    //Example 1: Create a multidimensional array and find the sum of all elements in the multidimensional array

        int [][] c = {{4,5}, {9,11,6}};


        int sum = 0;
        for(int i=0; i<c.length; i++) {

            for(int j=0; j<c[i].length; j++){

                sum += c[i][j];
            }
        }
        System.out.println("The sum of all elements : " + sum);



        //2nd way

        sum = 0;
        for(int[] w: c) {

            for(int u : w) {

                sum += u;

            }
        }
        System.out.println("The sum of all elements : " + sum);


        //Example 2: Type code to find the total number of elements in a multidimensional array

        String [][] names = { {"Tom"}, {"Jim", "Ali"}, {"Mark", "Jack", "Bred"}};

        int total = 0;
        for (int i=0; i<names.length; i++) {

            total += names[i].length;
        }
        System.out.println("the total number of elements: " + total);


        //2nd way:
        total = 0;

        for(String[] w : names) {

            total += w.length;
        }
        System.out.println("the total number of elements: " + total);


    }  }