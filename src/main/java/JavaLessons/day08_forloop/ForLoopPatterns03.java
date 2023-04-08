package JavaLessons.day08_forloop;

public class ForLoopPatterns03 {

    public static void main(String[] args) {



/*Example 1 - Type code to draw the following image by using a for loop.


A A A A A
A A A A A
A A A A A           */


        int row = 3;
        for(int i=1; i<4; i++ ) {

            for(int j=1; j<row+3; j++) {

                System.out.print("A " );
            }
            System.out.println();
        }





/*Example 2 -  Type code to draw the following image by using  for loop.



 */
        /* Pattern

         *
         * *
         * * *
         * * * *
         * * * * *

         */

        for (int i = 1; i < 6; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
