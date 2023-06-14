package Others.JavaSlides;

import java.util.Scanner;

public class Slide82_Switch {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

//  1-If the user pressed 1, 2, 3 the program will print the number that is pressed;
//otherwise, program will print "Not allowed"

//        System.out.println("Enter a number");
//        int number = scan.nextInt();
//
//        switch(number) {
//            case 1:
//                System.out.println(number);
//                break;
//            case 2:
//                System.out.println(number);
//                break;
//            case 3:
//                System.out.println(number);
//                break;
//            case 4:
//                System.out.println(number);
//                break;
//            default:
//                System.out.println("Not allowed");
//        }

//  2-Write a Java program user will choose answer among A, B, C, or D.
//If the answer is true, output will be “True.” If the answer is false, output will be
//“False”. Correct answer is ‘C’ for the multiple option question

//        System.out.println("Choose the correct answer:");
//        char answar = scan.next().toUpperCase().charAt(0);
//
//
//        switch (answar) {
//
//            case 'A':
//            case 'B':
//            case 'D':
//                System.out.println("False");
//                break;
//
//            case 'C':
//                System.out.println("True");
//
//      }


// 3-Type java code by using switch statement. A school has following rules for grading system:
//1. For 50 - C 2. For 80 - B. 4. For 100 - A. Ask user to enter marks and print the corresponding grade.

//        System.out.println("Enter the marks");
//        byte mark = scan.nextByte();
//
//        switch (mark) {
//
//            case 50:
//                System.out.println("C");
//                break;
//
//            case 80:
//                System.out.println("B");
//                break;
//
//            case 100:
//                System.out.println("A");
//                break;
//
//            default:
//                 System.out.println("Invalid");
//        }



// 4- Ask user ta enter one of the ‘U’, ’S’, and ‘A’.
//Then type a program by using “switch statement” to print “United” for ‘U’
//”States” for ’S’, and “America” for ‘A’

        System.out.println("Enter one of the ‘U’, ’S’, and ‘A’");
        char name = scan.nextLine().toUpperCase().charAt(0);

        switch (name) {

            case 'U' :
                System.out.println("United");
                break;

            case 'S' :
                System.out.println("States");
                break;

            case 'A' :
                System.out.println("America");
                break;

            default:

        }








//  3-Type java code by using switch statement.
//A school has following rules for grading system:
//1. For 50 - C 2. For 80 - B. 4. For 100 - A
//Ask user to enter marks and print the corresponding grade





//  4-Ask user ta enter one of the ‘U’, ’S’, and ‘A’.
//Then type a program by using “switch statement” to print “United” for ‘U’
//”States” for ’S’, and “America” for ‘A’


    }
}
