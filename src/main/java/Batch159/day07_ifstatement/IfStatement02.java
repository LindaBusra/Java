package Batch159.day07_ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {


        //Example 1: Ask user to enter day name to print if tha day name is week day or weekend day
        // Monday-->Weekday, Sunday-->Weekend day


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day name");
        String day = scan.next().toLowerCase();

        boolean isWeekday =   day.equalsIgnoreCase("monday") ||
                            day.equalsIgnoreCase("thirsday") ||
                            day.equalsIgnoreCase("wednesday") ||
                            day.equalsIgnoreCase("thursday") ||
                            day.equalsIgnoreCase("friday");

        boolean isWeekend =   day.equalsIgnoreCase("saturday") ||
                            day.equalsIgnoreCase("sunday") ;

        if(isWeekday) {
            System.out.println("Week day");
        } else if (isWeekend) {
            System.out.println("Weekend day");
        } else {
            System.out.println("invalid day, please enter one of the day names");
        }

    }

}
