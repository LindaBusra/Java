package JavaLessons.day09_NestedForLoop;

import java.util.Scanner;

public class NestedForLoop03 {

    public static void main(String[] args) {




/* Example - Type java code by using while loop, Write a program that prompts the user to input an integer.
It should then find the sum of the digits of that number. 123 ==> 1+2+3 = 6          */

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int num = scan.nextInt();

    int sumOfDigit = 0;

    while(num>0) {
        sumOfDigit = sumOfDigit + num %10;
        num = num/10;

    }
            System.out.println(sumOfDigit);








    }
}
