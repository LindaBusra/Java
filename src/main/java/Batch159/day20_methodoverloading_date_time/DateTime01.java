package Batch159.day20_methodoverloading_date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //How to get current date
        LocalDate currentData = LocalDate.now();
        System.out.println(currentData);                        //2023-04-18

        //How to get components of the date
        System.out.println(currentData.getYear());              //2023

        System.out.println(currentData.getMonth());             //APRIL
        System.out.println(currentData.getMonthValue());        //4

        System.out.println(currentData.getDayOfMonth());        //18
        System.out.println(currentData.getDayOfWeek());         //TUESDAY, to get day name

        //How to get current date in a specific zone
        System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo")));// 2023-04-15
        System.out.println(LocalDate.now(ZoneId.of("Europe/Sofia")));// 2023-04-15
        System.out.println(LocalDate.now(ZoneId.of("Europe/Istanbul")));    //Continent-City

        //How to go future and past
        System.out.println(currentData.plusYears(3).plusMonths(2).plusDays(12));
        System.out.println(currentData.minusYears(4).minusMonths(3).minusDays(11));


        //Example 1: Jhon was born 12 years 5 months 11 days ago, type code to find the day name of Jhon's birthdate
        System.out.println(LocalDate.now().minusYears(12).minusMonths(5).minusDays(11).getDayOfWeek());  //TUESDAY



        //How to compare two days
        LocalDate dobTom = LocalDate.of(2011, Month.JULY, 21);
        LocalDate dobJim = LocalDate.of(2007, 3, 13);

        System.out.println(dobTom.isAfter(dobJim));     //true
        System.out.println(dobJim.isBefore(dobTom));    //true





    }
}
