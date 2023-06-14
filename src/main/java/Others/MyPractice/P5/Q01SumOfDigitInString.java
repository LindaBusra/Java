package Others.MyPractice.P5;

import java.util.Scanner;

public class Q01SumOfDigitInString {
    public static void main(String[] args) {


 /*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16
     Hint:
     Character.isDigit()
     Integer.valueOf()
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();



    }


    public static void SumOfDigits(String str) {

        int sum = 0;

        try{
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {                    //Character.isDigit()-->return type is boolean

                    sum += Integer.valueOf("" + str.charAt(i));          //  second part gives me ASCII values if it is digital value
                }
            }

            System.out.println("Sum of digits: " + sum);

        } catch (Exception e){
            System.out.println("There has been an issue while summing up");
        }

    }

    //Boundary Value Analysis
    //Integration Development Environment : IDE
}