package Batch159.day14_arrays_foreachloop;

import java.util.Arrays;
import java.util.Collections;

public class Arrays04 {
    public static void main(String[] args) {



        int[] arr = new int[4];
        System.out.println(Arrays.toString(arr));

        Integer arr1[] = {11, 12, 13, 14};

        int arr2[] = new int[] {1,2,3,4};

        Arrays.sort(arr1, Collections.reverseOrder());  //it works with non-primitive data types
        System.out.println(Arrays.toString(arr1));



        char arr4[] = new char[4];
        System.out.println(Arrays.toString(arr4));
        arr4[0] = 'A';

        arr4[2] = 'E';

        arr4[3] = 'M';

        System.out.println(Arrays.toString(arr4));





    }
}
