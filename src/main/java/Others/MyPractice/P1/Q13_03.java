package Others.MyPractice.P1;

import java.util.*;
import java.util.stream.Collectors;

public class Q13_03 {

    /*
	  Count the words in a String one by one
	  String is "Ali came to school and Ayse came to school"
	  Ali=1, came=2, to=2, school=2, and=1, Ayse=1
	 */


    public static void main(String[] args) {

        String str = "Ali came to school, and Ayse came to school.";
        str = str.replaceAll("\\p{P}", "");

        String words[] = str.split(" ");





        harfRakamBulma(words);



    }

    public static void harfRakamBulma(String words[]) {

        Arrays.stream(words)
                .collect(Collectors.groupingBy(t -> t, HashMap::new, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " = " + v));

    }

}