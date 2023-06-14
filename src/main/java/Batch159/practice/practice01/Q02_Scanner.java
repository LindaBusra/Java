package Batch159.practice.practice01;

import java.util.Scanner;

public class Q02_Scanner {
    /*
  Ask user to enter his/her first name, last name, age, height and weight then print them on console in this way:
          First Name: ...
          Last Name : ...
          Age: ...
          Height: ...
          Weight: ...
  Note: Use only one "System.out.println();"
  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your lastname");
        String lastName = scanner.nextLine();
        System.out.println("Enter your age");
        byte age = scanner.nextByte();
        System.out.println("Enter your height");
        double height = scanner.nextDouble();
        System.out.println("Enter your weight");
        int weight = scanner.nextInt();

        System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nAge: "+age+"\nHeight: "+height+"\nWeight: "+weight);

    }
}
