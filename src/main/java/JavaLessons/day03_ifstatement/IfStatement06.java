package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement06 {

    public static void main(String[] args) {




/* Example -  Ask user to enter a password

      If the initial of the password is uppercase
            Check if it is 'A' or not.
            If it is 'A' the output will be "Valid Password"
            otherwise the output will be "Invalid Password"
            For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

      If the initial of the password is lowercase
            Check if it is 'z' or not.
            If it is 'z' the output will be "Valid Password"
            otherwise the output will be "Invalid Password"
            For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
    */

          Scanner scan = new Scanner(System.in);
          System.out.println("Enter password");
          char pasw = scan.nextLine().charAt(0);

          if(pasw =='A' || pasw =='z') {
              System.out.println("Valid Password");
          } else {
              System.out.println("Invalid Password");
          }


    }
}
