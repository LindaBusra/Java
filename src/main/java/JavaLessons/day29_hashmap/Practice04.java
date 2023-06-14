package JavaLessons.day29_hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class Practice04 {

    public static void main(String[] args) {



 // Question 3: There is a Map which contains product names as key and number of the products as value.
// 1-Print the product names in alphabetical order.(Without using TreeMap and TreeSet)
//2- Print the prices in ascending order and descending order.

        Map<String, Integer> product = new HashMap<>();
        product.put("Olive", 25);
        product.put("Sugar", 38);
        product.put("Milk", 58);
        product.put("Egg", 17);
        product.put("Honey", 30);

        System.out.println("Solution 1");
        Set<String> products = product.keySet();
        products.stream().sorted().forEach(t-> System.out.print(t + " "));


        //or
        solution(product);


        System.out.println("Solution 2");

        //ascending
        Collection<Integer> list = product.values();
        list.stream().sorted().forEach(System.out::println);

        //descending
        List<Integer> m= product.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());



    }

    public static void solution (Map<String, Integer> product){
        Set<String> a = product.keySet();
        List<String> b = a.stream().sorted().collect(Collectors.toList());
        System.out.println(b);




    }
}
