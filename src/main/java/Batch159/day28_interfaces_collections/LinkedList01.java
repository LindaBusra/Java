package Batch159.day28_interfaces_collections;

import java.util.LinkedList;

public class LinkedList01 {


         /* Arrays04 ['A', 'C', 'K', 'D', 'M']-->['A', 'K', 'D', 'M']  OR ['A', 'X', 'C', 'K', 'D', 'M']

        1)When you use ArrayList removing an element or adding an element makes the other elements re-indexed.
        This is not good because reindexing many elements needs too many tasks.
        As a result; ArrayList is not successful in removing and adding elements.
        2)When you use LinkedList to remove or add elements, it will change just the pointers,
        it will not need to reindex all the other elements that is why removing and adding elements in LinkedList will be so easy.
        As a result, LinkedList is so successful in removing and adding elements.
        3)Search Operations are so easy in ArrayLists because every element has index like an address
        4)LinkedList is not successful in Search Operations because LinkedList does not use indexes I mean elements do not have addresses
            Node has to parts:Data + Pointer

     */

    public static void main(String[] args) {

        //How to create LinkedList
        LinkedList<Character> m = new LinkedList<>();

        //How to add "node"s in a LinkedList
        m.add('A');
        m.add(0, 'H');
        m.addFirst('K');
        m.addLast('R');

        System.out.println(m);  //[K, H, A, R]

        LinkedList<Character> n = new LinkedList<>();
        n.add('s');
        n.add('b');
        n.add('z');

        //add another collection
        m.addAll(n);
        System.out.println(m);              //[K, H, A, R, s, b, z]

        //add another collection in a specific place
        m.addAll(2, n);
        System.out.println(m);              //[K, H, s, b, z, A, R, s, b, z]

        //remove() method removes the first node and returns the removed node   -->remove()-->gives Character
        System.out.println(m.remove());     //K, it removes the element, and this method gives me the remoted element as Character
        System.out.println(m);              //[H, s, b, z, A, R, s, b, z]

        //remove(Object o)  -->gives boolean
        System.out.println(m.remove((Character)'R'));       //true. because 'R' was removed.  (Character) 'R'-->otherwise it takes the ascii value of R
        System.out.println(m);              //[H, s, b, z, A, s, b, z]

        System.out.println(m.remove((Character)'X'));       //false

        System.out.println(m.remove(4));        //A,  remove(int index)-->gives Character
        System.out.println(m);              //[H, s, b, z, s, b, z]

        System.out.println(m.removeFirstOccurrence('s'));   //true, gives boolean
        System.out.println(m);              //[H, b, z, s, b, z]

        System.out.println(m.removeLastOccurrence('z'));    //true, gives boolean
        System.out.println(m);              //[H, b, z, s, b]

        //Removes and returns the first element from the list
        System.out.println(m.removeFirst());    //H, removeFirst()-->gives Character
        System.out.println(m);

        m.removeLast();
        System.out.println(m);                  //[b, z, s]

        System.out.println(m.get(1));            //z

        //update the element at the given index
        System.out.println(m.set(2, 'W'));  //s  get the second element in output, after that update it with W
        System.out.println(m);                   //[b, z, W]

        System.out.println(m.size());           //get number of nodes
        System.out.println(m.contains('W'));    //true

        System.out.println(m.indexOf('W'));     //2
        System.out.println(m.lastIndexOf('z'));     //1

       m.clear();
        System.out.println(m);  //[]

    }
}
