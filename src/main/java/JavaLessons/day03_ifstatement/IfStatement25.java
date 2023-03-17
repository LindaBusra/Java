package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement25 {

    public static void main(String[] args) {



 /*       //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)
 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Type your age please");

        byte age = scan.nextByte();
        if( age < 0) {
            System.out.println("Invalid age");
        } else if (age <=4) {
            System.out.println("You are a baby");
        } else if (age <=12) {
            System.out.println("You are a child");
        } else if (age <=20) {
            System.out.println("You are a teenager");
        } else if (age <=30) {
            System.out.println("You are adult");
        } else {
            System.out.println("Not expected age");
        }

    }
}
