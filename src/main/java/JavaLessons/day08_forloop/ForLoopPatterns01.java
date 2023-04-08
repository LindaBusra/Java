package JavaLessons.day08_forloop;

public class ForLoopPatterns01 {
    public static void main(String[] args) {



/*Example 1 - Create the shape below using a nested loop.

 *****
 ****
 ***
 **
 *

 */

      int row=5;

      for(int i=1; i<=row; i++) {

          for(int j=i; j<6; j++) {

              System.out.print("*");
          }
          System.out.println();
      }
        System.out.println();



      //or  int row = 5; int column=5;
        int column=5;

        for(int i=1; i<=row; i++) {
            for(int j=column; j>=i; j--) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();



//----------------------------------------------------------------------------------------------------------------------



/*Example 2 - Create the shape below using a nested loop.

1****
2***
3**
4*
5

*/


        int row1=5;
        for(int i=1; i<=row1; i++) {
            System.out.print(i);

            for(int j=i+1; j<=row1; j++) {

                System.out.print( "*");
            }
            System.out.println();
        }


        //or   int row = 5; int column=5;
        for(int i=1; i<=row; i++) {
            System.out.print(i);
            for(int j=column; j>i; j--) {

                System.out.print( "*");
            }
            System.out.println();
        }



//----------------------------------------------------------------------------------------------------------------------



/*Example 3 -  Type code to draw the following image by using a for loop.


A
A A
A A A
A A A A      */


      int row2=4;

      for(int i=0; i<row2; i++) {

          for(int j=1; j<=i+1; j++){

              System.out.print("A ");
          }
          System.out.println();
      }









    }
}



