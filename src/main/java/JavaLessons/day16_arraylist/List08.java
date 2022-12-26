package JavaLessons.day16_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class List08 {

    public static void main(String[] args) {




//Find the closest to integer in the given list
        ArrayList<Integer> a  = new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(16);
        a.add(21);

        System.out.println(a);      //[12, 15, 16, 21]

        //How to sort list elements;
        Collections.sort(a);            //they will be in ascending order
        System.out.println(a);      //[12, 15, 16, 21]

        //How to get min difference
        int minDiff = Integer.MAX_VALUE;

        for(int i=1; i<a.size(); i++){              //start from i=1, because substraction
            minDiff = Math.min(minDiff, a.get(i) - a.get(i-1));
        }

        System.out.println(minDiff);


        for(int i=1; i<a.size(); i++){
            if(a.get(i) - a.get(i-1) == minDiff){
                System.out.println(a.get(i) + " and " +  a.get(i-1));
            }
        }


    }
}
