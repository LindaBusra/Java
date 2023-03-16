package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement20 {

    public static void main(String[] args) {



// TASK:   A number entered by the user.  Create the code that prints the absolute value.


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = scan.nextInt();

        if (num > 0) {
            System.out.println("num = " + num);
        } else if (num < 0) {
            System.out.println("num = " + (num * -1));
        } else {
            System.out.println("Invalid input");
        }

        //or

        System.out.println("num is : " + Math.abs(num));




    }
}
