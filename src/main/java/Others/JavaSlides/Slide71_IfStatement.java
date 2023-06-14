package Others.JavaSlides;

import java.util.Scanner;

public class Slide71_IfStatement {
    public static void main(String[] args) {

 //Q04_after-Type java code by using if-else if() statement,
        //if both of the two integers are positive, output will be the sum of them.
        //If both of the two integers are negative, output will be the multiplication of them.
        //Otherwise; output will be “I cannot add or multiply different signed numbers”

        int a = -22;
        int b = -12;
        if(a>0 && b>0) {
            System.out.println("a+b= " + (a+b));
        } else if (a<0 && b<0) {
            System.out.println("a*b= " + (a*b));
        } else {
            System.out.println("I cannot add or multiply different signed numbers");
        }
        System.out.println("\n<-------------------------------------------------------------------------------------->\n");

//------------------------------------------------------------------------------------------------------------

 /*       Type java code by using if-else if() statement,
                If age is less than 13 output will be “Should not work”,
        If age is greater than 65 output will be “Retired”,
        Otherwise; output will be “Should work”  */

        int age = 35;

        if(age<13) {
            System.out.println("Should not work");
        } else if (age>65) {
            System.out.println("Retired");
        } else {
            System.out.println("Should work");
        }
        System.out.println("\n<-------------------------------------------------------------------------------------->\n");

//------------------------------------------------------------------------------------------------------------

/* Type java code by using if-else if() statement.
A school has following rules for grading system:
1. Below 50 - D 2. 50 to 59 - C 3. 60 to 80 - B. 4. From 80 to 100 - A
Ask user to enter marks and print the corresponding grade.

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = scan.nextInt();

        if (marks < 50) {
            System.out.println("The corresponding grade is D. ");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("The corresponding grade is C.");
        } else if (marks >= 60 && marks <= 79) {
            System.out.println("The corresponding grade is B.");
        } else if (marks >= 80 && marks <= 100) {
            System.out.println("The corresponding grade is A.");
        } else {
            System.out.println("Invalid marks");
        }

        System.out.println("\n<-------------------------------------------------------------------------------------->\n");

//------------------------------------------------------------------------------------------------------------

/*
Ask user to enter year
Type java code by using if-else if() statement.
Write a program to check if a year is leap year or not.
if the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
 */

        int yil = 2017;


        if(yil % 100 == 0) {
            if(yil % 400 == 0) {
                System.out.println( yil + " yılı artık bir yıldır");
            }
        } else if (yil % 4 == 0) {
            System.out.println( yil + " yılı artık bir yıldır");
        } else{
            System.out.println( yil + " yılı artık yıl değildir");

        }

System.out.println("\n<-------------------------------------------------------------------------------------->\n");

//------------------------------------------------------------------------------------------------------------

 /* Ask user to enter annual salary, if the salary is more than or equal
to $80.000 output will be “I accept the offer”, if the salary is between
$60.000 and $80.000 out put will be “I negotiate to increase”,
otherwise output will be “I do not accept the offer.

  */


        System.out.println("Enter the annual salary");
        int salary = scan.nextInt();

        if (salary >= 80000) {
            System.out.println("I accept the offer");
        } else if (salary>= 60000 && salary < 80000) {
            System.out.println("I negotiate to increase");
        } else {
            System.out.println("I do not accept the offer");
        }



















    }
}
