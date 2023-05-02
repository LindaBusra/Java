package Batch159.day17_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList02 {

    public static void main(String[] args) {


        //Type code to find the closest values in an Integer list
        /// [12, 31, 15, 32, 54] --> 31 and 32

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(31);
        ages.add(15);
        ages.add(32);
        ages.add(54);

        System.out.println("ages: " + ages);
        Collections.sort(ages);
        System.out.println("sorted ages: " + ages);


        int minDiff =  ages.get(1)-ages.get(0);

        for(int i=1; i<ages.size(); i++) {

            minDiff = Math.min(minDiff, ages.get(i)-ages.get(i-1));
        }

        System.out.println("min difference:" + minDiff);


        //find the closest values
        for(int i=1; i<ages.size(); i++) {
            if(minDiff == ages.get(i)-ages.get(i-1)) {
                System.out.println(ages.get(i-1) + " " + ages.get(i));
            }
        }
    }
}
