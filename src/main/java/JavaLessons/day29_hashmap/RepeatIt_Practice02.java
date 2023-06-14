package JavaLessons.day29_hashmap;

import java.util.HashMap;

public class RepeatIt_Practice02 {

    public static void main(String[] args) {


        /* Question 1: Google and Facebook Interview Question: Write a function to be able to find the element which repeat first inside the String.
        String s = "ABCBDB"; */


        String s = "ABCBDB";
        String str[] = s.split("");
        HashMap<String, Integer> list = new HashMap<>();

        for (String w : str) {

            if (!list.containsKey(w)) {

                list.put(w, 1);

            } else {
                System.out.println(w);
                break;
            }
       }

        //or
//        for (String w: list.keySet()){
//            if (list.get(w)>1){
//                System.out.println(w);
//                break;
//            }
//        }


        getFirstRepEle("ABCBDB");





    }


    public static void getFirstRepEle(String s) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String c = s.substring(i, i + 1);
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                System.out.println(c);
                break;
            }
        }
    }
}