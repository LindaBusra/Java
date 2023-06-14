package JavaLessons.day28_collections;

import java.util.*;

public class Practice03 {

    public static void main(String[] args) {


// Java code to find the maximum and minimum in HashSet


        HashSet<Integer> set = new HashSet<>();


        set.add(10);
        set.add(20);
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(40);


        System.out.println("Maximum value of HashSet : " + Collections.max(set));

        System.out.println("Minimum value of HashSet : " + Collections.min(set));





// To find max and min element in this array with help HashSet


        int numbers []= {1, -5, 2, 4, 7, -6};


        HashSet<Integer> nums = new HashSet<>();

        for(int w:numbers) {
            nums.add(w);
        }
        System.out.println(nums);

        System.out.println("max:" + Collections.max(nums) + ", min:"  + Collections.min(nums));





    }
}
