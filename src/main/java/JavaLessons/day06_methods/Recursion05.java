package JavaLessons.day06_methods;

import java.util.Scanner;

public class Recursion05 {



    //Sum of digits of a number using Recursion in java

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("Sum of digits of "+num + " is " + sum(num));
    }



    public static int sum(int n){

        return n==0 ? 0 : n%10+sum(n/10);
    }

}