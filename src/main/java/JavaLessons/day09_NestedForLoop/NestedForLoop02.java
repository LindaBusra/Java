package JavaLessons.day09_NestedForLoop;

import java.util.Scanner;

public class NestedForLoop02 {
    public static void main(String[] args) {



/* Example 1- Type code to get the output like

                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
 */

        for (int i = 1; i < 5; i++) {
            System.out.println("Week: " + i);

            for (int j = 1; j < 8; j++) {
                System.out.println("\tDay: " + j);

            }
            System.out.println("....");
        }
        System.out.println();



//---------------------------------------------------------------------------------------------



/* Example- 2:

1
1234
2
1234
3
1234

 */



    for(int i=1; i<4; i++) {
        System.out.println(i); {
            for(int j=1; j<5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }




    }
}
