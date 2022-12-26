package JavaLessons.day16_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class List07 {
    public static void main(String[] args) {


        //Find the smallest positive integer and greatest negative integer in a given integer list

        ArrayList<Integer> list = new ArrayList<>();

        list.add(-5);
        list.add(8);
        list.add(10);
        list.add(-9);
        list.add(-11);
        list.add(3);

        System.out.println(list);       //before [-5, 8, 10, -9, -11, 3]

        Collections.sort(list);
        System.out.println(list);       //after [-11, -9, -5, 3, 8, 10]

        int negative = list.get(0);
        int positive =list.get(list.size()-1);



        for(Integer w: list) {

            if(w>0) {
                positive =  Math.min(positive, w);
            }

            if(w<0) {
                negative =  Math.max(negative, w);
            }


        }


        System.out.println("smallest positive integer:" + positive + " and greatest negative integer:" + negative);

    }
}
