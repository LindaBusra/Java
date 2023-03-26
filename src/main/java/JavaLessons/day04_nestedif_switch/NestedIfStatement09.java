package JavaLessons.day04_nestedif_switch;

import java.util.Scanner;

public class NestedIfStatement09 {

    public static void main(String[] args) {


//find the given year is leap year or not.



        Scanner console = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = console.nextInt();


        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("A leap year");
                }
                else
                {
                    System.out.println("Not a leap year");
                }
            }
            else
            {
                System.out.println("A leap year");
            }
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }

}
