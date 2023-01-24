package JavaLessons.day14_arrays_foreachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Array47 {

    public static void main(String[] args) {





//Example - Type code to find the longest word in the sentence


        String s = "I want to go to university to learn more";

        String ss[] = s.split(" ");

        String longest = "";


        for(String w: ss) {

            if(w.length()>longest.length()) {

                longest = w;
            }
        }

        System.out.println("The longest word in the sentence is: " + longest);



        //2.way

        String st = "I want to go to university to learn more";
        String words[] = st.split(" ");

        System.out.println(Arrays.toString(words));   // [I, to, go, to, to, want, more, learn, university]

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(words));

        System.out.println(words[words.length-1]);      // university




    }

    public static class Array48 {

        public static void main(String[] args) {



    //Find the number of vowels in a String

            String str = "I like to move it move it";
            String arr[] = str.split("");
            int counter =0;

            for (String w: arr){
                switch (w){
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                    case "A":
                    case "E":
                    case "I":
                    case "O":
                    case "U":
                        counter++;
                }
            }
            System.out.println(counter);



        }
    }
}
