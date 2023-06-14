package Others.Topics.Random;

import java.util.Scanner;

public class GuessMyNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int number, // To hold the random number
                guess,  // To hold the number guessed by user
                tries = 0; // To hold number of tries

        number = (int) (Math.random() * 100) + 1; // get random number between 1 and 100   (normally 0.0 ile 1.0), +1-->include 1

        System.out.println("Guess My Number Game");
        System.out.println();

        do
        {
            System.out.print("Enter a guess between 1 and 100 : ");
            guess = scan.nextInt();

            tries++;

            if (guess > number)
            {
                System.out.println("Too high! Static03 Again");
            }
            else if (guess < number)
            {
                System.out.println("Too low! Static03 Again");
            }
            else
            {
                System.out.println("Correct! You got it in " + tries + " guesses!");
            }

        }while (guess != number);
    }
}