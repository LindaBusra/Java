package JavaLessons.day10_dowhileloop;

import java.util.Scanner;

public class WhileLoops13 {

    public static void main(String[] args) {



// Example 1- Take a number from the user, if user enters 0, output must be "you're out of the game".


        Scanner scan = new Scanner(System.in);

        int i=0;

        while(true) {

            System.out.println("Enter a number");
            int input = scan.nextInt();

            if(input==0) {
                System.out.println("you're out of the game");
                break;
            }
            System.out.println("You entered this number: " + input);
        }


    }
}
