package JavaLessons.day06_methods;

import java.util.Scanner;

public class Method08 {

    public static void main(String[] args) {


      /*    Write a method named isEven that accepts an integer argument.
            The method should return true if the argument is even, or false otherwise.
            */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number please :");
        int num = scan.nextInt();
        System.out.println(isEven(num));

    }

    private static boolean isEven(int num) {
        if (num % 2 == 0) return true;
        else return false;

    }

}