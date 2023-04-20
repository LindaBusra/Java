package Batch159.day04_scannerclass;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Type a code that calculates the hypotenuse.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the first leg of the right triangle");
        double a = scanner.nextDouble();
        System.out.println("Enter the length of the second leg of the right triangle");
        double b = scanner.nextDouble();

        double hypotenuse = Math.sqrt(a*a + b*b);
        System.out.println("hypotenuse: " + hypotenuse);

    }
}
