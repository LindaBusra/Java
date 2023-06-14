package Others.MyPractice.P2;

import java.util.Scanner;

public class Q41 {

    public static void main(String[] args) {


        // Write a code that checks your pin code as a string.


        Scanner scanner = new Scanner(System.in);
        String pin = "eylem.12345";
        int inputRight = 4;

        System.out.println("******Welcome******");

        while (true) {
            System.out.println("Enter pin code");
            String enteredPin = scanner.next();

            if (pin.equals(enteredPin)) {
                System.out.println("You have successfully logged in....");
                break;
            } else {
                System.out.println("You entered wrong");
                inputRight --;
                System.out.println("Your remaining login: " + inputRight );
            }
            if (inputRight  == 0) {
                System.out.println("You are out of access... your sim card is blocked");
                break;
            }

        }




    }

}

