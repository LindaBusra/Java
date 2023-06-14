package Others.MyPractice.P4;

import java.util.Arrays;

public class Q72 {
    public static void main(String[] args) {

    /*      How many times a given number is repeated in a sequence
            Create the Java program that finds it.  */



            int arr[] = {1, 1, 1, 22, 23, 85, 58, 77, 66, 22, 23, 77};


            int num = 1;
            int count = 0;

            for(int w : arr) {

                if(w==num) {
                    count++;
                }
            }

        System.out.println("There is " + count + " times from number " + num);



        // Clear repeated element from array

        int arrayDeduplication[]={8, 13, 13, 9, 11, 12};
        int filteredArray[]= Arrays.stream(arrayDeduplication).distinct().toArray();
        System.out.println(Arrays.toString(filteredArray));
    }
}
