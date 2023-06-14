package Others.MyPractice.P3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q53 {


    public static void main(String[] args) {


                    /*
        Given an integer array, return the array with all of the duplicate values removed.
        arrayDeduplication([8, 13, 13, 9, 11, 12]) → [8, 13, 9, 11, 12]
        arrayDeduplication([]) → []
        arrayDeduplication([1, 1, 1]) → [1]
        */


        //1.way


        int arr[]={8, 13, 13, 9, 11, 12};
        int filteredArray[]=Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(filteredArray));




        //2.way
        int arr1[] = {8, 13, 13, 9, 11, 12};

        List<Integer> list = new ArrayList<>();


        for (int w : arr1) {

            if (!list.contains(w)) {

                list.add(w);

            }

        }
        System.out.println(list);





    }}