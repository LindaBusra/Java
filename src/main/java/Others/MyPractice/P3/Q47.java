package Others.MyPractice.P3;

import java.util.Scanner;

import static Others.MyPractice.P3.Person.getEmail;

public class Q47 {

    public static void main(String[] args) {


    /*
    Type a program that ask user their name and lastname, then create an email for the user
    concatenate the name and lastname then add @gmail.com
     */


            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type your name and lastname to see your company email");
            String name = scanner.nextLine();




            System.out.println("Person's email : " + getEmail(name));
    }


    public static String getEmail(String name) {

        return (name.replace(" ", "")  + "@scaleaq.com").toLowerCase();


    }

}
