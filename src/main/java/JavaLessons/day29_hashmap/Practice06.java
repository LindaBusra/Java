package JavaLessons.day29_hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Practice06 {

    public static void main(String[] args) {


        List<String> elements = new ArrayList<>();
        elements.add("Gold");
        elements.add("Silver");
        elements.add("Uranyum");
        elements.add("Iron");

// Question 5: Update every element by putting "*" to end. By using iterators.

        ListIterator<String> itr = elements.listIterator();

        while(itr.hasNext()) {

            String el = itr.next();

            itr.set(el+"*");
        }

        System.out.println(elements);

    }
}
