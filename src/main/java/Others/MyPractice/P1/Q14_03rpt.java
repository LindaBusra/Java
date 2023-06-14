package Others.MyPractice.P1;

import java.util.Arrays;
import java.util.HashMap;

public class Q14_03rpt {

    public static void main(String[] args) {


        //Example 1- Type code to print the number of occurrences or words in a sentence.
        // "I like to move it, move it do you like it" --I:1, like:2, to;1, move:2; it:3, do:1, you:1


        String str = "I like to move it, move it do you like it?";

        String str2 = str.replaceAll("\\p{Punct}", "");
        System.out.println(str2);

        String words [] =str2.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> mylist = new HashMap<>();

        for(String w: words) {

            Integer value =mylist.get(w);

            if(value==null) {
                mylist.put(w,1);
            } else {
                mylist.put(w, value+1);
            }
        }
        System.out.println(mylist);
    }
}
