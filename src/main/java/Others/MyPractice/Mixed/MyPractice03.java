package Others.MyPractice.Mixed;

import java.util.HashMap;
import java.util.Map;

public class MyPractice03 {

    public static void main(String[] args) {


// Question 21- Create a Map which contains product names as key and number of the products as value.
//Type code to check if "Laptop" is among the products
//And get its value

//        print all the numbers in ascending order
//        Print the product names in alphabetical order.


        Map<String, Integer> product = new HashMap<>();
        product.put("LapTop", 3500);
        product.put("Fridge", 4000);
        product.put("TV", 2500);
        product.put("Sofa", 1800);
        product.put("Drawer", 900);

        String askedProduct = "LapTop";

        if(product.containsKey(askedProduct)){
            System.out.println(askedProduct + " exists among the products and its value is " + product.get(askedProduct));
        }else{
            System.out.println(askedProduct + " does not exists");
        }

//        Object[] productPrices =  product.values().toArray();
//        Arrays.sort(productPrices);
//        System.out.println(Arrays.toString(productPrices));


    }
}
