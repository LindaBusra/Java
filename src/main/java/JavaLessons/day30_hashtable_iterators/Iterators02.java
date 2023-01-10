package JavaLessons.day30_hashtable_iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {


        //Example 1: Increase the numbers in a List by 20 percent then print the elements in the reverse order of the given order
//           [20, 60, 30, 100] ==> [24, 72, 36, 120] ==> [120, 36, 72, 24]


        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(60);
        list.add(30);
        list.add(100);


        ListIterator<Integer> itr = list.listIterator();           //I am using list to create object.


        //that code moves to pointer to the end
        while(itr.hasNext()) {

            itr.next();

        }


        //Even you do the updates from right to left order of list elements does not changed.
        //If you want to change the order of the elements use Collection.reversed(list)

        while(itr.hasPrevious()) {          //pointer was the end. is there any element before you.

            Integer el = itr.previous();
            itr.set(el*120/100);

        }

        Collections.reverse(list);
        System.out.println(list);


    }
}
