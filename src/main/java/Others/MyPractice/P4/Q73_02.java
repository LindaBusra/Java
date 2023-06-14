package Others.MyPractice.P4;

import java.util.HashMap;
import java.util.Map;

public class Q73_02 {

    public static void main(String[] args) {


       /*
       Find the occurance of the each character in given string.
       Test1 data:
       Input = AAABBCDD
       Output = A3B2C1D2
        */



        //1.way
        String str = "AAABBCDD";

        String arr[] = str.split("");
        Map<String, Integer> map = new HashMap<>();

        int count = 1;
        for (String w : arr) {

            if (map.putIfAbsent(w, count) != null) {
                map.put(w, (map.putIfAbsent(w, count) + 1));
            } else {
                map.put(w, count);
            }
        }
        System.out.println(map);

    }
}
