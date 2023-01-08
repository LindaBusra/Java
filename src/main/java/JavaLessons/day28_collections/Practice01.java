package JavaLessons.day28_collections;

import java.util.*;

public class Practice01 {

    public static void main(String[] args) {


//Example 1- What is the output?

        Deque<Integer> list = new LinkedList<>();

        list.add(3);
        list.push(4);
        list.offer(6);
        list.addFirst(2);
        list.addLast(5);
        list.addFirst(1);

        System.out.println(list);  //[1, 2, 4, 3, 6, 5]


        System.out.println(list.poll());    //1



        System.out.println(list);  //[2, 4, 3, 6, 5]

        System.out.println(list.pop());  //2

        System.out.println(list);  //[4, 3, 6, 5]



        Deque<Integer> list10 = new LinkedList<>();   //Empty list


        System.out.println(list10.poll());   //null
        System.out.println(list10.peek());   //null

        //System.out.println(list10.remove()); //exception
        // System.out.println(list10.pop());   //exception
        //System.out.println(list10.element());   //exception

        System.out.println(list);
        System.out.println(list.hashCode());   //918102112




//Example 2- What is the output?

        Queue<String> q = new PriorityQueue<>();

        q.add("Teddy");
        q.add("Mark");
        q.add("Leo");

        System.out.println(q);
        q.remove();
        System.out.println(q);



//Example 3- What is the output?

        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(1);
        q1.add(5);
        q1.add(-2);

        System.out.println(q1);     //[-2, 5, 1]
        q1.poll();

        System.out.println(q1);     //[1, 5]




    }
}
