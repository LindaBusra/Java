package Batch159.day20_methodoverloading_date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {


        //How to format date

        LocalDate current = LocalDate.now();
        System.out.println("Default format : " + current);

        //"m" is reserved for minute, that is why we use "M" for months
        //"M" makes the month number single digit if it is less than 10
        //"MM" makes the month number two digits digit if it is less than 10
        //"MMM" gives you first three characters of month name
        //"MMMM" gives you full month name
        //"yyyy" gives you the year in 4 digits
        //"yy" gives you the last two digits of the year
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");      //2023-04-20  /M/-->4,  /MM/->04

        System.out.println("My format : " + dtf.format(current));               //20/04/2023
    }
}
