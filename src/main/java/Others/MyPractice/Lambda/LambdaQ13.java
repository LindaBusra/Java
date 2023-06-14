package Others.MyPractice.Lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaQ13 {

    public static void main(String[] args) {



        List<Person> people = Arrays.asList(

                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Caryl", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arlond", 39)
        );


        //print all object to console with loops
        System.out.println("Using for loop");

        for(int i=0; i<people.size(); i++) {

            System.out.println(people.get(i));
        }


        System.out.println("\nUsing for in loop");

        for(Person p: people){

            System.out.println(p);
        }

        System.out.println("\nUsing Lambda for:each loop");

        people.forEach(t-> System.out.println(t));  //or
        people.forEach(System.out::println);

    }







}
