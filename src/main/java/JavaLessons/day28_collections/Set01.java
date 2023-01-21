package JavaLessons.day28_collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Set01 {

 /*
 1-Set are for storing multiple non-primitive data in the same data type.
 2-Set are for storing unique data.(SSN, Phone numbers, email adress) You can not put repeated values in Set.
 3-There are three different set.    i)HashSet : Uses "Hashing Technique". It does not put the elements in any order. Order of element will be random. (Hashing Technique is uses for create unique adress)
                                                        Put element in order take to much time. If you need speed for unique elements storage use HashSet.
                                                        HashSet accept just a single "null" as element.
                                    ii)LinkedHashSet : Put the elements in "insertion order"
                                    iii)TreeSet : Puts the elements in "Natural Order" (Ascending order in numbers, Alphabetical Order in Strings)
                                    TreeSet is so slow in adding elements
  Question : If you need to store "unique elements" in natural order, which collection do you use?
  Answer:Treeset

  Question: As you know TreeSet is so slow in adding elements, how you can improve your code?
  1-Create a HashSet
  2-Add elements into the HashSet
  3-convert HashSet to TreeSet


  */

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();
        System.out.println(emails);         //  []

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        emails.add(null);
        emails.add(null);


        System.out.println(emails);         //[null, Apple, Fig, Mango, Apricot, Orange]  there is nor order


        emails.remove("Fig");
        System.out.println(emails);         //[null, Apple, Mango, Apricot, Orange]


        //When you try to add repeated date java does not give any error, and last data will be overwritten to the previous data
        emails.add("Mango");
        System.out.println(emails);         //[null, Apple, Mango, Apricot, Orange]


 //       emails.clear();     //deletes all elements from the hash set
 //       System.out.println(emails);         //[]



        //1.way When you use clone() method you can make data type "Object"
        Object emails2 = emails.clone();
        System.out.println(emails2);        //Data type of that is objects


        //2.way
        HashSet<String> emails3 = (HashSet<String>) emails.clone();  //HashSet is narrower than object, we make casting
        System.out.println(emails3);        ////Data type of that is HashSet



        //LinkedHashSet
        LinkedHashSet<Integer> ssn = new LinkedHashSet<>();
        ssn.add(123456789);
        ssn.add(234567891);
        ssn.add(345678912);
        ssn.add(456789123);
        ssn.add(null);
        System.out.println(ssn);//[123456789, 234567891, 345678912, 456789123, null]


        //1.way
        Long starting = LocalTime.now().toNanoOfDay();

        //TreeSet --->There is an order
        TreeSet<Integer> nums1 = new TreeSet<>();


        nums1.add(23);
        nums1.add(5);
        nums1.add(17);
        nums1.add(67);
        nums1.add(41);
        nums1.add(-5);
 //     nums1.add(null)  //TreeSet does not except "null " as element. It gives exception

        System.out.println(nums1);       //[-5, 5, 17, 23, 41, 67]


        Long middle = LocalTime.now().toNanoOfDay();


        //2.way -->This way is faster than 1.way
        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(23);
        nums2.add(5);
        nums2.add(17);
        nums2.add(67);
        nums2.add(41);
        nums2.add(-5);
        System.out.println(nums2);      //in random order  [17, 67, -5, 5, 23, 41]


        //I will change nums2 to TreeSet for make it ascending order

        TreeSet<Integer> perfectNums =  new TreeSet<>(nums2);
        System.out.println(perfectNums);            //[-5, 5, 17, 23, 41, 67]


        Long ending = LocalTime.now().toNanoOfDay();

        System.out.println("1.Way: " +  (middle-starting));
        System.out.println("2.Way: " +  (ending-middle));
    }
}
