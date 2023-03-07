package JavaLessons.day16_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List12 {
    public static void main(String[] args) {




 /*  Question 1) Find the sum of the least and the greatest price given in a String List.
Example: List<String> myList= new List<String>{"$12.99", "$8.25", "$23.60", "$54.45"}; ==> 62.70

 */

        List<String> myList= Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");

        List<Double> newList= new ArrayList<>();


        for(String w: myList) {

            w=w.replace("$", "");
            double a = Double.valueOf(w);
            newList.add(a);

        }

        Collections.sort(newList);

        System.out.println( newList.get(0) + newList.get(newList.size()-1) );



//------------------------------------------------------------------------------------------------------



// Question 2) If a list has 15 or 13, remove them.
//Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)


        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(31);
        l.add(15);
        l.add(13);
        l.add(54);
        System.out.println(l);

        List<Integer> k = new ArrayList<>();



        for (int w : l) {
            if ( !(w == 15 || w == 13)) {

                k.add(w);
            }
        }
        System.out.println(k);

    }
}
