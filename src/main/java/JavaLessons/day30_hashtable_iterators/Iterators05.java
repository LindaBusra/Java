package JavaLessons.day30_hashtable_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators05 {

    public static void main(String[] args) {


        //By using Iterator remove a specific element from an Integer List

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(19);
        list.add(21);
        list.add(35);


        ListIterator<Integer> itr = list.listIterator();

        int removeIt = 19;


        while (itr.hasNext()) {

            if (itr.next() == removeIt) {
                itr.remove();
            }
        }

        System.out.println(list);
    }
}
