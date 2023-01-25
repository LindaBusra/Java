package JavaLessons.day16_arraylist;

import java.util.ArrayList;
import java.util.List;

public class List09 {

    public static void main(String[] args) {


        //How to check if two list are same or not

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //equals() method checks if the some elements  are in the same position.
        //if some elements are in the same position, equals() method returns true, otherwise it returns false.
        if(m.equals(n)) {
            System.out.println("The list are same");
        } else {
            System.out.println("The list are not same");
        }


//How to check if a list contains multiply elements
        //[12,23,32,14,24,56]-->check if the list has 23,56 and 24

        ArrayList<Integer> p = new ArrayList<>();
        p.add(12);
        p.add(23);
        p.add(32);
        p.add(14);
        p.add(24);
        p.add(56);

        ArrayList<Integer> pq = new ArrayList<>();
        pq.add(23);
        pq.add(56);
        pq.add(24);

        //containsAll() method returns "true" if all elements exist,
        // anyone of them does not exist it returns "false"

        boolean areExist = p.containsAll(pq);       //eger birden fazla eleman var mi diye bakiyorsam

        System.out.println(areExist);

    }
}
