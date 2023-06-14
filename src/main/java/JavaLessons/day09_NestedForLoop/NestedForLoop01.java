package JavaLessons.day09_nestedforloop;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {



//Example 1- Type 3 times Hello1 for 1, 3 times Hello2 for 2, 3 times Hello3 for
//3, 3 times Hello4 for4

        for(int i=1; i<5; i++) {

            for(int j=1; j<4; j++) {

                System.out.println("Hello" + i);
            }
       }


//-------------------------------------------------------------------------------------------------------------------



/*Example 2-  Type this rectangle pattern

 * * * *
 * * * *
 * * * *
 * * * *

 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row =scan.nextInt();
        System.out.println("Enter number of columns");
        int columns =scan.nextInt();

        for(int i=1; i<=row; i++) {
            for(int j=1; j<=columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();



//-------------------------------------------------------------------------------------------------------------------



/* Example 3- Type code for this pattern

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */

        int r=5;

        for(int i=1; i<=r; i++) {
            for(int j=1; j<=i; j++) {

                System.out.print(j +" ");
            }
            System.out.println();
        }




























    }

}