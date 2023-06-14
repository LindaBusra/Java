package Others.MyPractice.P1;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {



//Write a program to enter the numbers till the user wants and at the end it should display the count
// of positive, negative and zeros entered.


        int negativeSum = 0;
        int positiveSum = 0;
        int zero = 0;
        char choose = 'y';
        int i=1;

        do{


            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the " + i + ". number please");
            int input = scan.nextInt();


            if(input<0) {

                negativeSum ++;
            } else if(input>0)  {

                positiveSum ++;
            } else {
                zero++;
            }

            System.out.println("Will do enter a number again? Yes:y / No:n");
            choose = scan.next().toLowerCase().charAt(0);
            i++;


        }while(choose=='y');

        System.out.println("You entered " + positiveSum + " times positive numbers.");
        System.out.println("You entered " + negativeSum + " times negative numbers.");
        System.out.println("You entered " + zero + " times zero.");




    }
}
