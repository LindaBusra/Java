package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {



//Ask user to enter 2 number, and mathematical operation, and write the console the result.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1= scan.nextDouble();
        System.out.println("Enter the second number");
        double num2= scan.nextDouble();

        System.out.println("Select the operation you want  : \n1-Addition\n2-Subtraction" +
                "\n3-Multiplication\n4-Division" );
        int islem = scan.nextInt();

        if(islem==1) {
            System.out.println("The result is " + (num1+num2));
        } else if (islem==2) {
            System.out.println("The result is " + (num1 - num2));
        } else if (islem==3) {
            System.out.println("The result is " + (num1 * num2));
        } else if (islem==4) {
            System.out.println("The result is " + (num1 / num2));
        } else {
            System.out.println("Your enter is not valid.");
        }



    }

}
