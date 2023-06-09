package JavaLessons.day13_arrays;

public class Array34 {

    public static void main(String[] args) {



//Print the words ending with "y" or "Y"         // (Make code case-insensitive)
//Print the words starting with "L" or "l"

        String t = "Learn Java, earn money.";

        t = t.replaceAll("\\p{Punct}", "").trim();

        System.out.println(t);          //Learn Java earn money

        String newT[] = t.split(" ");



        for(String w : newT) {

            if(w.endsWith("y") || w.endsWith("Y") ) {
                System.out.print(w + " ");          //word which end with y or Y
            }

        }
        System.out.println();



        for(String w : newT) {

            if(w.startsWith("l") || w.startsWith("L") ) {
                System.out.print(w + " ");          //word which start with L or l
            }

        }
        System.out.println();

    }
}
