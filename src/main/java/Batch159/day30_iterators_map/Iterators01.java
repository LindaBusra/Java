package Batch159.day30_iterators_map;


/*
    1)Iterators do the same with the loops
    2)Loops have infinite loop risk but iterators do not have.
    3)There are two types of iterators
            i)Iterator:
                You can just "remove" the elements, it is impossible to "update" or to "add" new elements
                You can use the elements from first to the last. It has one direction.
            ii)ListIterator:
                You can "remove" the elements, "update" the elements, "add" new elements.
                You can use elements from the first to the last and from the last to the first. It is bidirectional.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);     //[Tom, Jim, Clara, Angie, Mark]


        //How to use "iterator"
        //create an iterator object. Elements in the list are String so I create String iterator
        Iterator<String> itr = myList.iterator();  //[ x(pointer is here) Tom, Jim, Clara, Angie, Mark]  convert the list to iterator.
        // iterator() : getting the list and changing it to an iterator. myList.iterator() returning Iterator<String>

        //In Java there are two type of creation: i)by using new keyword, you are creating the object from scratch
        // ii)by using an object (there is converting here) (you create an object, and use another object)

        while(itr.hasNext()){       //hasNext() asks the pointer if there is any element after the pointer or not

            itr.next(); //next() takes the pointer to the right, and returns the element

            itr.remove();   //remove() removes the element next() method returned
      }

        //iterator has three methods.  hasNext(), next(), remove()

      System.out.println(myList);       //[]

    }
}
