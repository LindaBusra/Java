package Others.MyPractice.P2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q40 {

    public static void main(String[] args) {

/*  The first and last letter of a String received from the user is as many as the number received from the user.
Write a method that returns,  example: input output,  apple 2 aeae,  army 3 ayayay
         */

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a String");
    String str = scan.nextLine();
    System.out.println("Enter a number");
    int num = scan.nextInt();

    for(int i=0; i<num; i++) {

        System.out.print(str.charAt(0) + str.substring(str.length()-1));
    }



    }
}
