package JavaLessons.day18_datetime_class_vararrgs;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        //How to get "current date" by typing Java code
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-09-27

        //How to get "current time" by typing Java code
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);// 19:11:34.771340


        //How to get "current date and time" by typing Java code
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-09-27T19:13:59.965588

        //How to get "current date" in another country by typing Java code
        LocalDate currentDateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateInJapan);//2022-09-28


        //How to get "current time" in Japan by typing Java code
        LocalTime currentTimeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentTimeInJapan);//08:24:58.324805

        //How to get "current date and time" in Japan by typing Java code
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-09-28T08:24:58.324849

        //How to go future in date
        LocalDate cd1 = LocalDate.now();
        System.out.println(cd1);//2022-09-27

        LocalDate cd1Next = cd1.plusYears(2).plusMonths(5).plusDays(120);//Method Chain
        System.out.println(cd1Next);//2025-06-27

        //How to go past in date
        LocalDate cd1Past = cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);//2019-07-22

        //Homework: Type code to learn how to go future and past in time

        //How to get a specific part of the time
        LocalTime ct1 = LocalTime.now();
        int hour = ct1.getHour();
        System.out.println(hour);//19

        int minute = ct1.getMinute();
        System.out.println(minute);//43

        //How to change the format of the date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Uppercase M is for months, lowercase m is for minutes
        String formattedCurrentDate = dtf.format(cd1);
        System.out.println(formattedCurrentDate);// 27/09/2022

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MMM/yy");// MMM gives you the "first 3 characters" of the month name
        // yy gives you the "last 2 digits" of the year
        String formattedCurrentDate2 = dt.format(cd1);
        System.out.println(formattedCurrentDate2);//  27/Sep/22

        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MMMM/yy");    //MMMM gives you full name of the month
        String formattedCurrentDate3 = d.format(cd1);
        System.out.println(formattedCurrentDate3);


        //How to change the format of the time
        DateTimeFormatter mnr = DateTimeFormatter.ofPattern("HH:mm"); // hh-->00.00-12.00


        LocalTime lt = LocalTime.now();

        String formattedCurrentTime = mnr.format(lt);
        System.out.println(formattedCurrentTime);

        //How to change the format of the time
        DateTimeFormatter mnr2 = DateTimeFormatter.ofPattern("hh:mm a"); //a is for to display AM or PM
        LocalTime lt2 = LocalTime.now();                                //hh uses 12 hours system, HH uses 24 hour system
        String formattedCurrentTime2 = mnr2.format(lt2);
        System.out.println(formattedCurrentTime2);

        //How to create specific dates
        LocalDate dateofbirth1 = LocalDate.of(2012, 3,13);
        LocalDate dateofbirth2 = LocalDate.of(2013, Month.MAY,21 );


        //How to compare two dates
        //In isBefore() method if the first date is before the second date you get true
        //Otherwise (wquality and first is after) you will get false

        boolean isBefore = dateofbirth1.isBefore(dateofbirth2);
        System.out.println(isBefore);

        boolean is = dateofbirth1.isBefore(dateofbirth1);
        System.out.println(is);

        boolean isAfter = dateofbirth2.isAfter(dateofbirth1);
        System.out.println(isAfter);




//Example 3:  Type code to find the time difference in hours between Japan time zone and Germany time zone.
//            Zone id for Japan: Asia/Tokyo            Zone id for Germany: Europe/Berlin

        LocalDateTime dateInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        LocalDateTime dateInGermany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        long diff = ChronoUnit.HOURS.between(dateInGermany, dateInJapan);
        System.out.println(diff);


    }

}