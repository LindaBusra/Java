package JavaLessons.day29_hashmap;

import java.util.*;

public class Practice01 {

    public static void main(String[] args) {



        HashMap hashmap = new HashMap();
        hashmap.put("Java", 1);
        hashmap.put("Hungry", 2);
        hashmap.put("Blogspot", 3);


        System.out.println(hashmap);

        Iterator itr = hashmap.keySet().iterator();
        while (itr.hasNext()) {
            String hashmapkey = (String) itr.next();
            System.out.print(hashmap.get(hashmapkey));
        }
        System.out.println();

//Remember the result can be any order , so if you run the above code , then output could also be
//[123] [231] [132] [213] [312]  as the HashMap is unordered.





//remove one key-value pair from the hashmap object

        HashMap hashmap1 = new HashMap();
        hashmap1.put("Java", 1);
        hashmap1.put("Hungry", 2);
        hashmap1.put("Blogspot", 3);


        //Remove "Java"
        hashmap1.remove("Java");


        //to get just values from a Map
        Set<String> keys = hashmap1.keySet();
        System.out.println(keys);


        //to get just values from a Map
        Collection<Integer> value = hashmap1.values();
        System.out.println(value);


    }
}