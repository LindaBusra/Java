package Batch159.day04_scannerclass;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {



	/* Ask user to enter his/her first name, last name, age, height and weight then print them on console in this way:
	 		First Name: ...
	 		Last Name : ...
	 		Age: ...
	 		Height: ...
	 		Weight: ...
	 Note: Use only one "System.out.println();"  	 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your height (cm)");
        int height = scanner.nextInt();
        System.out.println("Enter your weight");
        double weight = scanner.nextDouble();

        System.out.println("Your information:");
        System.out.println("Your firstname: " + firstName);
        System.out.println("Your lastname: " + lastName);
        System.out.println("Your age: " + age);
        System.out.println("Your height: " + height);
        System.out.println("Your weight: " + weight);







    }
}
