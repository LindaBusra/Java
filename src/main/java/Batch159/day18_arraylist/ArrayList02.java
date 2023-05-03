package Batch159.day18_arraylist;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {


        //More methods in ArrayLists
        ArrayList<Integer> n = new ArrayList<>();
        n.add(2);
        n.add(3);
        n.add(1);
        n.add(2);
        n.add(1);


        ArrayList<Integer> p = new ArrayList<>();
        p.add(2);
        p.add(3);
        p.add(9);

        n.retainAll(p);
        System.out.println(n);  //[2, 3, 2] --> retainAll() keeps the common elements in the first list and remove the different elements
        System.out.println(p);  //[2, 3, 9] --> The list inside the retainAll() parenthesis does not change
    }
}
