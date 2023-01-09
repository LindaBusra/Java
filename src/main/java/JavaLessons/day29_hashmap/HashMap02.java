package JavaLessons.day29_hashmap;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {


        //if hashCode is 33, 33%16=1--> it will go index 0. after that it will go that structure.
        //When you create a hashMap, java created 16 Buckets
        //In every buckets Java uses LinkedList to put entries in the buckets
        //Sometimes java creates same hashcode accidentally. HashCollision.

/*
1-When you create a hashMap java creates 16 "buckets" in memory and index them from 0 to 15.
2-When you use put() methods java creates an Integer hashCode and calculates HashCode%16.
3-The result of HashCode%16 will be the index to select bucket.
4-After selecting buckets Java will put the entry into the selected buckets as a node of a LinkedList.
5-Every node will have four part in it:  1-hashCode 2-key 3-value 4-pointer
6-Java makes every HashCode unique but sometimes Java can create same HashCode accidentally. This is called "HashCode Collision"
7-"HashCode Collision"s are common phenomena of Hashing functions.
8-If the key is "null", HashCode will be zero, that's way entry whose key is "null" will be put into the bucket whose index is zero.
 */



        HashMap<String, Double> coursePrices = new HashMap<>();  //(course name, course price)

        coursePrices.put("Full Stack Java Development", 6000.0);  //java create Integer hashCode for key

        coursePrices.put("Full Stack Automation Engineer", 5800.0);

        coursePrices.put("SalesForce Development", 4500.0);

        System.out.println(coursePrices.hashCode());




    }
}
