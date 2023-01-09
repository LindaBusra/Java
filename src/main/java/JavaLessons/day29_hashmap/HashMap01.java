package JavaLessons.day29_hashmap;

import java.util.*;

public class HashMap01 {

    /*

    1)Maps have key - value structure
    2)Key's are unique but value's are not (Key (Unique) = Value (Repeated data)
    3)Every element in a map is called as "Entry". All elements are called as "EntrySet".
    4)All elements are called as "EntrySet"
    5)Key cannot be null in maps except HashMap but value can.
    6-HashMap's put entries in random order, because of that it is super fast


    //Entry : Element of map.  Entry set: if we mean all entry's, all elements in a map

 */

    public static void main(String[] args) {


    //How to create a HashMap.

        HashMap<String, Integer>  stdAges = new HashMap<>();

    //How to put entries into a HashMap   (put-->entry)
    stdAges.put("Ali Can", 13);
    stdAges.put("Tom Hanks", 46);
    stdAges.put("Brad Pit", 55);
    stdAges.put("Angelina Julie", 48);


    System.out.println(stdAges);            //{Tom Hanks=46, Brad Pit=55, Angelina Julie=48, Ali Can=13}
                                            // 1.st entry --> Tom Hanks=46

 //-------------------------------------------------------------------------------------------------------

        //How to get just keys from a Map
        Set<String> keys = stdAges.keySet();    //I want to get just the names
        System.out.println(keys);               //[Tom Hanks, Brad Pit, Angelina Julie, Ali Can]


        //How to get just values from a Map
        Collection<Integer> ages = stdAges.values();
        System.out.println(ages);               //[46, 55, 48, 13]


        //How to get a value of a key?
        Integer tomAge = stdAges.get("Tom Hanks");
        System.out.println(tomAge);     //46

//-------------------------------------------------------------------------------------------------------


     //Can I put null into key? Yes, you can use null just in HashMap Key.
     stdAges.put(null,23);
     System.out.println(stdAges);           //{null=23, Tom Hanks=46, Brad Pit=55, Angelina Julie=48, Ali Can=13}


    //Can I put null into value? Yes, you can use null. In values repeated data is possible
     stdAges.put("Ajda Pekkan", null);
     stdAges.put("Someone Unknown", null);
     System.out.println(stdAges);           //{null=23, Tom Hanks=46, Brad Pit=55, Angelina Julie=48, Ajda Pekkan=null, Ali Can=13}


     //What happens if you use some key repeatedly? Java accept the final value for the key (Overwriting)
     stdAges.put("Angelina Julie", 23);    // It appears just one, but value is updated.
     System.out.println(stdAges);


     //If the key does not exist, when you use get method what happens?
     //if the key does not exist it returns null for non-existing keys
     Integer unknownAge = stdAges.get("Abc Xyz");
     System.out.println(unknownAge);     //null


    // getOrDefault("Abc Xyz", 0); method returns the value of "Abc Xyz" if Abc Xyz exists among the keys.
    // returns the values of second parameter if Abc Xyz does not exist among the keys.
    int unknownAge2  = stdAges.getOrDefault("Abc Xyz", 0);  //get part will be active if key exist
    System.out.println(unknownAge2);       //if student does not take exam, his name will not be visible, his great will be zero automatically


    //I want to put an entry if it does not exist, if the entry exists it will not put it.
    stdAges.putIfAbsent("Brad Pit", 44);
    System.out.println(stdAges);        //Brad Pit and his age did not changed.
    //It put new value, if the value does not exist.


   stdAges.putIfAbsent("Cuneyt Arkin", 44);
   System.out.println(stdAges);


   //How to update the value of a key.
   stdAges.replace("Tom Hanks", 56);
   System.out.println(stdAges);

   //How to update the value of a key after checking key and the existing value
   stdAges.replace("Tom Hanks", 56, 66 );    //key, old value, new value
   System.out.println(stdAges);


   //How to remove an entry from map
   stdAges.remove("Someone Unknown" );       //remove just by object key
   System.out.println(stdAges);

   stdAges.remove("Ajda Pekkan", null );       //remove just by (object key. object value), result is boolean
   System.out.println(stdAges);                 // java check conditions. if ket is Ajda Pekkan, if age is null.

   //System.out.println(stdAges.remove("Tom Hanks", 66));  //true




   //How to cat entries one by one form a Map.

   Set<Map.Entry<String, Integer>> entries =  stdAges.entrySet();  //Inside the Map Structure it is Entry, first part is string, second part is Integer.
        //after getting all entries into "entries"

        for(Map.Entry<String, Integer> w:entries) {

            System.out.print(w + "! ");
        }

//If the key is "null", HashCode will be zero, that's way entry whose key is "null" will be put into the bucket whose index is zero.

    }
}
