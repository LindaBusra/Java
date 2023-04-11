package JavaLessons.day04_nestedif_switch;

import java.util.Scanner;

public class Switch04 {

    public static void main(String[] args) {



 //Switch question...


        Integer age = 18;
        switch (age)
        {
            case (16):
                System.out.println("You are under 18.");
                break;
            case (18):
                System.out.println("You are eligible for vote.");
                break;
            case (65):
                System.out.println("You are senior citizen.");
                break;
            default:
                System.out.println("Please give the valid age.");

        }

//---------------------------------------------------------------


        //Type Weekend or Weekday

        Scanner scan =  new Scanner(System.in);
        System.out.println("what day of the week is today?");
        byte day = scan.nextByte();

        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }



//------------------------------------------------------------------------------------------------


        int days = 4;
        switch (days) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }



    }
}
