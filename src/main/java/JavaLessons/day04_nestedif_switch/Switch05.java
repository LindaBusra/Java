package JavaLessons.day04_nestedif_switch;

import java.util.Scanner;

public class Switch05 {

    public static void main(String[] args) {


        //ATM project

        Scanner scan = new Scanner(System.in);
        int balance = 1000;

        System.out.println("Select the action you want to do ");
        System.out.println("1: View balance");
        System.out.println("2: Deposit money");
        System.out.println("3: Withdraw money");
        System.out.println("4: Exit");

        int action = scan.nextInt();
        switch (action) {
            case 1:
                System.out.println("Your balance is : " + balance + " $");
                break;
            case 2:
                System.out.println("How much money will you deposit? ");
                int amount = scan.nextInt();
                balance = balance + amount;
                System.out.println("Your last balance " +  balance) ;
                break;
            case 3:
                System.out.println("How much money will you get? ");
                int withDraw = scan.nextInt();
                balance = balance - withDraw;
                System.out.println("Your last balance " +  balance) ;
                break;
            case 4:
                System.out.println("Exit from system...");
                break;
            default:
                System.out.println("Invalid action");
        }




/*Type java code by using switch statement.
        A school has following rules for grading system:
1. For 50 - C 2. For 80 - B. 4. For 100 - A
Ask user to enter marks and print the corresponding grade.
 */

        int a = 85;

        switch(a) {
            case 50:
                System.out.println("Grade is C");
                break;
            case 80:
                System.out.println("Grade is B");
                break;
            case 100:
                System.out.println("Grade is A" + a);
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
