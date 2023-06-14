package Others.MyPractice.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class LambdaQ11 {

    public static void main(String[] args) {


        List<Person> people = Arrays.asList(

                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Caryl", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arlond", 39)
        );

        //Step 1:Sort list by lastname

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //Step 2:Create a method that prints all elements in the list

        printAll(people);

        //Step 3:Create a method that prints all people that have last name beginning with C

        printLastNameBeginningC(people);
    }

    private static void printAll(List<Person> people) {

        for (Person p : people) {
            System.out.println(p);
        }
    }


    private static void printLastNameBeginningC(List<Person> people) {

        for (Person p : people) {

            if (p.getLastName().startsWith("C")) {
                System.out.println(p);
            }
        }
    }





}

