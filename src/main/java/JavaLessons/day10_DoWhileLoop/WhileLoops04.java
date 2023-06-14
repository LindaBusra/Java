package JavaLessons.day10_dowhileloop;

import java.util.Scanner;

public class WhileLoops04 {
    public static void main(String[] args) {





// Example 1- Java program to count the number of digits available in a given number using while loop.

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scan.nextInt();

        int digit = 0;

        while(number != 0) {
            digit++;
            number = number/10;
        }

        System.out.println("The total number if digits is " + digit);    // for 1589 -->4


//------------------------------------------------------------------------------------------------------



// Example 2-Example for break;

        int a=1;
        while(a<10) {
            System.out.println(a);

            if(a==4) {
                break;
            }
            a++;
        }
        System.out.println();




// Example 3- Example for continue;



        for(int b =10; b<=40; b=b+10) {
            if( b ==30) {
             continue;
            }
            System.out.println(b);
        }





    }
}
