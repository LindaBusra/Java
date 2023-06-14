package Others.javaQuestionBank_TechPro;

import java.util.Scanner;
public class Variables1_4 {
    public static void main(String[] args) {
//Java Variables
//Q04_after-Create double variables for the prices of any 3 items. Print the sum of the prices on the console with a label.
        double shirtPrice = 12.99;
        double hatPrice = 23.99;
        double shoesPrice = 15.99;

        System.out.println("Total prise is "+ (shirtPrice+hatPrice+shoesPrice));

// Q2-Create a float variable, a long variable, and an integer variable for any 3 items. Print the multiplication of the values on the console with a label.

        float a= 4.15f;
        long b=12L;
        int c=100;
        System.out.println("Multiplication is " + (a*b*c));

//Q3-Type a code to find simple interest. Note: Simple interest formula = principal * rate * numberOfYear / 100
        int principal = 1000, rate=5, numberOfYear=4;

        System.out.println("Simple interest formula is " + (principal*rate*numberOfYear/100));

//Q4- Create a String and two Long variables. Print the sum and the multiplication of the long variables with the String on the console.

        String text = "This is a text";
        long d= 2345L;
        long e=1234556L;

        System.out.println(text + (d+e));
        System.out.println( text + d*e);

//Q5-Create two boolean variables whose values are different and print their values in the same line with a space between two consecutive values

        boolean f= true;
        boolean g= false;

        System.out.println("I like java. " + f + " yes it is true, but i can not work very hard. No it is " + g);


//Q6- Create 3 float variables for the price of a book, notebook, and laptop. Print the total price of 2 books, 4 notebooks and 3 laptops on the console

        float priceBook = 3.25f;
        float priceNotebook = 5.42f;
        float priceLaptop = 600.95f;

        System.out.println("Total prise for 2 books, 4 notebooks and 3 laptops is " + ((2*priceBook) + (4*priceNotebook) + (3*priceLaptop)));



//Q7-Type a code to swap two integers.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter to numbers to swap");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Before swapping the numbers num1 is " + num1 + " and num2 is " + num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After swapping the numbers num1 is " + num1 + " and num2 is " + num2);
    }
}

