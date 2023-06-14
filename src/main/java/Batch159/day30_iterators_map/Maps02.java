package Batch159.day30_iterators_map;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        //Example 1: Type code to find the number of occurrences of the words in a sentence
        //           Java, I like Java Java. ==> Java=3, I=1, like=1

        String sentence = "Java, I like Java Java.";
        System.out.println(sentence);

        //Remove punctuation marks to make "Java," and "Java" and "Java." same with the "Java"
        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        //To get the words use split(" ")
        String words[] = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> occurenceMap = new HashMap<>();

        for(String w: words){
            Integer numOfOccurance = occurenceMap.get(w);
            if(numOfOccurance==null){
                occurenceMap.put(w, 1);
            } else {
                occurenceMap.replace(w, numOfOccurance+1);
            }
        }

        System.out.println(occurenceMap);       //{Java=3, like=1, I=1}
    }
}
