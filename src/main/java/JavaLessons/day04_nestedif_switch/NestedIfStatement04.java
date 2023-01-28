package JavaLessons.day04_nestedif_switch;

import java.util.Scanner;

public class NestedIfStatement04 {

    public static void main(String[] args) {




//Retirement question

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your gender ");
        char gender = scan.next().toLowerCase().charAt(0);

        System.out.println("Please enter your age");
        int age = scan.nextInt();

        if (gender == 'f') {
            if (age > 60) {
                System.out.println("You can retire");
            } else {
                System.out.println("You can not retire. There is a " + (60 - age) + " year(s) left for your retirement");
            }
        } else if (gender == 'm') {
            if (age > 65) {
                System.out.println("You can retire");
            } else {
                System.out.println("You can not retire. There is a " + (65 - age) + " year(s) left for your retirement");
            }
        } else {
            System.out.println("Please enter a valid character for gender");
        }





    }
}
