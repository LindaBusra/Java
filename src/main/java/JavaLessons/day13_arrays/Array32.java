package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array32 {
    public static void main(String[] args) {



//Find the vowels in a String by using arrays.   ( a e i o u)
// Print them on the console and find the number of vowels.


        String s = " Learn java, earn money.";

        String ss[] =s.toLowerCase().split("");
        String spare = "";
        int count = 0;


        for(String w: ss ) {

            boolean isVowel = w.equalsIgnoreCase("a") || w.equalsIgnoreCase("e") ||
                    w.equalsIgnoreCase("i") || w.equalsIgnoreCase("o") ||
                    w.equalsIgnoreCase("u");

            if (isVowel) {

                System.out.print(w + " ");
                count++;

                }
            }

        System.out.println();
        System.out.println("There is " + count + " vowel in the sentences");


//---------------------------------------------------------------------------


        String input = "Hello Welcome to TechPro Education";
        String[] result1 = input.split(" ");
        String[] result2 = input.split("X");
        System.out.println(Arrays.toString(result1));   //[Hello, Welcome, to, TechPro, Education]
        System.out.println(Arrays.toString(result2));   //the arrays does not be splitter, because there is no X, so we have just a single element
        System.out.println(result1.length-result2.length);  //5-1=4



    }
}
