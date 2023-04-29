package Batch159.day13_dowhileloop_arrays;

import java.util.Scanner;

public class DoWhile01 {

    public static void main(String[] args) {


                /*
            Username is "admin", Password is "pwd123"

            Ask user to enter username and password
            User should see "Enter your username and password" message

            If user enters correct credentials, he should get "You are in your account!" message

            Otherwise, he should see "Enter your username and password" message 3 times
            After 3 times he should get "Your account is blocked" message
	    */
        int count =0;


        Scanner scan = new Scanner(System.in);

        do {

            if (count == 3) {
                System.out.println("Your account is blocked");
                break;
            }

            System.out.println("Enter your username and password");
            String username = scan.next();
            String password = scan.next();


            if (username.equals("admin") && password.equals("pwd123")) {
                System.out.println("You are in your account!");
                break;
            } else {

                    System.out.println("Your username or password is wrong");

            }
            count++;

        }while (true) ;


    }
}
