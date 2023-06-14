package Batch159.practice.practice04;

import java.util.Scanner;

public class Q02_ForLoop_PerfectNumber {

    public static void main(String[] args) {

            /*
   Type code to ask user to enter an integer to check if it is 'Perfect Number' or not."
   A perfect number is a positive integer that is equal to the sum of all its proper divisors.
   6 = 1+2+3, 28 = 1 + 2 + 4 + 7 + 14, (496 and 8128)
    */

      Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please");
        int num = scan.nextInt();
        int sum = 0;

        for(int i=1; i<num; i++) {

            if(num%i==0) {
                sum += i;
            }

        }

        System.out.println(num==sum? num + " is perfect number" : num + " is perfect number");


    }
}
