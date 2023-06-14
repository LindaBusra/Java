package Others.MyPractice.P2;

import java.util.Arrays;
import java.util.Scanner;

public class Q27 {

    public static void main(String[] args) {


/*  Ask user to enter a String and a number. Return The first and last letter of this String is as many times as the number user want.
Write a method that returns.  example: input output : apple 2 eaea  /  army 3 ayayay   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = scan.next();

        System.out.println("Enter a number greater than 0 for repeated character: ");
        int num = scan.nextInt();


        System.out.println(firstAndLastCh(str, num));


    }

    private static String firstAndLastCh(String str, int num) {

        String firstCh = str.substring(0,1);
        String lastCh = str.substring(str.length() - 1);
        String str1 = "";

        for (int i = 0; i < num; i++) {

            str1 += firstCh + lastCh;
        }
        return str1;
    }
}
