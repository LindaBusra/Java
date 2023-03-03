package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array23 {
    public static void main(String[] args) {



//Arrange the list in alphabetical order without separating uppercase and lowercase letters.

        String str[] = { "How",  "we", "use",  "For"," Each", "Loop", "in", "an", "Array"};

        String strNew[] = new String[str.length];

        int i=0;

        for(String w:str) {

            strNew[i] = w.toLowerCase();
            i++;
        }

        Arrays.sort(strNew);
        System.out.println(Arrays.toString(strNew));    // [ each, an, array, for, how, in, loop, use, we]

        //or

        String a [] = new String[str.length];

        for(int m=0; m<str.length; m++) {

            a[m] = str[m].toLowerCase();
        }

        Arrays.sort(a);
                System.out.println(Arrays.toString(a));     //[ each, an, array, for, how, in, loop, use, we]



        }  }