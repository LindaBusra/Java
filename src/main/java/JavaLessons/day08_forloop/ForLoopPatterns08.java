package JavaLessons.day08_forloop;

public class ForLoopPatterns08 {
    public static void main(String[] args) {





/* Type code for this pattern


 *
 * *
 * * *
 * * * *
 * * * * *

 */


        int row = 5;

        for(int i=1; i<=row; i++) {

            for(int j=1; j<=i; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }

        System.out.println();




//------------------------------------------------------------




/*  Type code for this pattern


    0
    1 1
    2 2 2
    3 3 3 3
    4 4 4 4 4



 */




        int row1 = 5;

        for(int i=0; i<row1; i++) {

            for(int j=0; j<=i; j++) {
                System.out.print(i+  " ");
            }
            System.out.println();
        }













}
}
