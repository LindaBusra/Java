package Batch159.day12_whileloops;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {


        //Example 1: Type code to print integers from 3 to 6 on the console

        //1.way For-loop
        for(int i=3; i<7; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();


        //2.way While-loop
        int i=3;
        while(i<7){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();



        //Example 2: Type code to print odd integers from 10 to 4 on the console

        int x = 10;
        while(x>3) {

            if(x%2==1) {
                System.out.print(x + " ");
            }
            x--;
        }
        System.out.println();



        //Example 3: Type code to find the sum of the even integers from 10 to 13

        int sum = 0;
        int y =10;

        while(y<14) {

            if(y%2==0) {
                sum += y;
            }
            y++;
        }
        System.out.println("the sum :" + sum);




        //Example 4: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please");
        int num = scan.nextInt();
        int sumOfDigits = 0;


        while(num>0) {

            sumOfDigits += num%10;
            num/=10;
        }

        System.out.println(sumOfDigits);




 /*           Example 5: Type java code by using while loop,
                    Write a program that prompts the user to input a number.
                    It should then print the multiplication table of that number.
                    3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30      */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to see its multiplication table");
        int number = scanner.nextInt();
        int a=1;

        while(a<11) {

            System.out.print(number + "X" + a + "=" + (number*a) + " ");
            a++;

        }






    }
}
