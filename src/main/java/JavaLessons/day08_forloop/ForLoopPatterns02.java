package JavaLessons.day08_forloop;

public class ForLoopPatterns02 {
    public static void main(String[] args) {



/*Example 1 -  Type code to draw the following image by using a for loop.

A A A A A
A A A A
A A A
A A
A

*/


    int row=5;

    for(int i=0; i<row; i++) {

        for(int j=0; j<row-i; j++) {

            System.out.print("A ");
        }
        System.out.println();
    }



//---------------------------------------------------------------------------------------------------------------------



/*Example 2 -  Type code to draw the following image by using  for loop.


       /* Pattern
         *
         * *
         * * *
         * * * *
         * * * * *

         */

      int row1 = 5;

      for(int i=0; i<row1; i++) {

          for(int j=1; j<=i+1; j++) {
              System.out.print("* ");


          }
          System.out.println();
      }







    }
}
