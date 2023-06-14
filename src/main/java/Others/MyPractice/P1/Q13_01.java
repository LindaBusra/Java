package Others.MyPractice.P1;

import java.util.*;
import java.util.stream.Collectors;

public class Q13_01 {

    /*
	  Count the words in a String one by one
	  String is "Ali came to school and Ayse came to school"
	  Ali=1, came=2, to=2, school=2, and=1, Ayse=1

	  And get the repeated words
	 */


    public static void main(String[] args) {

        String str = "Ali came to school, and Ayse came to school.";
        str = str.replaceAll("\\p{P}", "");

        String words[] = str.split(" ");




        List<String> wordsList = new ArrayList<String>();       //or List<String> wordArr = Arrays.asList(words);

        for (String w : words) {
            wordsList.add(w);
        }


        System.out.println(wordsList);// [Ali, came, to, school, and, Ayse, came, to, school]

        Map<String, Integer> numOfWords = new HashMap<>();// {                                   }

        for (String w : wordsList) {

            if (numOfWords.containsKey(w)) {

                numOfWords.put(w, numOfWords.get(w) + 1);

            } else {

                numOfWords.put(w, 1);
            }
        }
        System.out.println(numOfWords);


        //Get the letters which one is more than 1.

        for (Map.Entry<String, Integer> w : numOfWords.entrySet()) {
            if (w.getValue() > 1) {
                System.out.println(w.getKey() + " = " + w.getValue());


            }
        }


    }

}