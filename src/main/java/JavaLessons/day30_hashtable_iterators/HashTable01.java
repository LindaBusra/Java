package JavaLessons.day30_hashtable_iterators;

import java.util.Hashtable;

public class HashTable01 {

    public static void main(String[] args) {

    //There are three maps... HashMap, HashTable,
    /*
        1-HashTable is a Map
        2-HashTable does not put entries to any order, they will be in Random order.
        3-HashTable is slower than HashMap.
        4-HashTable is thread-safe and synchronized but hashMap is not.
        When you use multi-thread you need to create an order for the threads, this called "synchronization"
        To create sensible order in multi-thread, is called "synchronization" (meat-soup-salad-->multithread)
*/
        Hashtable<String, Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 85000000);
        countryPopulations.put("Turkey", 81000000);
        System.out.println(countryPopulations);

        //Difference HashMap and HashTable


        //Example 1:Store students names together with their email addresses, ages, grades, nationality
        //Tom Hanks = th@gmail.com, 21, 2, American

        Hashtable<String, Students> studentsInfo = new Hashtable();    //A class can be used a data type as well.
        // Student is a clas and I can use it like data type. Non-primitive data type can created by developers as Students.

        studentsInfo.put("Tom Hanks", new Students("th@gmail.com", 21, 2, "American"));
        studentsInfo.put("Brad Pitt", new Students("bp@gmail.com", 22, 3, "Colombian"));
        studentsInfo.put("Angelina Jolie", new Students("aj@gmail.com", 19, 1, "Peru"));

        System.out.println(studentsInfo);
//Tom Hanks=JavaLessons.day30_maps.Students@7cc355be,   it give me referances...we will understandable data-->go to Students  class. We put line 20

        //How to see a detail about the students like Tom Hanks age.
        Students tomInfo = studentsInfo.get("Tom Hanks");
        System.out.println(tomInfo);
        System.out.println(tomInfo.age);
        System.out.println(tomInfo.nationality);

    //or
        System.out.println(studentsInfo.get("Tom Hanks").age);
        System.out.println(studentsInfo.get("Tom Hanks").nationality);

    }
}
