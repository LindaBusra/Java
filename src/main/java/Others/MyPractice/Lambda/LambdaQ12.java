package Others.MyPractice.Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaQ12 {

    public static void main(String[] args) {


        List<Person> people = Arrays.asList(

                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Caryl", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arlond", 39)
        );


    //get first names
        people.stream().forEach(t-> System.out.println(t.getFirstName()));


    //get first names
        people.stream().forEach(t-> System.out.println(t.getFirstName() + " " + t.getLastName()));


    //get emails adresses

        people.stream().forEach(t-> System.out.println(t.getFirstName().toLowerCase()+"."+t.getLastName().toLowerCase()+"@gmail.com"));


    //get first names which have last name starter with C (for example: "Thomas")

        people.stream().filter(t-> t.getLastName().startsWith("C"))
                .forEach(t-> System.out.println(t.getFirstName()));


    //Count how many person have last name which starter with C

      long howMany =   people.stream().filter(t-> t.getLastName().startsWith("C")).count();

      System.out.println(howMany);



        //get first name and last name  which have age greater than 50.

        people.stream().filter(t->t.getAge()>50).forEach(t-> System.out.println(t.getFirstName()+ " " + t.getLastName()));



    }
}
