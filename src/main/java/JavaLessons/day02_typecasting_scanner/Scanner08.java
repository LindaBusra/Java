package JavaLessons.day02_typecasting_scanner;

import java.util.Scanner;

public class Scanner08 {

    public static void main(String[] args) {



        // Let's want one side of the square and print the perimeter and area-

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter one side of the square");
        double kenar = scanner.nextDouble();
        System.out.println("Area: "+(kenar*kenar) + " the perimeter: " + (4*kenar));




        // Let's ask the user to race and print the circumference and area of the circle:

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the race of circle:");
        double yaricap = scan.nextDouble();
        System.out.println("Area: "+(3.14*yaricap*yaricap) + " circumference: " + (2*3.14*yaricap));

    }
}
