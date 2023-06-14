package Others.MyPractice.P4;

import java.util.*;

public class Q75 {

    public static void main(String[] args) {


   /*
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    */


            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number");
            int number = scan.nextInt();
            System.out.println(isEven(number));
        }

        private static boolean isEven(int number) {

        return number%2==0;

        }
    }


