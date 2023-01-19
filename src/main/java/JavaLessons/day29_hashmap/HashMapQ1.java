package JavaLessons.day29_hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapQ1 {

    public static void main(String[] args) {


        //Example 1- Type code to print the number of occurrences of letters in a sentence.

        //1.way
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to see repeated characters");
        String str = scan.nextLine();
        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
        String arr[] = str.split("");
        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++) {      //  a r a b a
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                } else {
                    i = j - 1;
                    break;
                }
            }

                System.out.println(arr[i] + " = " + count);


        }



        //2.way

        String str1 = "Hello!";

        str1 = str1.replaceAll("[^a-zA-Z]", "");
        String arr1[] = str1.split("");


        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String w : arr1) {
            if (!map.containsKey(w)) {
                map.put(w, 1);
            } else {
                map.put(w, map.get(w) + 1);
            }
        }
        System.out.println(map);



        //Get the letters which one is more than 1.
        for (Map.Entry<String, Integer> w : map.entrySet()) {
            if (w.getValue() > 1) {
                System.out.println(w.getKey() + " = " + w.getValue());
            }
        }
    }
}