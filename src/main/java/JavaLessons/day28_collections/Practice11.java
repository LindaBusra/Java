package JavaLessons.day28_collections;

import java.util.*;

public class Practice11 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Kevin");
        names.add("Andrew");
        names.add("Steve");

        for(String each: names) {
            System.out.println(each);
        }
        System.out.println();
        names.remove("Kevin");

        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println();
        names.remove(0);

        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        if (names.contains("Steve")) {
            System.out.println("found steve");
        }




        List<Double> numbers = new ArrayList<Double>();
        //autoboxing
        numbers.add(2.4);
        //Manual boxing
        numbers.add(new Double(1.5));


        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));

        System.out.println("--------");


        Queue<String> q = new LinkedList<String>();
        q.offer("John");
        q.offer("Jane");
        q.offer("Sue");

        for (String each: q) {
            System.out.println(q.size() + " : " + each);
        }

        while( !q.isEmpty()) {
            System.out.println(q.size() + " : " + q.poll());
        }




        Stack<Integer> nums = new Stack<Integer>();
        nums.push(10);
        nums.push(20);
        nums.push(30);

        while (!nums.isEmpty()) {
            System.out.println(nums.size() + " : " + nums.pop());
        }

    }

}