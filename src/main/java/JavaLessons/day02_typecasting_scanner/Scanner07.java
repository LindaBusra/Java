package JavaLessons.day02_typecasting_scanner;

import java.util.Scanner;

public class Scanner07 {

    public static void main(String[] args) {


//Let's ask the user for the long, short sides and height of the rectangular prism and print the volume of the prism:
//a, b and c being the side lengths of the rectangular prism;

        //Area = 2(ab+bc+ac)2
        //Volume = a.b.c = k3

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter in order long, short sides and height of the rectangular prism");
        double l = scan.nextDouble();
        double s = scan.nextDouble();
        double h = scan.nextDouble();
        System.out.println("The volume is:" + (l*s*h));




//Ask user to enter name and print first letter of the name in uppercase on the console
        Scanner scanner= new Scanner(System.in);
        System.out.println("What is your name");
        char ch= scanner.next().toUpperCase().charAt(0);
        System.out.println(ch);



    }
}
