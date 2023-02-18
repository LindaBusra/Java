package JavaLessons.day10_DoWhileLoop;

import java.util.Scanner;

public class WhileLoops07 {

    public static void main(String[] args) {


        //4.Example: Type java code by using while loop,
//           Write a program that prompts the user to input an integer.
//           It should then find the sum of the digits of that number.
//           123 ==> 1+2+3 = 6


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to find the sum of the digits");
        int num = scan.nextInt();

        int sumOfDigits = 0;

        while(num>0) {

            sumOfDigits = sumOfDigits + num%10;

            num = num/ 10;

        }

        System.out.println(sumOfDigits);
        System.out.println();

    }
}
