package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array03 {


    public static void main(String[] args) {



// Example-   [0, 2, 3, 0, 12, 0] put the zeros to the end in the array

        int[] numbers = {0,2,3,0,12,0};


        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));       //[0, 0, 0, 2, 3, 12]

        int[] nyNumber = new int[numbers.length];           //create a new array
        int j = 0;

        for(int i= numbers.length-1; i>=0; i--) {

            nyNumber[j] = numbers[i];
            j++;
        }

        System.out.println(Arrays.toString(nyNumber));      //[12, 3, 2, 0, 0, 0]




//-------------------------------------------------------------------------------------------------------



// Example 2: Type code to check if a specific element exists in an array or not
//int crr[] = {-12, 23, 5}; check if 23 exists in the array or not

        int crr[] = {-12, 23, 5};

        int exist = 23;
        int counter = 0;

        for(int w:crr) {

            if(w==exist) {
                counter++;
            }
        }

        if(counter>=0) {
            System.out.println(exist + " exists in array");
        } else {
            System.out.println(exist + " does not exist in array");
        }



    }

}
