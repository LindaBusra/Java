package JavaLessons.day29_hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapQ2 {

    public static void main(String[] args) {


        HashMap<Integer, String> list=new HashMap<>();
        list.put(1,"Java");
        list.put(2,"HTML");
        list.put(3,"PHP");
        list.put(null,"SQL");
        System.out.println(list);

        list.put(null,"UiPath");        //it allows just a "null" key, an updated the value
        System.out.println(list);


        list.put(3,"C++");      //updated PHP with C++
        System.out.println(list);

        list.put(4,"C++");
        System.out.println(list);

        list.put(5,null);
        System.out.println(list);


        System.out.println("get  key:1" + list.get(1));
        System.out.println(list.get(5));  //null




        System.out.println(list.keySet());      //to get just keys
        System.out.println(list.values());      //to get just values


        //to get just keys
        Set<Integer> keys = list.keySet();
        System.out.println(keys);

        //to get just values
        Collection<String> values = list.values();
        System.out.println(values);

    }
}
