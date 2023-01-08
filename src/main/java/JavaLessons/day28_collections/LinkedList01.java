package JavaLessons.day28_collections;


/*
Collections are for storing multiply data in the same data type.
Collections are flexible in length.
Collections have many usefull methods.

There are tre main collections:     i)List  -->a)ArrayList :Successful in search operations, but not good at adding and removing.
                                                b)LinkedList : Successful in removing and adding operations, but not good at "search operations"
                                    ii)Queue ---> a) PriorityQueue   b)Deque
                                    iii)Set --> a)HashSet   b)LinkedHashSet     c)TreSet

[A, B, C, D, E]-->array list element, every element has address (index) Search operations can be done so fast

When I remove an element java need to re-indexing, and it is so much task for java. all the others element need to be re-index.

ArrayList are not successfully in removing elements

[A,B,C,D,E] If I will put x between A and B, index of element will be 1, and the others need re-indexing, to much task for java

ArrayList are not successfully in adding elements

Because at to reasons Java create another struct which is LinkedList.

In Linked List every part has to part, 1.part for data, 2.part for pointer.  The last node pointer null.
There is head which is just pointer, in the beginning, before A.

LinkedList dont use index, they use pointer. Nodes dont have adresses.


 */

import java.util.*;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();       //LinkedList is a concrete class and it has constructor

        //on the left can I use List<String> or Collection<String> or Iterable<String>

        visitors.add("Tom");
        visitors.add("Jane");
        visitors.add("Mary");
        visitors.add("Carl");
        visitors.add("Ali");




//      Collections.sort(visitors);
        System.out.println(visitors);   //[Ali, Carl, Jane, Mary, Tom]

        //add() method is coming from List (Interface), it is parent. Interfaces has abstract method.

        System.out.println(visitors);       //[Tom, Jane, Mary, Carl, Ali]

        visitors.addLast("Ole");        //[Tom, Jane, Mary, Carl, Ali, Ole]
        System.out.println(visitors);

        visitors.addFirst("Chris");     //[Chris, Tom, Jane, Mary, Carl, Ali, Ole]
        System.out.println(visitors);



        LinkedList<String> kids = new LinkedList<>();
        kids.add("Abc");
        kids.add("Xyz");



        visitors.addAll(kids);
        System.out.println(visitors);       //[Chris, Tom, Jane, Mary, Carl, Ali, Ole, Abc, Xyz]

        visitors.add(2, "Miami");       //[Chris, Tom, Miami, Jane, Mary, Carl, Ali, Ole, Abc, Xyz]
        System.out.println(visitors);

        //Normally LinkedList doesnt use "indexes", Java display it as index to make usage easy for us. (it use actually nodes)

        visitors.addAll(6, kids);
        System.out.println(visitors);       //[Chris, Tom, Miami, Jane, Mary, Carl, Abc, Xyz, Ali, Ole, Abc, Xyz]



        visitors.remove(2);
        System.out.println(visitors);       //[Chris, Tom, Jane, Mary, Carl, Abc, Xyz, Ali, Ole, Abc, Xyz]

        visitors.remove("Abc");         //remove() method removes the first occurence of the object.
        System.out.println(visitors);

        visitors.removeFirst();
        System.out.println(visitors);       //[Tom, Jane, Mary, Carl, Xyz, Ali, Ole, Abc, Xyz]

        visitors.remove();
        System.out.println(visitors);       //[Jane, Mary, Carl, Xyz, Ali, Ole, Abc, Xyz]

        visitors.removeFirstOccurrence("Xyz");      //[Jane, Mary, Carl, Ali, Ole, Abc, Xyz]
        System.out.println(visitors);

        visitors.removeLast();
        System.out.println(visitors);               //[Jane, Mary, Carl, Ali, Ole, Abc]




        //Example 1: Change all names starts with "A" to asterix *****

        for(String w: visitors) {

            if(w.startsWith("A")) {
                visitors.set(visitors.indexOf(w), "*****");
            }
        }

        System.out.println(visitors);       //[Jane, Mary, Carl, *****, Ole, *****]

        //LinkedList is mutable, I have able to change element




        // Example 2:From the list, If the number of characters is more than 3, remove them from the linkedlist.


       LinkedList<String> names = new LinkedList<>();

       names.add("Chris");
       names.add("Alexander");
       names.add("Mark");
       names.add("Tom");
       names.add("Jeremy");
       names.add("Hans");


        for(int i=0; i<names.size(); i++) {

            if(names.get(i).length()>4) {
                names.remove(names.get(i));     //since removing one element we should decrease the index
                                                // while the indexes will change after every iteration
                i--;
            }
        }

        System.out.println(names);      //[Mark, Tom, Hans]





    }
}
