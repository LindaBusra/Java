package Others.javaQuestionBank_TechPro;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Slide17_DateTimeClass {
    public static void main(String[] args) {


//1) If the hour is
//i) Between 24:00 and 05:00 then print ‘Sleeping time’ on the console
//ii) Between 08:00 and 16:00 then print ‘Working time’ on the console
//iii) Between 19:00 and 22:00 then print ‘Family time’ on the console
//iv) For the others print ‘Personal time’ on the console


        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        if(hour>0 && hour<5){
            System.out.println("Sleeping time");
        }else if(hour>8 && hour<16){
            System.out.println("Working time");
        }else if(hour>19 && hour<22){
            System.out.println("Family time");
        }else{
            System.out.println("Personal time");
        }




//2) Type code to find time difference between Japan time zone and Germany time zone


//        LocalDateTime timeInJapan = LocalDateTime .now(ZoneId.of("Asia/Tokyo"));
//        LocalDateTime timeInGermany = LocalDateTime .now(ZoneId.of("Europe/Berlin"));
//
//        long difference = ChronoUnit.HOURS.between(timeInJapan, timeInGermany);
//        System.out.println("time difference between Japan time zone and Germany time zone: " + difference);



        //For Turkey

//        LocalDateTime timeInNorway = LocalDateTime .now(ZoneId.of("Europe/Oslo"));
//        LocalDateTime timeInTurkey = LocalDateTime .now(ZoneId.of("Europe/Istanbul"));
//
//        long difference = ChronoUnit.HOURS.between(timeInTurkey, timeInNorway);
//        System.out.println("time difference between Turkey time zone and Norway time zone: " + difference); //-1


//3-) Ali was born in Istanbul on 5th of February 2015 at 10:00 am TRT, Mark was born in the USA
//on 5th of February 2015 at 12:00 pm EST. What is the difference between Ali’s birth time
//and Mark’s birth time in hours?

//        LocalDateTime ali = LocalDateTime.of(2015,2,5,10,0,0);
//        ZonedDateTime forAli = ali.atZone(ZoneId.of("Europe/Istanbul"));
//
//        LocalDateTime mark = LocalDateTime.of(2015,02,5,12,0,0);
//        ZonedDateTime forMark = mark.atZone(ZoneId.of("America/New_York"));
//
//        long difference = ChronoUnit.HOURS.between(forAli, forMark);
//        System.out.println(difference);



//4) Ali was born on 5th of February 2015 at 10:15 am EST, Mark was born on 6th of March 2015
//at 12:25 pm EST. Ali remained in intensive care for 23 hours and 35 minutes. Veli remained
//in intensive care for 1 hour and 12 minutes. What is the difference in minutes between the
//times of Ali and Veli leaving the intensive care unit?


//        LocalDateTime forAli = LocalDateTime.of(2015,2,5,10,15,0).plusHours(23).plusMinutes(35);
//        LocalDateTime forMark= LocalDateTime.of(2015,3,6,12,25,0).plusHours(1).plusMinutes(12);
//
//
//        long difference = ChronoUnit.MINUTES.between(forAli, forMark);
//        System.out.println(difference);             //40547



//5) Mark was born on 2/23/2018 at 3:25 PM in GMT. What is the exact birth date and time of
//Mark in Japan?

        LocalDateTime inJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime inGMT = LocalDateTime.now(ZoneId.of("GMT"));

        long diff = ChronoUnit.HOURS.between(inGMT, inJapan);

        LocalDateTime forMark = LocalDateTime.of(2018, 2, 23, 15,25,0).minusHours(diff);

        System.out.println("The exact birth date and time of Mark in Japan: " + forMark);


    }
}
