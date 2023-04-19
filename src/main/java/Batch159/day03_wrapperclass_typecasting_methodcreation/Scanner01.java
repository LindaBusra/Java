package Batch159.day03_wrapperclass_typecasting_methodcreation;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //How to create an Object?
        //Class Name   Object Name  Assignment Operator  "new" keyword      Constructor
        Scanner input             =                new         Scanner(System.in);

        //Scanner: To create an Object tell Java which template you want to use, input: object name,  assignment operator
        //new: keyword in Java (I want an Object which is created from scratch),  Scanner(System.in):constructor, and System.in is parameter,  and ; ending statement
        //in every object creation we need constructor, and it is for constructing object
        //there is two ways for create object  1)from scratch,   2) converting

        System.out.println("Hey user enter your first name...");

        String name = input.next();

        System.out.println("Your name is " + name);

        //In Java there are libraries like util, io.  In util we have some classes like Scanner.




        //Example 1: Ask user to enter two numbers then do addition and multiplication operations with the numbers

        //1.Step: Create a Scanner object
        Scanner scan  = new Scanner(System.in);

        //2. Step: Give a message to user about what to do?
        System.out.println("Enter first number");

        //3. Step: Select appropriate method and get the data from user
        double num1 = scan.nextDouble();

        System.out.println("Enter second number");
        double num2 = scan.nextDouble();

        System.out.println("The multiplication is : " + num1*num2 );
        System.out.println("The sum is : " + (num1+num2) );


    }

}
