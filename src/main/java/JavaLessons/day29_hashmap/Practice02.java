package JavaLessons.day29_hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice02 {

    public static void main(String[] args) {


        HashMap<String, Integer> student = new HashMap<>();
        student.put("Ali", 20);    //key, value  --->null, max1 ,
        student.put("Veli", 25);
        student.put("Ayse", 22);
        student.put("Hasan", 19);
        student.put("Hale", 18);

        student.put("Ayse", 18);

        System.out.println(student);
        System.out.println(student.get("Veli"));
        System.out.println(student.get("Osman"));    //null

        System.out.println(student.getOrDefault("Osman", 0));
        student.putIfAbsent("Ahmet", 20);   //if "Ahmet" does not exsist, it puts "Ahmet, 20" i HashMap
        System.out.println(student);
        System.out.println("----------------------------------------------");


        Set<String> keys = student.keySet();
        System.out.println(keys);

        Collection<Integer> values = student.values();
        System.out.println(values);

        student.replace("Veli",  30);
        student.replace("Hasan", 19, 21);  //if it is Hasan, if it is 19-->replace

        System.out.println(student);

        student.remove("Ayse");
        student.remove("Hasan", 21);  //If value is 21, change it.
        System.out.println(student);



        Set<Map.Entry<String, Integer>> entries  = student.entrySet();

        for(Map.Entry<String, Integer> w : entries) {

            System.out.print(w + " ");
        }









    }
}
