package JavaLessons.day16_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List11 {
    public static void main(String[] args) {



//)Question 01- By using set() method, convert E to D.
//List elements should be like A, B, C, D, and F. Print it on the console

        List<String> e = new ArrayList<>();
        e.add ("A");
        e.add("B");
        e.add("C");
        e.add("D");
        e.add("E");

        String newCh = "F";
        e.set(e.indexOf("E"), newCh);
        System.out.println(e);



//---------------------------------------------------------------------------------------------------------



//Question-02 - If the list has 15 as element, change all 15s to 51
//   Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)


    List<Integer> list = Arrays.asList(12, 11, 15, 34, 15, 15, 43, 15);

    if(list.contains(15)) {

        for(int w:list) {
             if(w==15) {
                 list.set(list.indexOf(15), 51);
             }
        }
    } else {
        System.out.println("List does not contain the expected elements");
    }

            System.out.println(list);



    }
}
