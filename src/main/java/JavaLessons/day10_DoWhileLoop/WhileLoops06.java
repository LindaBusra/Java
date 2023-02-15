package JavaLessons.day10_DoWhileLoop;

import java.util.Scanner;

public class WhileLoops06 {

    public static void main(String[] args) {


// Question 1) Ask the user for a positive integer less than 100. Print numbers that are multiples of 3 and 5 from 1 to the number entered.

        System.out.println("Enter a number please:");
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();



       while(num>0) {

            if(num%3==0 && num%5==0) {

                System.out.print(num + " ");

            }
           num--;
        }



//Question 2) Ask the user for a positive integer less than 100. Print multiples of 3 from 1 to the number
// entered (including the number).


        int i=3;

        if(i>0) {
            while (i < 100) {

                System.out.print(i + " ");
                i += 3;
            }
        } else {
            System.out.println("Enter a positive number from 1 please");
        }



    }
}
