package Others.MyPractice.P1;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {


/*
Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number
is equal to the number itself, then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
 */
        int originalNumber = 153;
        int givenNumber = originalNumber;
        int sum = 0;

        for (int i = givenNumber; i > 0; i--) {

            int digit = givenNumber % 10;
            sum += digit * digit * digit;
            givenNumber /= 10;


        }

        if (sum == originalNumber) {
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is not Armstrong");
        }



    }}