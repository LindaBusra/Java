package JavaLessons.day02_typecasting_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {


        //Example 1-Ask user enter to number less than 100, and print to console the sum of number

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter to number less than 100");
        int x=scan.nextInt();
        int y=scan.nextInt();

        System.out.println("Sum of the numbers: "+ (x+y));



        //Example 2-Ask user enter name, and print "Welcome " + name...

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your name please");
        String name = input.next();         //if there is no spase
        System.out.println("Welcome " + name);



        //Example 3-Ask user enter a text, and print this text on the console

        Scanner input1 =new Scanner(System.in);
        System.out.println("Write your text please");
        String text = input1.nextLine();   //if there is space between words
        System.out.println(text);



        //Example 4-Ask user enter to number and print to console the multiply of numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        double s1 = scanner.nextDouble();
        double s2 = scanner.nextDouble();
        System.out.println("the multiply of numbers : " + (s1*s2));




    }
}


