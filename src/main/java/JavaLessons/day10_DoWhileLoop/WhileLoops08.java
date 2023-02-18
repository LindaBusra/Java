package JavaLessons.day10_DoWhileLoop;

import java.util.Scanner;

public class WhileLoops08 {

    public static void main(String[] args) {


//Ask user to enter a positive integer and then find and print  the sum of the digits of that number by using while loop.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number please");
        int num = scan.nextInt();
        int sumt= 0;

        while(num>0){

            sumt+=num%10;
            num=num/10;
        }
        System.out.println(sumt);

    }
}
