package JavaLessons.day04_nestedif_switch;

import java.util.Scanner;

public class NestedIfStatement03 {

    public static void main(String[] args) {



        /*
        Type java code by using nested if statement,
        If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
        “Perfect even number” otherwise, the output will be “Good even number.”
        If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
        “Perfect odd number” otherwise, the output will be “Good odd number.”
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num = input.nextInt();

        if (num % 2 == 0) {
            if (num % 3 == 0) {
                System.out.println("Perfect even number");
            } else {
                System.out.println("Good even number");
            }
        } else if (num % 2 != 0) {
            if (num % 3 == 0) {
                System.out.println("Perfect odd number");
            } else {
                System.out.println("Good odd number");
            }
        }
    }
}
