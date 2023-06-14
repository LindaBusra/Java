package Batch159.day30_iterators_map;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {

    public static void main(String[] args) {

    /*
           Example 1: Type code to find the number of occurrences of letters in a sentence
                      Java is easy ==> J=1, a=3, v=1, i=1, s=2, y=1
     */

        String str = "Java is easy";
        str = str.replaceAll("[^A-Za-z]", "");      //I will just letters

        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));


        HashMap<String, Integer> occuranceMap = new HashMap<>();

        for(String w: arr) {

            Integer numOfOccurance = occuranceMap.get(w);

            if(numOfOccurance==null){

                occuranceMap.put(w,1);
            } else {
                occuranceMap.replace(w, numOfOccurance+1);
            }
        }

        System.out.println(occuranceMap);           //{a=3, s=2, e=1, v=1, i=1, y=1, J=1}



    }
}
