package JavaLessons.day10_DoWhileLoop;

import java.util.Scanner;

public class DoWhile04 {

    public static void main(String[] args) {


//Password

 /*Username is "admin", password is "pwd123"
 ask user to enter username and password
 user should se "enter your name og password" message.
 if he enters correct credentials he should get "you are in your account" message
 otherwise he should see "enter your username and password" message 3 times
 after 3 times he should get "your account is blocked" message  */

        Scanner scan = new Scanner(System.in);
        String pas, name;
        int counter = 0;

        do{
            if(counter==3){
                System.out.println("Your account is blocked!");
                break;
            }

            System.out.println("Enter your name");
            name = scan.nextLine();
            System.out.println("Enter your password");
            pas = scan.nextLine();

            if(name.equals("admin") && pas.equals("pwd123")) {
                System.out.println("You are in your account");
                break;
            }
            counter++;

        }while(counter<4);




    }
}
