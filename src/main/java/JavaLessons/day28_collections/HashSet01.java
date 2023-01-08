package JavaLessons.day28_collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet01 {

    public static void main(String[] args) {


//Create a  HashSet which name is primeNumbers  this numbers:2,3,5,7,11,13,17
//Create a second HashSet which name is oddNumbers with this numbers:3,5,11,17,19,27
//Write common elements (Intersection) on the console
//Write the difference elements for HashSet1 on the console

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);
        primeNumbers.add(13);
        primeNumbers.add(17);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(11);
        oddNumbers.add(17);
        oddNumbers.add(19);
        oddNumbers.add(27);
        System.out.println("HashSet2: " + oddNumbers);

        // Intersection of two sets
        oddNumbers.retainAll(primeNumbers);
        System.out.println("Intersection is: " + oddNumbers);


//b - Check if numbers is a subset of primeNumbers

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(13);
        System.out.println("HashSet3: " + numbers);


        // Check if numbers is a subset of primeNumbers
        boolean result1 = primeNumbers.containsAll(numbers);
        System.out.println("Is HashSet3 is subset of HashSet1? " + result1);

//c
        primeNumbers.removeAll(oddNumbers);
        System.out.println(primeNumbers);




        //Create an array list with these ages:10,12,15,16,19,23,34
        //a)Write all ages which are less then 18 on the console
        //b)Write all ages which are greater then 18 on the console
        ArrayList<Integer> ages = new ArrayList<>();

        // add some elements to the ArrayList
        ages.add(10);
        ages.add(12);
        ages.add(15);
        ages.add(16);
        ages.add(19);
        ages.add(23);
        ages.add(34);
        System.out.println("List of Age: " + ages);

        // ages below 18
        System.out.println("Ages below 18: " + ages.subList(0, 4));

        // ages above 18
        System.out.println("Ages above 18: " + ages.subList(4, ages.size()));

//---------------------------------------------------

        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add some elements to the ArrayList
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("ArrayList: " + languages);

        // element from 1 to 3
        System.out.println("SubList: " + languages.subList(1, 3));

    }
}
