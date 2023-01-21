package JavaLessons.day28_collections;

import java.util.HashSet;
import java.util.Iterator;

public class Practice02 {

    public static void main(String[] args) {



        HashSet<String> hs = new HashSet<String>();


        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");

        System.out.println(hs.hashCode());          //70965881

        // Printing the elements of HashSet elements
        System.out.println("Initial HashSet " + hs);

        // Removing the element B
        hs.remove("B");

        // Printing the updated HashSet elements
        System.out.println("After removing element " + hs);

        // Returns false if the element is not present
        System.out.println("Element AC exists in the Set : " + hs.remove("AC"));   //false


//---------------------------------------------------------------------------------



        // Creating an empty HashSet of string entries
        HashSet<String> hs1 = new HashSet<String>();

        // Adding elements with using add() method
        hs1.add("Geek");
        hs1.add("For");
        hs1.add("Geeks");
        hs1.add("A");
        hs1.add("B");
        hs1.add("Z");

        System.out.println(hs1);
        System.out.println(hs1.hashCode());




        // Write elements on the console with using Iterator
        Iterator itr = hs1.iterator();

        // Holds true till there is single element
        while (itr.hasNext()) {

            System.out.print(itr.next() + " ");     //Traversing elements and printing them
        }
        System.out.println();



        // Write elements on the console with using for:each
        for (String s : hs1) {

            System.out.print(s + " ");
        }

        System.out.println();
    }
}
