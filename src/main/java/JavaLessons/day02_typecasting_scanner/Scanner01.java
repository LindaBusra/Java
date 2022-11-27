package JavaLessons.day02_typecasting_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {



        /*Scanner Class:We will get data from user into our cods.
        How to get data from user?
        1. Step: Create en "object" from Scanner Class
        Class name   Object name   Assignment operator   new keyword  constructor-->Class name+()
        Scanner scan = new Scanner(System.in);

        Inside java there are many libraries. inside the libraries there are classes.

         2. Step: Give a message to user about the data you ask.
         3. Step:get the data by the help of the "input" object.


         */


        Scanner input = new Scanner(System.in);
        System.out.println( "what is your adress");
        String adress = input.nextLine();
        System.out.println("Your adress is " + adress);

        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Your age is " + age);


        System.out.println("Enter your name");
        String name = input.next();

        System.out.println( "your name is " + name);



//----------------------------------------------------------------------------


       /*      Scanner class is used to get the data form user into our codes.
       Scanner class-->getting any kind of data from user
       How do we get data from the user?
       1-Step: Create an object from "Scanner Class"

Class Name   Object Name Assignment operator new Keyword     Constructor-->Class Name + ()  ;
Scanner      scan        =                   new             Scanner(System.in);

        2-Step: Give a message yo user about the data you ask
  */



        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String name1 = scan.nextLine();

        System.out.println("What is your age?");
        int age1 = scan.nextInt();
        System.out.println("Welcome " + name1 + ". Your age is " + age1 + ". You are a very beatiful child :)");


    }
}
