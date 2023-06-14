package Others.MyPractice.P5;

import java.util.Arrays;
import java.util.HashMap;

public class Q101 {

    public static void main(String[] args) {



        //Example 1- Type code to print the number of occurrences or words in a sentence.
        // "I like to move it, move it do you like it" --I:1, like:2, to;1, move:2; it:3, do:1, you:1


        String str = "I like to move it, move it do you like it?";

        //Remove punctuation marks
        String sentence = str.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        //Get the words from the sentence by using split() with space
        String words[] = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> occurenceMap = new HashMap<>();      // [              ]

        //"I like to move it, move it do you like it"
        for(String w: words) {

            Integer numOfOccurence = occurenceMap.get(w);

            if(numOfOccurence == null) {

                occurenceMap.put(w,1);

            } else {

                occurenceMap.put(w, numOfOccurence+1);
            }
        }
        System.out.println(occurenceMap);







    }
}
