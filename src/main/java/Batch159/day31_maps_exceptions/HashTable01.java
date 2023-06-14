package Batch159.day31_maps_exceptions;

import java.util.Hashtable;

public class HashTable01 {

    /*
    1)HashTable01 is "thread-safe" and "synchronized" but HashMap is not "thread-safe" not "synchronized"
    2)HashTable01 puts the elements in random order.
    3)To be "thread-safe" and "synchronized" needs time, that is why HashTable01 is slower than HashMap
    4)HashTable01 does not accept null in "key"s and in "value"s.         */

    public static void main(String[] args) {

    Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
    ht.put("Emily Nilsen", 13);
    ht.put("Tom Hanks", 65);
    ht.put("Brad Pitt", 56);
//    ht.put(null, 45);     HashTable01 does not accept null in "key"s
//    ht.put("Mark Twain", null);  HashTable01 does not accept null in "value"s.

    System.out.println(ht);     //{Emily Nilsen=13, Tom Hanks=65, Brad Pitt=56}

        //get() gives you the value of a key.
        System.out.println(ht.get("Emily Nilsen"));     //13

        //if the key exist, you will get the value. If the key does not exist, it gives you the value you want, as a default it is 0.
        System.out.println(ht.get("Angelina Jolie")); //normally with get() the result is  null
        System.out.println(ht.getOrDefault("Angelina Jolie", 0));   //default is 0
        System.out.println(ht.getOrDefault("Angelina Jolie", -1));  //I will get -1


        //indexOf() method gives me -1 for non-existing character
        String str = "Java";
        System.out.println(str.indexOf("H"));       //-1

        //Get the sum of values with using getOrDefault() without problem with non-existing keys
//        System.out.println(ht.get("Emily Nilsen") + ht.get("Tom Hanks") + ht.get("Brad Pitt") + ht.get("Angelina Jolie"));   //I can not add null the others
        System.out.println(ht.getOrDefault("Emily Nilsen", 0) + ht.getOrDefault("Tom Hanks", 0) + ht.getOrDefault("Brad Pitt",0) + ht.getOrDefault("Angelina Jolie", 0));


    }




}
