package Others.MyPractice.P2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Q33 {

    public static void main(String[] args) {



/*        A four-digit number ABCD is called  Lucky if A+B = C+D
        Write a program that asks the user to enter a four-digit number and
        tell if the number is a lucky number or not
        Example: 3719 ==> 3+7 = 1+9  This is a Lucky number
 */

        int a = 3719;

        int digit1= a%10;
        int digit2= (a/10)%10;
        int digit3= (a/100)%10;
        int digit4= (a/1000)%10;



        if(digit1+digit2==digit3+digit4) {
            System.out.println("it is lucky number");
        } else {
            System.out.println("It is not lucky number");
        }




    }
}











