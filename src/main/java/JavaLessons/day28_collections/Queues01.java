package JavaLessons.day28_collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {

/*
1-Queues are for storing multiply non-primitive data in the same data type.
2-Queue's are used for FIFO (First inn First Out)


 */


 public static void main(String[] args) {

     Queue<String> warehouse =  new LinkedList<>();  //I have to option for right part. The others is Priority Queue

     warehouse.add("Milk");
     warehouse.add("Meat");
     warehouse.add("Bread");
     warehouse.add("Honey");
     warehouse.add("Tomatoes");

     System.out.println(warehouse);



     String el1 = warehouse.poll();   //Milk  -->It will give me first element and remove the first element
//Retrieves and removes the head of this queue, or returns null if this queue is empty.
//Returns the head of this queue, or null if this queue is empty.

     System.out.println(el1);
     System.out.println(warehouse);  //[Meat, Bread, Honey, Tomatoes]


    String el2 = warehouse.peek();    // Meat -->It give me data, but not remove. //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
                                        //Returns: //the head of this queue, or null if this queue is empty
     System.out.println(el2);
     System.out.println(warehouse);     //[Meat, Bread, Honey, Tomatoes]


    String el3 =  warehouse.element();  //Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.
                                        // Returns: the head of this queue

     System.out.println(el3);           //Meat
     System.out.println(warehouse);     //[Meat, Bread, Honey, Tomatoes]



     Queue<String> emptyWarehouse =  new LinkedList<>();

     String el4 = emptyWarehouse.peek();
     System.out.println(el4);           //null

 //    String el5 = emptyWarehouse.element();     //If the Queue is empty element method throws NoSuchElementException
   // System.out.println(el5);           //NoSuchElementException



/*
Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.

Returns:
true if the element was added to this queue, else false
Throws:
ClassCastException – if the class of the specified element prevents it from being added to this queue
NullPointerException – if the specified element is null and this queue does not permit null elements
IllegalArgumentException – if some property of this element prevents it from being added to this queue

 */

     boolean result1 = warehouse.offer("Chocolate");  //adding element
     System.out.println(result1);        //It means, the new one is the same element som the lists, it is String
     System.out.println(warehouse);     //[Meat, Bread, Honey, Tomatoes, Chocolate]



     /*
     Retrieves and removes the head of this queue.
     This method differs from poll() only in that it throws an exception if this queue is empty.
     Returns: the head of this queue
     Throws: NoSuchElementException – if this queue is empty
      */
     String el6 = warehouse.remove();
     System.out.println(el6);               //Meat
     System.out.println(warehouse);         //[Bread, Honey, Tomatoes, Chocolate]


     String el7 = emptyWarehouse.poll();         //that should give me null
     System.out.println(el7);

//     String el8 = emptyWarehouse.remove();       //that should give me exception-->NoSuchElementException
//     System.out.println(el8);

     //Their functionality is same if Queue is not empty. But if it is empty different result
 }
}
