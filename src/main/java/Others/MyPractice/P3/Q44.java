package Others.MyPractice.P3;

import java.util.Scanner;

public class Q44 {

    public static void main(String[] args) {

//Ask user to enter his/her name and credit card number and convert all the characters in name and surname to
//asterics except for the initials and last 4 digits of credit card number.

// Tom Hanks==> T** H*** Credit Card Number==> **** **** **** 6785

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name please");
        String firstN = scan.nextLine();
        System.out.println("Enter your last name please");
        String lastN = scan.nextLine();
        System.out.println("Enter your Credit Card Number");
        String ssn = scan.next();

        firstN = firstN.toUpperCase().charAt(0) + firstN.substring(1).replaceAll("\\w", ("*"));

        lastN = lastN.toUpperCase().charAt(0) + lastN.substring(1).replaceAll("\\w", ("*"));


        System.out.print(firstN + " " + lastN + " Credit Card Number==> " );


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }

            System.out.print(" ");
        }
        System.out.println(ssn.substring(12));


    }
}
