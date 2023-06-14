package JavaLessons.day29_hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class Practice05 {
    public static void main(String[] args) {

// Question 6: Get two String from user and create a function to be able to find this Strings are anagram or not?
// For example: RAKI and IRAK are anagram


        HashMap<String,Object> orn = new HashMap<>();
        HashMap<String,Object> orn1 = new HashMap<>();
        String a1 = "RAKI";
        String a2 = "IRAK";
        String arrx[] =  a1.split("");
        String brrx[] = a2.split("");

        for (String w : arrx){
            orn.put(w,0);

        }
        System.out.println(orn);
        for (String w : brrx){
            orn1.put(w,0);
        }
        System.out.println(orn1);

        if (orn.equals(orn1)){
            System.out.println("anagram");
        }

//or

        isAnagram("RAKI", "IRAK");



    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) - 1);
                if (hm.get(c) == 0) {
                    hm.remove(c);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}

