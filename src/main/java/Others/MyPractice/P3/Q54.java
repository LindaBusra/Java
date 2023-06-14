package Others.MyPractice.P3;

import java.util.HashMap;
import java.util.Map;

public class Q54 {

    public static void main(String[] args) {




      /*  Create a method that count the number of the occurrences of the characters in a given String by using HashMap
        Test1 Data:
        Input = "AAABBCDD"
        Output ={A=3, B=2, C=1, D=2}
                */



        String s = "AAABBCDD";
        String str = s.replaceAll("\\p{Punct}","").toUpperCase();

        String arr[] =str.split("");

        Map<String,Integer> word=new HashMap<>();


        for (String w: arr){
            if (!word.containsKey(w)){
                word.put(w,1);
            }else {
                word.put(w,word.get(w)+1);
            }
        }
        System.out.println(word);


    }
}
