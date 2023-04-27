package Batch159.day11_forloops;

import java.util.Scanner;

public class NestedForLoop01 {

    public static void main(String[] args) {


         /*
            Example 1:Type code to get the output like
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

        for(int i=1; i<8; i++) {

            System.out.println("Week: " + i);

            for (int j = 1; j < 8; j++) {
                System.out.println("\tDay: " + j);

            }
        }



/*  2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
    ****
    ****
    ****
    Note: Get the number of the rows and the columns from user   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns");
        int columns = scan.nextInt();

        for(int i=0; i<rows; i++) {

            for(int j=0; j<columns; j++){

                System.out.print("*");
            }
            System.out.println();
        }


    }
}
