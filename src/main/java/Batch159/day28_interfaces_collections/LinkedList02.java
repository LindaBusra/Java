package Batch159.day28_interfaces_collections;

import java.util.LinkedList;

public class LinkedList02 {
    public static void main(String[] args) {

        LinkedList<Integer> r = new LinkedList<>();
        r.add(12);  //add() put the elements in insertion order
        r.add(5);
        r.add(14);
        r.add(12);
        r.add(1);
        System.out.println(r);   //[12, 5, 14, 12, 1]

        //Removes and returns the first element of this list.
        //This method is equivalent to removeFirst().
        //cut+paste
        System.out.println(r.pop());    //12, gets first element, and remove it
        System.out.println(r);  //[5, 14, 12, 1]

        System.out.println(r.poll());   //5, gets first element, and remove it
        System.out.println(r);      //[14, 12, 1]


        /*
            removeFirst() + pop()
            Removes and returns the first element from this list.
            Returns:the first element from this list
            Throws:NoSuchElementException – if this list is empty

            remove()
            Retrieves and removes the first element of this list.
            Returns:the first element of this list
            Throws:NoSuchElementException – if this list is empty

            As a result; removeFirst() and pop() and remove() do the same


            poll()
            Retrieves(returns) and removes the head (first element) of this list.
            Returns:the head of this list, or null if this list is empty

            peek()
            Retrieves, but does not remove, the head (first element) of this list.
            Returns:the head of this list, or null if this list is empty

0
            Retrieves, but does not remove, the head (first element) of this list.
            Returns:the head of this list
            Throws:NoSuchElementException – if this list is empty
         */

        //Retrieves, but does not remove, the first element of this list.   //copy+paste
        r.element();

        //Retrieves and removes the first element of this list. //cut+paste
        r.poll();

        //Retrieves, but does not remove, the head (first element) of this list.    //copy+paste
        r.peek();


    }
}
