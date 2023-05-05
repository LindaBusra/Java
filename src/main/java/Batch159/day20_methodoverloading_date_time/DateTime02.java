package Batch159.day20_methodoverloading_date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DateTime02 {
    public static void main(String[] args) {


        //Example 1: Type code for a booking application.
        //           If booking date is before current date give an error message like "Booking date cannot be past date"
        //           If booking date equals current date give a message like "We will call you when we have availability"
        //           If booking date is after current date give a message like "The ticket was booked"

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year with 4 digits to book a ticket");
        int year = scan.nextInt();
        System.out.println("Enter month number to book a ticket");
        int month = scan.nextInt();
        System.out.println("Enter day number to book a ticket");
        int day = scan.nextInt();
        LocalDate bookingDate = LocalDate.of(year, month, day);


        LocalDate currentDate = LocalDate.now();

        if(bookingDate.isBefore(currentDate)) {
            System.out.println("Booking date cannot be past date");
        } else if(bookingDate.isEqual(currentDate)) {
            System.out.println("Enter month number to book a ticket");
        }  else {
            System.out.println("The ticket was booked");
        }


        //Example 2: Type code to find the day name of your birth

        LocalDate adaBirthday = LocalDate.of(2014,11,29);

        DayOfWeek dayName = adaBirthday.getDayOfWeek();

        System.out.println(dayName);

        //or
        System.out.println(LocalDate.of(2014, 11, 29).getDayOfWeek());


    }
}
