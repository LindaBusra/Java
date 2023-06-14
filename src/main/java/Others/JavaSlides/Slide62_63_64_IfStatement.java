package Others.JavaSlides;

import java.util.Scanner;

public class Slide62_63_64_IfStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

// 1-Ask user to enter his/her age. If the age is between 18 and 65 then output will be “You should work”,
//else output will be “No need to work”

//        System.out.println("What is your age?");
//        byte age = scan.nextByte();
//
//        if(age>=18 && age <= 65) {
//            System.out.println("You should work");
//        } else {
//            System.out.println("No need to work");
//        }
//        System.out.println("-----------------------------------------------------------------------------\n");

// 2-Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male
//then output will be “Hey man you retired!” else output will be “No need to work

        System.out.println("What is your age?");
        byte age1 = scan.nextByte();
        System.out.println("What is your gender?");
        String gender = scan.next();

        if(age1>=65) {
            if(gender.equalsIgnoreCase("Male")) {
                System.out.println("Hey man you retired!");
            } else {
                System.out.println("No need to work");
            }
        }
//        System.out.println("-----------------------------------------------------------------------------\n");

// 3-  Ask user to enter a character, then check whether the character is alphabet or not

//        System.out.println("Enter a character?");
//        char character = scan.next().charAt(0);
//
//        int chrcNumber = character;
//
//        if(chrcNumber>=65 && chrcNumber<=90) {
//            System.out.println("The character is alphabet");
//        } else if (chrcNumber>=97 && chrcNumber<=122) {
//            System.out.println("The character is alphabet");
//        } else {
//            System.out.println("The character is not alphabet");
//        }
//        System.out.println("-----------------------------------------------------------------------------\n");

// 4-Ask user ta enter any name of the week, then get second ,fourth, and sixth letter of the day
// name and print them on the console, in the same line.
//For example; if the user enters “Monday” output will be “ody”

//        System.out.println("What is the day?");
//        String day = scan.next();
//
//        System.out.println(day.charAt(1) + "" + day.charAt(3) + "" +  day.charAt(5) );

// 5-Type java code by using if-else statement,
//if the password is “JavaLearner”, output will be “The password is true”.
//Otherwise, output will be “The password is false”.

//        System.out.println("Type java code:");
//        String code = scan.next();
//
//        if(code.equals("JavaLearner")) {
//            System.out.println("The password is true");
//        } else {
//            System.out.println("The password is false");
//        }

// 6-Type java code by using if-else statement, Write a program to print absolute value of a number
// entered by user. Absolute Value: If the number is positive or zero return the number itself
// If the number is negative return the number after multiplying by -1

//        System.out.println("Enter a number");
//        int theNumber = scan.nextInt();
//
//        if(theNumber >= 0) {
//            System.out.println(theNumber);
//        } else {
//            System.out.println(theNumber * (-1));
//        }

// 7) Type java code by using if-else statement.
//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity and unit price then judge and print total cost for user.
//If the quantity is less than 1000 output will be “No discount.

//        System.out.println("What is the quantity?");
//        int quantity = scan.nextInt();
//        System.out.println("What is the unit price?");
//        double price = scan.nextDouble();
//        double totalCost = quantity*price;
//
//        if(totalCost < 1000) {
//            System.out.println("No discount");
//        } else {
//            System.out.println("discount is " + (totalCost*0.90));
//        }

// Ask user ta enter a 4 digits integer, then print the sum of the first
//and the last digit of the number on console.
//For example; if user enters 1234 you will add 1 and 4,
//then print on the console 5

        System.out.println("Enter a 4 digits integer?");
        int num = scan.nextInt();

        int numLast = num%10;    // son basamak 4    5674
        int numFirst = num / 1000;  // ilk basamak

        System.out.println(numFirst + numLast);







    }
}
