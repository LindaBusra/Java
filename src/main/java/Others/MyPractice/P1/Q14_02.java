package Others.MyPractice.P1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Q14_02 {
    public static void main(String[] args) {


        //Example 1- Type code to print the number of occurrences of letters in a sentence.
        ////Get the letters which one is more than 1.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to see repeated characters");
        String str = scan.nextLine();




        findRepeated(str);

    }




    private static void findRepeated(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");
        String arr[] = str.split("");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String w : arr) {
            if (!map.containsKey(w)) {
                map.put(w, 1);
            } else {
                map.put(w, map.get(w) + 1);
            }
        }
        System.out.println(map);      // Get all characters


        //Get the letters which one is more than 1.

        for (Map.Entry<String, Integer> w : map.entrySet()) {
            if (w.getValue() > 1) {
                System.out.println(w.getKey() + " = " + w.getValue());


            }
        }
    }}