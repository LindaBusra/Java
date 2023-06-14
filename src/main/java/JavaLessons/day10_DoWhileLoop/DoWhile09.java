package JavaLessons.day10_dowhileloop;

import java.util.Scanner;

public class DoWhile09 {
    public static void main(String[] args) {



 /*
Example 1: Ask user to enter an integer.
If the integer is less than 100, tell user "Won!"
Otherwise, tell user "Lost!"            */



        Scanner scan = new Scanner(System.in);
        int num;

        do{
            System.out.println("Enter a number to play:");
            num = scan.nextInt();

            if(num<100) {
                System.out.println("Won!");
            }

        } while (num<100);
        System.out.println("Lost");
        System.out.println();




        //or



        do{
            System.out.println("Enter a number");
            num = scan.nextInt();

            if(num<0) {
                System.out.println("you entered negative number, try again");
                continue;
            } else if(num<100) {
                System.out.println("Won!");
            } else {
                System.out.println("Lost");
                break;
            }


        }while(true);

    }
}
