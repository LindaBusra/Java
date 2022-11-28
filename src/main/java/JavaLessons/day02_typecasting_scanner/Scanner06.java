package JavaLessons.day02_typecasting_scanner;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {


 /* Example 2:Get first, middle and the last names and the SSN number from the user
then print them like the given format
        //Tom Hanks
        //2314*****         Tom Hanks,  2314*****   */


        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = scan.nextLine();
        System.out.println("What is your middle name?");
        String middleName = scan.nextLine();
        System.out.println("What is your last name?");
        String lastName = scan.nextLine();
        System.out.println("What is your SSN number?");
        String ssnNumber = scan.nextLine();


        String ssnNumber1=ssnNumber.substring(0,4);
        String ssnNumber2=ssnNumber.substring(4).replaceAll("[0-9]", "*");


        System.out.println(firstName + " " + middleName + " " + lastName + "\n" + ssnNumber1+ssnNumber2);

    }
}
