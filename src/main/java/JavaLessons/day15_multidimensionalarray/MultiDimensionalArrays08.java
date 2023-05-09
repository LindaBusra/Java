package JavaLessons.day15_multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArrays08 {

    public static void main(String[] args) {



//Convert arr1 to one dimensional array.    !!!!!

//  { {"learn", "java", "it"}, {"is", "easy"} } ==>  { "learn", "java", "it", "is", "easy" }



    String arr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

    int summ = 0;

    for(String []w: arr) {
        for(String m :w) {
           summ++;
        }
    }
        System.out.println("total number of element : " +summ);     //5


        String ny[] = new String[summ];
        int i=0;

        for(String w[]: arr)  {

            for( String m : w) {

                ny[i] = m;
                i++;

            }
        }

        System.out.println(Arrays.toString(ny));

    }
}
