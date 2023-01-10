package JavaLessons.day30_hashtable_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

/*
    We have for-loop, while-loop, do-while loop and for-each loop.
    For-each loop is better to use because ut is easier to use and its performance is better tha  the others.
    but by using for-each loop it is impossible to remove or modify a collection.
    Therefore, Java created a new structure to be able to remove same elements from a collection or modify a collection.
    The new structure is called "Iterators"
    There are two Iterators :   i)Iterator :Has one direction, from right to left, from first to last element.
                                Iterator is just for removing element/elements
                                ii)ListIterator :Has two directions, from right to left and from left to right.
                                ListIterator can bu used to update as well.
    "For-each loop" and "Iterators" have same performance but Iterators are the best to remove elements or to modify elements in a collection.


 */

        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list1);//[Ali, Can, Aliye]


        //Remove "Can" from the list
//        List<String> list2 = new ArrayList<>();
//        for(String w: list1) {
//
//            if (!w.equals("Can")) {
//                list2.add(w);
//            }
//        }
//
//        System.out.println(list2);


//-----------------------------------------------------------------------------------------


        //Example 1: Update every element by putting "!" to end
        //1.way for-each loop could not updated the collection without using set() method.
//        for(String w: list1) {
//
//            w= w + "!";
//        }
//        System.out.println(list1);          //[Ali, Can, Aliye]


//-----------------------------------------------------------------------------------------


        //Set method using Iterator behind.
//        for(String w: list1) {
//
//            list1.set(list1.indexOf(w), w+"!");
//        }
//        System.out.println(list1);          //[Ali!, Can!, Aliye!]


//-----------------------------------------------------------------------------------------


        //2. way by using iterators

        ListIterator<String> itr = list1.listIterator();           //I am using list to create object.

        while(itr.hasNext()) {

            String el = itr.next();

            itr.set(el+"*");
        }

        System.out.println(list1);          //[Ali*, Can*, Aliye*]


//-----------------------------------------------------------------------------------------


        while(itr.hasPrevious()) {          //pointer was the end. is there any element before you. 1-it will get aliye* from iterator. 2- it will move pointer to the left

            String el = itr.previous();     //aliye* will be put in el.

            itr.remove();                   //remove method will be executed.
        }
        System.out.println(list1);      //[]


//-----------------------------------------------------------------------------------------


        //Remove all elements by using Iterator

//        Iterator<String> itr1 =  list1.iterator();           //I am using list to create object.
//
//        while(itr1.hasNext()) {
//
//            String el = itr1.next();
//
//            itr1.remove();
//        }
//
//        System.out.println(list1);      //[]






    }
}
