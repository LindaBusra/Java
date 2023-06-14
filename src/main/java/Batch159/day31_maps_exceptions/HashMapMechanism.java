package Batch159.day31_maps_exceptions;

import java.util.HashMap;

public class HashMapMechanism {


  /*        1)When you create a HashMap Java gives you 16 "buckets"  (Every box is called as bucket)
            2)Java puts indexes for every bucket from 0 to 15
            3)When you put an entry int the map;
                i)Java creates "hashcode" for the "key" of the entry
                ii)Java divides the "hashcode" by 16 and gets the remainder as index then
                   puts the entry to the bucket whose index was found after division.
            4)If multiple entries will be put into a single bucket, Java uses "LinkedList" structure.
            5)If 75% of existing buckets is full then Java gives you another 16 buckets.
            6)To find a specific value, Java follows the steps like;
              Index --> HashCode --> Key --> Return the Value                */


    public static void main(String[] args) {

        HashMap<String, Integer>  hm = new HashMap<>();
        hm.put("Albania", 3);   //java creates a hashcode for "Albania"
        hm.put("Germany", 83);
        hm.put("Belgium", 12);


        //Node-->1.part=hashkode+2.part=key+3.part=value
        hm.put("Albania", 3);       //for exampe if hashkode is 18   18%16=2-->this is index
        //node-->2 Albania 3

        hm.put("Germany", 83);       //for exampe if hashkode is 34   34%16=2-->this is index
        //node-->2 Germany 83       So we have 2 entries  in 2. box, there is a link between them.

        hm.put("Belgium", 12);       //for exampe if hashkode is 17   17%16=1-->this is index
        //node-->1 Belgium 12        So we have in 1. box this node.




    }

}
