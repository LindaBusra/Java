package JavaLessons.day28_collections;

import java.util.HashSet;

public class Practice07 {
    public static void main(String[] argv) throws Exception {


        try {


            HashSet<Integer>  arrset1 = new HashSet<Integer>();

            arrset1.add(1);
            arrset1.add(2);
            arrset1.add(3);
            arrset1.add(4);
            arrset1.add(5);

            System.out.println("HashSet before " + "removeAll() operation : "+ arrset1);



            HashSet<Integer> arrset2 = new HashSet<Integer>();

            arrset2.add(1);
            arrset2.add(2);
            arrset2.add(3);

            System.out.println("Collection Elements"  + " to be removed : " + arrset2);



            arrset1.removeAll(arrset2);


            System.out.println("HashSet after " + "removeAll() operation : " + arrset1);


        }

        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}