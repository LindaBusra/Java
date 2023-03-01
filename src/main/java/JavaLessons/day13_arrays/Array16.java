package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array16 {
    public static void main(String[] args) {


//Example 1- Create a String array and print the elements before "Tom" and "Tom"

        String students [] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for(String w:students) {

            System.out.print(w + " ");

            if(w.equals("Tom")) {
                break;                      // break, switch ve looplarda kullanilir.
            }

        }
        System.out.println();



//------------------------------------------------------------------


//Example 2-Create String array and print the elements just not "Tom"


        String employees [] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for(String w : employees) {

            if(w.equals("Tom")) {
                continue;
            }
            System.out.print(w + " ");          //Ali Thomas Mark Jackson Martin
        }
        System.out.println();



//------------------------------------------------------------------


        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));     // [Ali, Jackson, Mark, Martin, Thomas, Tom]
        System.out.println(Arrays.binarySearch(employees, "Tom"));  //order no  5      //order no=index+1



    }
}
