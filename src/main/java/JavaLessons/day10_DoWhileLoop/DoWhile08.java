package JavaLessons.day10_dowhileloop;

import java.util.Scanner;

public class DoWhile08 {

    public static void main(String[] args) {




/* Example - Asking for numbers from the user until a negative value is entered.
Write a program that adds odd numbers and prints them to the screen. note: If a negative number is given,
print "You gave a negative number, you exited the program".
 */


        Scanner scan = new Scanner(System.in);
        int j = 0;
        int sumOfOddNumbers= 0;

        do{
            System.out.println("Enter a number please!");
            int num = scan.nextInt();

            if(num<0){
                System.out.println("You entered an odd number and exited the application!" );
                break;
            }else{
                if(num%2!=0){
                    sumOfOddNumbers = sumOfOddNumbers + num;
                }

            }
        }while(j>-1);
        System.out.println("The sum of odd numbers is: " + sumOfOddNumbers);

    }
}
