package JavaLessons.day28_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Practice09 {
    public static void main(String[] args) {



        //Example 1- What is the output?

        HashSet<ArrayList> set = new HashSet<>();


        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();



        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);

        list3.add(2);
        list3.add(1);

        set.add(list1);
        set.add(list2);
        set.add(null);
        set.add(list3);


        System.out.println(set);
        System.out.println("Result:" + set.size());

        System.out.println("------------------------------------");
//---------------------------------------------------------------------


        HashSet<String> h = new HashSet<String>();


        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");


        System.out.println(h);
        System.out.println("List contains India or not:" + h.contains("India"));


        h.remove("Australia");
        System.out.println("List after removing Australia:" + h);


        System.out.println("Iterating over list:");


        // Iterating over hashSet items
        Iterator<String> i = h.iterator();

        // Holds true till there is single element remaining
        while (i.hasNext())

            // Iterating over elements using next() method
            System.out.println(i.next());
    }
}
