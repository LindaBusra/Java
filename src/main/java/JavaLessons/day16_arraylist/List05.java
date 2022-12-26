package JavaLessons.day16_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List05 {
    public static void main(String[] args) {


//Example 1: Increase the value of every element by 3, except 7


        ArrayList<Integer> a = new ArrayList<>();
        a.add(11);
        a.add(31);
        a.add(22);
        a.add(7);
        a.add(15);


    for(Integer w:a) {
        if(w==7) {
            continue;
        }

        a.set(a.indexOf(w),w+3);        //bu kismin index no olmasi lazim=a.indexOf(w)
    }
        System.out.println(a);          // [14, 34, 25, 7, 18]



//-------------------------------------------------------------------------------------------------


 //Example -Convert all elements to "*" except the last 4 elements

 ArrayList<String> b = new ArrayList<>();

        b.add("11");
        b.add("31");
        b.add("22");
        b.add("17");
        b.add("15");
        b.add("34");
        b.add("21");
        b.add("67");


    for(int i=0; i<b.size(); i++) {

        if(i==(b.size()-4) || b.size()<5) {
            break;
        }
        b.set(i,"*");
}

        System.out.println(b);      //[*, *, *, *, 15, 34, 21, 67]


//or

//        for(int i=0; i<b.size()-4; i++) {
//
//
//            b.set(i,"*");
//        }
//
//        System.out.println(b);      //[*, *, *, *, 15, 34, 21, 67]







//-----------------------------------------------------------------------------------------










    }
}
