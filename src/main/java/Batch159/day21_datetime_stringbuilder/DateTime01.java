package Batch159.day21_datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {


    LocalTime currentTime = LocalTime.now();
    System.out.println(currentTime);

    //go future or past in the time
    System.out.println(currentTime.minusHours(2));
    System.out.println(currentTime.plusHours(2).plusMinutes(40));

    //get hour, get minute for currentTime
    System.out.println(currentTime.getHour());
    System.out.println(currentTime.getMinute());

    //how to format time
    //"hh" uses 12 hours system, "HH" uses 24 hours system
    //Using "a" at the end it tells you if it is AM or PM

//    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");  //hh=hours   mm:minutes   , HH=24 hours system
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");     //ss:seconds , a -->it means pm or am
    String myTime = dtf.format(currentTime);
    System.out.println(myTime);     //12:26


    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt);        //2023-04-21T00:31:38.532545700


    //To get specific date and time in any zone
    LocalDateTime ldtJapan  = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
    System.out.println(ldtJapan);






    }
}
