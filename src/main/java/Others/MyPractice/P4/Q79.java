package Others.MyPractice.P4;

import java.util.Scanner;

public class Q79 {


    public static void main(String[] args) {


        //Get 2 numbers from the user.
        //first number base
        //second number Top
        //Write a code that calculates the prime of a number.
        // 2, 3 --> 2^3 = 2*2*2= 8

        // 4, 3 --> 4^3= 4*4*4 = 64


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number please");
        int first = scanner.nextInt();
        System.out.println("Enter second number please");
        int second = scanner.nextInt();


        System.out.println("the prime of a number: " + Math.pow(first, second));
    }
}
