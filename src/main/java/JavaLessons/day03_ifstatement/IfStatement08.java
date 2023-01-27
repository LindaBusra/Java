package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement08 {

    public static void main(String[] args) {



/*
        Type java code by using if-else if() statement,
        if both of the two integers are positive, output will be the sum of them.
        If both of the two integers are negative, output will be the multiplication of them.
        Otherwise; output will be “I cannot add or multiply different signed numbers”
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num1 = scan.nextInt();

        System.out.println("Enter an integer");
        int num2 = scan.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println(num1 + num2);
        } else if (num1 < 0 && num2 < 0) {
            System.out.println(num1 * num2);
        } else {
            System.out.println("I can not add or multiply different signed numbers");
        }





 /*  TASK : create a double , value is 45
              if double divide 5 and 8. remaining is 0 print "able to divide by 5 and 8"
              if double divide 10 remaining 5 and divide 9 remaining 0.
              print "able to divide by 9 and divide by 10 reminder is 5"
             */


        double n = 45;

        if( n%5==0 && n%8==0) {
            System.out.println(n + " is able to divide by 5 and 8");
        }

        if( n%10==5 && n%9==0) {
            System.out.println(n + " able to divide by 9 and divide by 10 reminder is 5");
        }



    }
}
