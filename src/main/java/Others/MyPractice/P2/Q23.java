package Others.MyPractice.P2;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {


/*   Type this pattern on the console

* * * * *
* * * *
* * *
* *
*

        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        for (int i=0; i<num; i++) {

            for (int j=1; j<=num-i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }


/*  Type this pattern on the console

 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *

  */





        System.out.println();

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("  ");
            }
            for (int k = i; k < num; k++) {

                System.out.print("* ");
            }
            for (int l = i; l < num - 1; l++) {

                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
