package JavaLessons.day15_multidimensionalarray;

import java.util.Arrays;

public class MultidimensionalArrays05 {

    public static void main(String[] args) {



// Find the max element in 2 dimensional array.

        int number[][] = { {5,0}, {-5,34}, {65,22,31}};

        int x = Integer.MIN_VALUE;

        for(int[] out : number) {           //burasi {5,0}, {-5,34}, {65,22,31} bunlara bakar

            for(int in : out) {     //burasi  5,0 , -5, -34, 65, 22, 31'e bakar

                if(x<in) {
                    x= in;
                }
            }
        }

        System.out.println(x);



//-------------------------------------------------------------------------------



//Example: set all elements to 1           ////[[1, 1], [1, 1], [1, 1, 1]]

    int a[][] = { {5,0}, {-2,4}, {65,-12,230}};



    for(int i=0; i<a.length; i++) {

        for(int j=0; j<a[i].length; j++) {

            a[i][j] =1;
        }
    }

        System.out.println(Arrays.deepToString(a));

    }
}
