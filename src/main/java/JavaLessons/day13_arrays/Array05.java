package JavaLessons.day13_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array05 {
    public static void main(String[] args) {


        // Example 1 -Write a Java program to sort a numeric array and a string array.

        String[] my_array2 = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        Arrays.sort(my_array2);

        System.out.println(Arrays.toString(my_array2));     //[C Programming, C#, C++, Java, PHP, Python]


        int[] my_array1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365};

        Arrays.sort(my_array1);

        System.out.println(Arrays.toString(my_array1));     //[1254, 1456, 1458, 1472, 1789, 1899, 2013, 2035, 2365, 2458]



//-----------------------------------------------------------------------------------------------------------------------------


// Example 2 -Write a Java program to sum values of an array

        int[] my_array3 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365};

        int sum = 0;

        for(int w: my_array3) {

            sum += w;
        }

        System.out.println("sum values of an array : " + sum);  //18199



//-----------------------------------------------------------------------------------------------------------------------------



// Example 3- Write a Java program to test if an array contains a specific value.

        int[] my_array = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365};  //contains 2035?

        int find = 2035;
        int count = 0;

        for(int w : my_array) {

            if(w==find) {
                count++;
            }
        }

        if(count>=0) {
            System.out.println("array contains " + find);
        } else {
            System.out.println("Arrays04 does not contain " + find);
        }



    }
}
