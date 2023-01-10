package JavaLessons.day30_hashtable_iterators;

import java.util.Hashtable;

public class HashTable02 {


    public static void main(String[] args) {


        Hashtable<String, Storage > productInfo = new Hashtable<>();

        productInfo.put("Laptop", new Storage(23, "White", 158.98, "Apple", 55));
        productInfo.put("Mouse", new Storage(45, "Black", 78.5, "Logitech", 100));
        productInfo.put("Keyboard", new Storage(40, "Black", 108.5, "Logitech", 75));


        System.out.println(productInfo.get("Laptop"));
        System.out.println(productInfo.get("Mouse").productOwner);


        productInfo.get("Mouse").productOwner.replace("Logitech", "HP" );

        System.out.println(productInfo);


        System.out.println(productInfo);

    }
}
