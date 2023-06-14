package Others.Topics.InterviewQuestions;

import java.util.Scanner;

public class IntQ04 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer to check if it is prime or not");
        int num = scanner.nextInt();

            isPrime(num);


    }

    public static void isPrime(int num) {

        if (num > 0) {
            int count = 0;
            for (int i = 1; i <= num; i++) {

                if (num % i == 0) {
                    count++;
                }

            }

            if (count > 2) {
                System.out.println("The given number " + num + " is not prime");
            } else {
                System.out.println("The given number " + num + " is prime");
            }
        } else {
            System.out.println("The entered number is not a positive number");
        }
    }
}