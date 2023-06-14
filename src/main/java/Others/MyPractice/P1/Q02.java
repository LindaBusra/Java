package Others.MyPractice.P1;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {



//1-Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        int resEven = 0;
        int resOdd = 0;
        char choose = 'y';
        int i=1;

        do{


            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the " + i + ". number please");
            int input = scan.nextInt();


            if(input%2==0) {

                resEven += input;

            } else  {

                resOdd += input;
            }

            System.out.println("Will do enter a number again? Yes:y / No:n");
            choose = scan.next().toLowerCase().charAt(0);
            i++;


        }while(choose=='y');

        System.out.println("the sum of the odd numbers: " + resOdd);

        System.out.println("the sum of the even numbers: " + resEven);




    }}
