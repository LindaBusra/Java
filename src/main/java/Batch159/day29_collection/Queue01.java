package Batch159.day29_collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {


        //29. Session Java Collections 05/01/2023

       /*
        1)Sometimes we need to work first added element in a collection like in a bank customer line.
          For that kind of scenarios we prefer to use "Queue"s because "Queue"s are expert in "First In First Out"(FIFO) scenarios.

          Note 1: When you create a queue if you use LinkedList Constructor, the elements will be in "insertion order"
          Note 2: When you create a queue if you use Priority Queue Constructor, the elements will be in an order you can create.
                  We will learn how to create our own logic to put elements in order.
        2)Sometimes we need to work first added element and last added element in a collection.
          It means we need to work double ended.
          Create Deque(Double Ended Queue) and use methods with double ends like removeFirst() and removeLast()
     */


        Queue<String> food = new LinkedList<>();    //Queue is interface. so it creates the object from LinkedList, so they are in insertion order
        food.add("Milk");
        food.add("Cheese");
        food.add("Meat");
        food.add("Yoghurt");
        food.add("Jam");
        System.out.println(food);// [Milk, Cheese, Meat, Yoghurt, Jam]


        PriorityQueue<String> myFood = new PriorityQueue<>();  //PriorityQueue is a class. put elements according to itself. java create a logic and put the elements according to the this logic.
        myFood.add("Milk");
        myFood.add("Cheese");
        myFood.add("Meat");
        myFood.add("Yoghurt");
        myFood.add("Jam");
        System.out.println(myFood);// [Cheese, Jam, Meat, Yoghurt, Milk]


        //Double ended queue. From top and bottom, First in First out is possible, Last in First out is possible
        Deque<String> yourFood = new LinkedList<>();        //Deque is an interface. they are in insertion order, because we used LinkedList
        yourFood.add("Milk");
        yourFood.add("Cheese");
        yourFood.add("Meat");
        yourFood.add("Yoghurt");
        yourFood.add("Jam");

        System.out.println(yourFood);// [Milk, Cheese, Meat, Yoghurt, Jam]
        //we have methods for to ends.
        yourFood.removeFirst();
        yourFood.removeLast();
        yourFood.offerFirst("Egg");
        yourFood.offerLast("Egg");


    }
}
