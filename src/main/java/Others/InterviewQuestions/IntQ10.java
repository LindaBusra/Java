package Others.InterviewQuestions;

import java.util.*;

public class IntQ10 {
    	/*
	  Count the words in a String one by one
	  String is "Ali came to school and Ayse came to school"
	  Ali=1, came=2, to=2, school=2, and=1, Ayse=1
	 */

    public static void main(String[] args) {

        String str = "Ali came to school and Ayse came to school";
        String str1= str.replaceAll("\\p{Punct}", "");  //clean if there is punction

        String arr[] = str1.split(" ");

        System.out.println(Arrays.toString(arr));



        Map<String, Integer> numOfWords = new HashMap<>();

        for(String w: arr) {

            if (numOfWords.containsKey(w)) {

                numOfWords.put(w, numOfWords.get(w)+1);
            } else {
                numOfWords.put(w,1);

            }
        }

        System.out.println("Number of the words :" + numOfWords);

    }
}

//repeated character/ repeated words