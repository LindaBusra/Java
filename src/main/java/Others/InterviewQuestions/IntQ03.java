package Others.InterviewQuestions;

import java.util.Scanner;

public class IntQ03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many fibonacci number do you want to see?");
        int num = scanner.nextInt();
        fibonacci(num);

    }

    public static void fibonacci(int num){

        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;
        System.out.print(fibo1 + " " + fibo2 + " ");

        for(int i=1; i<num-1; i++) {

            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

            System.out.print(fibonacci + " ");
        }
    }
}
