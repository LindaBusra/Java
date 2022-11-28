package JavaLessons.day02_typecasting_scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {



//Ask user enter name, surName and age

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Please enter your surname");
        String surName = scan.nextLine();
        System.out.println("Please enter your age");
        int age = scan.nextInt();

        System.out.println( "Your information: " + name + " " + surName + " " + age);



//Same question, we ask  all information same time


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name, surname and age");
        String name1 = input.nextLine();
        String surName1 = input.nextLine();
        int age1 = scan.nextInt();

        System.out.println("Your information: " + name1 + " " + surName1 + " " + age1);


    }

}
