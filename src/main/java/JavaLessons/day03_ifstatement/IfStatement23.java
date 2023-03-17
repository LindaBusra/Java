package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement23 {

    public static void main(String[] args) {



        // TASK : Write a code that get a character(a letter) from user and check if it is capital,lowercase letter or invalid input


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        char letter = scan.next().charAt(0);

        if(letter >='A' && letter <='Z') {

            System.out.println("It is uppercase letter");
        }else if(letter >='a' && letter <='z' ){

            System.out.println("It is lowercase letter");
        }else{

            System.out.println("Invalid input ");
        }

    }
}
