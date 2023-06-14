package Others.MyPractice.P1;

import java.util.*;
import java.util.stream.Collectors;

public class Q13_02 {

    /*
	  Count the words in a String one by one
	  String is "Ali came to school and Ayse came to school"
	  Ali=1, came=2, to=2, school=2, and=1, Ayse=1
	 */


    public static void main(String[] args) {



        String str1 = "Ali came to school, and Ayse came to school.";
        str1 = str1.replaceAll("\\p{P}", "");

        String[] arr = str1.split(" ");

        Arrays.sort(arr);



        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;

                    if (j == arr.length - 1) {
                        i = j;
                    }

                } else {
                    i = j - 1;
                    break;
                }
            }
            System.out.print(arr[i] + "=" + count + " ");

        }



    }
}