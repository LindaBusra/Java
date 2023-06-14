package Others.MyPractice.P3;

import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {

    /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
    */



        Scanner scan = new Scanner(System.in);
        int number = 0;


        do {
            System.out.print("Enter a number please :");
            number = scan.nextInt();
            if (number < 100) {
                System.out.println("Won!");
            }

        } while (number<100);
        System.out.println("Lost!");

    }
}
