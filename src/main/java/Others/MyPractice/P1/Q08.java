package Others.MyPractice.P1;

import java.util.Scanner;

public class Q08 {


    public static void main(String[] args) {



//Question 1-Two numbers are entered through the keyboard. Write a program to find
// the value of one number raised to the power of another. (Do not use Java built-in method)
// for example-->base:2, power:3--> result is 2x2x2=8

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base number");
        int base= scan.nextInt();
        System.out.println("Enter the power number");
        int power= scan.nextInt();
        int result = 1;

        for(int i=1; i<=power; i++) {

            result =  result * base;
        }

        System.out.println("the result is: " + result);





//Question 2-Write a program that prompts the user to input an integer and then outputs the number
// with the digits reversed. For example, if the input is 12345, the output should be 54321.

        int n = 12345;
        String ns = String.valueOf(n);
        String temp ="";

        for(int i=ns.length()-1; i>=0; i--) {

            temp = temp + ns.charAt(i);
        }

        System.out.println(temp);



//--------------------------------------------------------------------------------------------------------------------







    }
}
