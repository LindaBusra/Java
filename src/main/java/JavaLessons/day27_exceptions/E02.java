package JavaLessons.day27_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {


 //Write a program to illustrate usage of try/catch with finally clause

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter whole number to divide:");


        try {
            int num = scan.nextInt();
            System.out.println("Enter the divisor:");
            int d = scan.nextInt();


            int result =num/d;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Can not be divided by 0");
        } catch (InputMismatchException e){
            System.out.println("Enter a number please");
        } catch (Exception e) {
            System.out.println("Wrong");
        } finally {
            System.out.println("Always print this");
        }









    }
}
