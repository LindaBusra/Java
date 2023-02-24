package JavaLessons.day13_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Array13 {
    public static void main(String[] args) {


 //1-Write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array
        //
        //Input :{1,2,3,4,5,6}
        //
        //element:6
        //
        //Output : [1,2,3,4,5]



// 1.way
        int arr[] = {1,2,3,4,5,6};

        ArrayList<Integer>list = new ArrayList<>();

        for(int w: arr) {

            if(w != 6) {
                list.add(w);
            }
        }

        System.out.println(list);



// 2.way
        int a[] = {1,2,3,4,5,6};
        int remove = 6;

        int b[] = new int[a.length-1];

        int j=0;
        for(int i=0; i<a.length; i++) {

            if(a[i] != 6) {

                b[j] = a[i];
            }
            j++;
        }

        System.out.println(Arrays.toString(b));














    }
}
