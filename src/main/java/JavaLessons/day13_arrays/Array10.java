package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array10 {
    static int a = 11;

    public static void main(String[] args) {


        int arr[] =new int[4]; //to create a new array   [0,0,0,0]
        arr[0]=11; arr[1]=12; arr[2]=13; arr[3]=14;        //1.way

        // 2. way   int arr[] = {11,12,13,14};
        System.out.println(Arrays.toString(arr));



//------------------------------------------------------------------


        int x[] = { 3, 5, 7 };

        int a = 0;

        int b = 0;

        while (a < x.length) {

            b = b + x[a];       //b=3, a=1    3+5=8  a=2,   8+7

            a++;

        }

        System.out.println(b);      //15


//--------------------------------------------------------------------------------


//prints the greatest element

        int arr1[] = {2, 11, 0, 23, 7};
        Arrays.sort(arr1);

        System.out.print(arr1[arr1.length-1]);      //23


//--------------------------------------------------------------------------------




//       Note: If you type the name of the array in method parenthesis of Arrays.sort(), the array
//       elements will be sorted in ascending order.

        char arrCh[] = {'a', 'C', 'c', 'A', 'b'};

        Arrays.sort(arrCh);

        System.out.println(Arrays.toString(arrCh));     //A C a b c



    }
}



























