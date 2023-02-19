package JavaLessons.day10_DoWhileLoop;

import java.util.Scanner;

public class WhileLoops10 {

    public static void main(String[] args) {



        /*  Example 5: Type java code by using while loop,
        Write a program that prompts the user to input a number.
        It should then print the multiplication table of that number.
        3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int num = scan.nextInt();       //starting value, here 3
        int multp =1;

        while(multp<11) {
            System.out.println(num + "x" + multp + "=" + num*multp) ;

            multp++;
        }

    }
}
