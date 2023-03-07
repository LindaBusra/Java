package JavaLessons.day16_arraylist;

import java.util.ArrayList;

public class List13 {

    public static void main(String[] args) {


//Example 1- Create a String ArrayList, add 5 elements into it, remove the elements whose lengths is less than 5


        //Create a String ArrayList, add 5 elements into it, remove a specific element
        ArrayList<String> al5 = new ArrayList<>();
        al5.add("Christian");
        al5.add("Alex");
        al5.add("Tommy");
        al5.add("Adriana");
        al5.add("Tom");

        System.out.println(al5);            // [Christian, Alex, Tommy, Adriana, Tom]

        al5.remove("Alex");             // it will return boolean, true-->mission completed.    //false-->Couldn't remove
        System.out.println(al5);            // [Christian, Tommy, Adriana, Tom]



        //How to remove an element by index
        al5.remove(1);      //I will return the removed element to double-check.
        System.out.println(al5);            // [Christian, Adriana, Tom]



//Example 2:Type code to remove all occurrences of a specific element from the list, for eksempel
        //remove "Shoes" og "Laptop"

        ArrayList<String> g = new ArrayList<>();
        g.add("Shoes");
        g.add("TV");
        g.add("Radio");
        g.add("Laptop");
        g.add("Shoes");
        g.add("Book");
        g.add("Shoes");
        System.out.println(g);

        ArrayList<String> h = new ArrayList<>();
        h.add("Shoes");
        h.add("Laptop");

        g.removeAll(h);
        System.out.println(g);      //[TV, Radio, Book]



//--------------------------------------------------------------------------------------------


//Example 3- Type code to remove an element at a specific index.
        //Remove 5th. element from list

        ArrayList<String> i = new ArrayList<>();
        i.add("Shoes");
        i.add("TV");
        i.add("Radio");
        i.add("Laptop");
        i.add("Shoes");
        i.add("Book");
        i.add("Shoes");

        i.remove(4);
        System.out.println(i);   //[Shoes, TV, Radio, Laptop, Book, Shoes]

    }
}
