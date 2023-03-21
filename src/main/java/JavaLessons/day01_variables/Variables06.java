package JavaLessons.day01_variables;

import java.util.Scanner;

public class Variables06 {

    public static void main(String[] args) {

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
