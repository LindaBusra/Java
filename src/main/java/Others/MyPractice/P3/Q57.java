package Others.MyPractice.P3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q57 {

    public static void main(String[] args) {


                /*
        CHALLENGE: Using array A and array B, return an array that is the intersection of both A and B.
        The intersection includes numbers that appear in both arrays.
            arrayIntersection([1, 3, 5], [1, 5, 7]) → [1, 5]
            arrayIntersection([1], [1, 5, 7]) → [1]
            arrayIntersection([1, 1, 1], [1, 5, 7]) → [1]
            arrayIntersection([], []) → []
        */



        List<Integer> arr1 = Arrays.asList(1, 3, 5);

        List<Integer> arr2 = Arrays.asList(1, 5, 7);

        List<Integer> arr3 = new ArrayList<>();

        for(int w:arr1) {

            for( int k: arr2) {


                if(w==k  && !arr3.contains(w)) {

                    arr3.add(w);
                }
            }
        }

        System.out.println(arr3);
    }
}
