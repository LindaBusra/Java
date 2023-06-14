package Batch159.day32_exceptions;

import JavaLessons.day27_exceptions.IllegalAgeException;

public class Exceptions03 {

    /*
        1)We sometimes need to throw Exception for specific scenarios.
          To do that, use "throw" keyword in method body together with "new" keyword and "Exception Class Constructor"
        2)If you want to add message to your Exception type it inside the "Exception Class Constructor" parenthesis
          Like; throw new IllegalArgumentException("Age cannot be negative");
     */

    public static void main(String[] args) {

        printAge(12);
//        printAge(-12);

        printMathGrade(80);
        printMathGrade(120);
    }


    //Example 1:Create a method prints ages and throws Exception for negative ages
    public static void printAge(int age){

        if(age<0) {
            throw  new IllegalArgumentException("Age can not be negative");  //throw + an object : new IllegalArgumentException()
            //we can write the message in the constructor
        }
            System.out.println("Your age is : " + age);
    }


    //Example 2:Create a method prints the students math grades and throws Exception for the values less than 0 and greater than 100
    public static void printMathGrade(int grade){

        if(grade<0 || grade >100){
            throw new IllegalArgumentException("Grade can not be less than zero or greater than hundred");
        }
        System.out.println("Your math grade is " + grade);
    }


}
