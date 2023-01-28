package JavaLessons.day04_nestedif_switch;

import java.util.Scanner;

public class Switch06 {

    public static void main(String[] args) {




//Create a simple calculator which does addition, subtraction, multiplication, division, percentage calculation


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number");
        double num2 = scan.nextDouble();

        System.out.println("Enter the operation among +, -, *, /");
        char operation = scan.next().charAt(0);



        switch(operation) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 * num2 / 100);
                break;
            default:
                System.out.println("That operation was not supported by this calculator");
        }


    }
}
