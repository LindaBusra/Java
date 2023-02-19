package JavaLessons.day10_DoWhileLoop;

import java.util.Scanner;

public class DoWhile11 {
    public static void main(String[] args) {




//Ask user to enter password, if the password is "password" print "true"
//on the console, otherwise print "false" and "Enter your password" on the console.


    Scanner scan = new Scanner(System.in);
    String password;

    do{
        System.out.println("Enter the password");
        password = scan.next();

        if( ! password.equals("password")) {
            System.out.println("false");
        }

    }while(! password.equals("password"));
            System.out.println("True");





//----------------------------------------------------------------------------------


 /*
Adding the numbers entered by the user and adding when 0 (Zero) is entered
java program that finishes the process and prints it to the screen
  */



    Scanner input = new Scanner(System.in);
    int num, sum = 0;

    do{
        System.out.println("Enter a number");
        num = input.nextInt();
        sum = sum+num;


    }while(num!=0);
        System.out.println("The sum of the number is: " + sum);















    }
}
