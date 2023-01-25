package JavaLessons.day14_arrays_foreachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays_comparator {

    public static void main(String[] args) {



//Example 1- Sort the array elements according to their lengths. ==> "Ali" - "Veli" - "Maria" - "Michael"


        String srr[] = {"Veli", "Michael", "Ali", "Maria"};

        System.out.println(Arrays.toString(srr));       // [Veli, Michael, Ali, Maria]



        //Sort the array elements in ascending order according to their lengths.
        Arrays.sort(srr, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(srr));       // [Ali, Veli, Maria, Michael]



        //Sort the array elements in descending order according to their lengths.
        Arrays.sort(srr, Comparator.comparingInt(String::length).reversed());

        System.out.println(Arrays.toString(srr));       //[Michael, Maria, Veli, Ali]



        //3-Sort the array elements in descending order according to their lengths.
        //If some elements are in the same length put them in alphabetical order==>


        String str [] = {"Veli", "Ayla",  "Veda", "Michael", "Ali", "Maria", "Vidar", "Ole"};
        Arrays.sort(str, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(str));



        //Sort the array elements in descending order according to their lengths. ==> "Michael"- "Maria" - "Veli" - "Ali"

        String trr[] = {"Veli", "Michael", "Ali", "Maria"};
        Arrays.sort(trr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(trr));// [Michael, Maria, Veli, Ali]


        //Sort the array elements in descending order according to their lengths.

        //If some elements are in the same length put them in alphabetical order==> "Michael"- "Maria" - "Ayse", "Veli" - "Ali" - "Can" - "Tan"
        String urr[] = {"Can", "Veli", "Michael", "Ali", "Maria", "Tan", "Ayse"};
        Arrays.sort(urr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        //naturalOrder() means alphabetical order in Strings, ascending order in numbers
        System.out.println(Arrays.toString(urr));


//------------------------------------------------------------------------------------------------------------------------


        // Find the longest word in a String


        String s = "Ali Can have to go to school to learn math";


        String[] list = s.split(" ");

        Arrays.sort(list, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(list));

        System.out.println("\"" + list[list.length-1] + "\"  is the longest word");
















    }
}
