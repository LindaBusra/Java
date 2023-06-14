package JavaLessons.day28_collections;

import java.util.*;

public class Practice10 {


    public static void main(String[] args) {


   //Example-What is our num list?

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(2);

        Deque<Integer> num = new LinkedList<>(arr);
        System.out.println(num);

        num.add(1);
        num.add(2);
        num.addFirst(3);
        num.push(4);
        num.addLast(5);
        num.addAll(arr);
        num.offer(10);
        num.offer(5);
        num.remove();
        num.poll();
        num.add(null);
        num.removeFirstOccurrence(2);
        num.removeLastOccurrence(5);

        System.out.println(num);
        System.out.println(num.size());


        System.out.println(num.element());
        System.out.println(num.peek());
        System.out.println(num.poll());
        System.out.println(num);


        //If the list is empty :
        Deque<Integer> num1 = new LinkedList<>();

        System.out.println(num1.poll());        //null
        System.out.println(num1.peek());        //null
        System.out.println(num1.pop());         //It gives NoSuchElementException
//      System.out.println(num1.element());     //It gives NoSuchElementException
//      System.out.println(num1.remove());      //It gives NoSuchElementException


//LinkedList accept "null" as en element.

    }
}
