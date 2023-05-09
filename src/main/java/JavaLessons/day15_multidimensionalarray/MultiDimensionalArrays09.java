package JavaLessons.day15_multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArrays09 {

    public static void main(String[] args) {


// Find the smallest positive element and greatest negative element in an integer array
//Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2


        int[] a = new int[]{-12, 18, -5, 23, -2};



        Arrays.sort(a);                // [-12 -5 -2 18 23]

        int min=a[0];
        int max = a[a.length-1];


        for( int w: a) {

            if(w>0) {

                max= Math.min(max,w);

            }

            if(w<0) {

                min = Math.max(min, w);
            }
        }

        System.out.println("max: " + max + " min " + min);


//-------------------------------------------------------------------------------------------



// Find the max element in 2 dimensional array.

        int number[][] = { {5,0}, {-5,34}, {65,22,31}};

        int max1=number[0][0];

        for(int[] w: number) {

            for(int m: w) {

                max1 = Math.max(max1,m);
            }
        }

        System.out.println("the max element in 2 dimensional array: " + max1);

    }
}
