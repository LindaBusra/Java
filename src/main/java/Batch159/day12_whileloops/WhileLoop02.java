package Batch159.day12_whileloops;

import java.util.Scanner;

public class WhileLoop02 {

    public static void main(String[] args) {


        /*
            Example 1: Write a Java Program to Print Rectangle Star Pattern using while Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows please:");
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns please:");
        int columns = scan.nextInt();

        int rowStart = 1;

        while(rowStart<=rows) {

            int columnStart=1;
            while(columnStart<=columns) {
                System.out.print("* ");
                columnStart++;

            }
            rowStart++;
            System.out.println();
        }
    }
}
