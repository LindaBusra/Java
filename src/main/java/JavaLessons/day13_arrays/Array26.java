package JavaLessons.day13_arrays;

import java.util.ArrayList;
import java.util.List;

public class Array26 {

    public static void main(String[] args) {


        /*
         * Type code to find the common elements between two String Arrays
         * (without case sensitivity)
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
         */


        String arr[] = {"John", "Brad", "Angel", "Sofia", "Emily"};
        String brr[] = {"sofia", "brad", "grace", "emily", "hazel"};


        List<String> list = new ArrayList<>();
        for(String w: arr) {

            for(String u : brr) {

                if (w.equalsIgnoreCase(u)) {

                    list.add(w);
                }
            }
        }

        System.out.println(list);



//----------------------------------------------------------------------------------------



// Type all characters before the first occurrence of 'm' in a String
        String sd = "Christmas";

        String m[]= sd.split("");

        for(String w:m) {

            if(w.equals("m")) {
                break;
            }

            System.out.print(w);
        }

    }
}
