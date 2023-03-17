package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement22 {

    public static void main(String[] args) {




         /*
		TASK :
		Get age and weight from user
		Children under the age of 18 can not donate blood
		if you are over 18 and lighter than 50 kg, you can not donate blood
		if you are over 18 and greater than 50 kg, you can donate blood
		 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = scan.nextByte();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        if (age > 0 && age < 18) {

            System.out.println("Children under the age of 18 can not donate blood");

        } else if (age >= 18) {

            if (weight > 0 && weight < 50) {
                System.out.println("Your age is suitable to donate but your weight is not enough");
            } else if (weight > 50) {
                System.out.println("Your age and weight are suitable to donate blood");
            } else {
                System.out.println("Invalid weight input");
            }

        } else {
            System.out.println("Invalid input");
        }



    }
}
