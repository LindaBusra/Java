package JavaLessons.day28_collections;

import java.util.*;

public class Practice05 {

    public static void main(String[] args) {


        HashSet<Integer> Numbers = new HashSet<Integer>();


        Numbers.add(25);
        Numbers.add(62);
        Numbers.add(49);
        Numbers.add(87);


        // using spliterator() method
        Spliterator<Integer> numbers = Numbers.spliterator();

        System.out.println("list of Numbers:");

        // forEachRemaining method of Spliterator

        numbers.forEachRemaining((n) -> System.out.println(n));


        //Question : Add 3 for each element in the Numbers list and print them on the console

        Iterator<Integer> itr = Numbers.iterator();

        while (itr.hasNext()) {

            System.out.print(itr.next() + 3 + " ");

        }

        System.out.println(Numbers);  //It is not changed!!!
        System.out.println();


//-----------------------------------------------------------------------------------------


        HashSet<String> students = new HashSet<String>();


        students.add("Ole");
        students.add("Einar");
        students.add("Elin");
        students.add("Terje");
        students.add("Carolina");

        // using spliterator() method
        Spliterator<String> names = students.spliterator();

        // print result from Spliterator
        System.out.println("list of Students:");

        // forEachRemaining method of Spliterator
        names.forEachRemaining((n) -> System.out.println("Student Name: " + n));



        //Make a list with the names of these programs. { PHP, SQL, HTML, C++, Java}
        // And print them on the console like that : 1a) PHP 2b) SQL 3c) HTML 4d) C++ 5e) Java

        LinkedList<String> programs = new LinkedList<>();


        programs.add("PHP");
        programs.add("SQL");
        programs.add("HTML");
        programs.add("C++");
        programs.add("Java");


        Iterator<String> itr1 = programs.iterator();

        int i=1;
        char ch = 'a';
        while (itr1.hasNext()) {

            System.out.print(i + "" + ch + ") " + itr1.next()+" ");
            i++;
            ch++;
        }



        }
}