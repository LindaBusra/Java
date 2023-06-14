package JavaLessons.day28_collections;

import java.util.HashSet;

public class Practice04 {

    public static void main(String[] args) {




        HashSet<String> set = new HashSet<String>();

        set.add("Geeks");
        set.add("for");
        set.add("Geeks");
        set.add("10");
        set.add("20");

        System.out.println("HashSet 1: " + set);



        HashSet<String> set2 = new HashSet<String>();

        set2.add("Geeks");
        set2.add("for");
        set2.add("Geeks");
        set2.add("10");
        set2.add("20");

        System.out.println("HashSet 2: " + set2);


        // Check if the set  contains same elements

        System.out.println("Does set 1 contains set 2: " + set.containsAll(set2));

    }
}
