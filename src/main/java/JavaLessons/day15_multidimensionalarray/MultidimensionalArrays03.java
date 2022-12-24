package JavaLessons.day15_multidimensionalarray;

import java.util.Arrays;

public class MultidimensionalArrays03 {
    public static void main(String[] args) {


//Example 1-Convert multidimensional array to one dimensional array.


        String str[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        //1.Step : Find the total number of elements in the multidimensional array
        int numOfElement = 0;

        for(String[] w: str) {

            numOfElement += w.length;
        }

        //2.Step: Create one dimensional array by using the total number of elements in multidimensional array

        String ny [] = new String[numOfElement];
        int k = 0;

        //3.Step: Transfer the elements from multidimensional array to one dimensioanl
        for(String[] w : str) {

            for(String n : w) {

                ny[k] = n;
                k++;
            }
        }

        System.out.println(Arrays.toString(ny));
        System.out.println();




//----------------------------------------------------------------------------------


// Example: initialize b[row][col] = row+col

        int a[][] = { {5,0}, {-2,4}, {6,-12,10}};  //-->//[[0, 1], [1, 2], [2, 3, 4]]

        for(int i=0; i<a.length; i++) { /* rows */
            for(int j=0; j<a[i].length; j++) { /* cols */
// process element b[j][k]
                a[i][j] = i + j;
            }
        }
        System.out.println(Arrays.deepToString(a));











    }
}
