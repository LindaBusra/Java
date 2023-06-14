package JavaLessons.day27_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MixedExceptions_work {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Enter whole number to divide:");

        try {
            int num = scan.nextInt();
            System.out.println("Enter the divisor:");
            int d = scan.nextInt();

            int result = num / d;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("divider can nat be zero");
        } catch (InputMismatchException e) {
            System.out.println("divider must be number");
        } catch (Exception e) {
            System.out.println("there is something wrong");
        } finally {
            System.out.println("Endelig ferdig");
        }
    }
}
