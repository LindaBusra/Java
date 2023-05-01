package Batch159.day15_multidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArray02 {

    public static void main(String[] args) {


//Example 1: Convert a multidimensional array to a one dimensional array
//           { {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }

        String [][] words =  { {"learn", "java", "it"}, {"is", "easy"} };

        //1.Step: Create a one dimensional array
        //We need to calculate the number of elements in the multidimensional array


        int numberOfElements = 0;

        for(String[] w: words) {

            numberOfElements += w.length;
        }
        System.out.println(numberOfElements);

        String [] newWords = new String[numberOfElements];


        //2.Step: Transfer from multidimensional array to one dimensional array
        int idx = 0;
        for(String[] w: words) {

            for(String u : w) {

                newWords[idx] = u;
                //newWords[0] = "Learn"
                //newWords[1] = "Java"
                //newWords[2] = "it"
                idx++;
            }
        }

        System.out.println(Arrays.deepToString(newWords));
    }
}
