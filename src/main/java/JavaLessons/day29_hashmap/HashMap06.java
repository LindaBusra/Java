package JavaLessons.day29_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap06 {

    public static void main(String[] args) {

        //find the sum of ages in given Map.

        HashMap<String, Integer> list = new HashMap<>();
        list.put("Ali", 10);
        list.put("Veli", 20);
        list.put("Selin", 15);
        list.put("Can", 12);
        list.put("Hakan", 18);
        list.put("Selma", 25);


        int sum = 0;
        for(Map.Entry<String, Integer> w: list.entrySet()) {

            System.out.println(w.getKey() + " = " + w.getValue());
            sum += w.getValue();
        }

        System.out.println(sum);

    }
}
