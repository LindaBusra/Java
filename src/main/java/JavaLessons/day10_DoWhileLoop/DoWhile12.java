package JavaLessons.day10_DoWhileLoop;

import java.util.Scanner;

public class DoWhile12 {

    public static void main(String[] args) {



  /*
    Username is "admin", Password is "pwd123"
    Ask user to enter username and password
    User should see "Enter your username and password" message
    If user enters correct credentials, he should get "You are in your account!" message
    Otherwise, he should see "Enter your username and password" message 3 times
    After 3 times he should get "Your account is blocked" message
*/

        String username, password;
        int count = 0;

        do{
            if(count==3) {
            System.out.println("Your account is blocked");
            break;
        }

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your username");
            username = scan.next();
            System.out.println("Enter your password");
            password = scan.next();

            if(username.equals("admin") && password.equals("pwd123")) {
                System.out.println("You are in your account!");
                break;
            }
        count++;

        }while(count<4);



    }
}
