package Others.OCA.abiten.Q003;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q003 {

    public static void main(String[] args) {


        //What is the result?

        //it works
        String date1 = LocalDate
                .parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE);

        System.out.println(date1);          //2014-05-04



        //it works
        String date = LocalDateTime
                .parse("2022-09-27T19:13:59.965588")
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);



        //It gives exception
        String date2 = LocalDate
                .parse("2016-11-01") 				    // time is not assigned here
                .format(DateTimeFormatter.ISO_DATE_TIME);  	//_TIME should be removed
        System.out.println(date2);          //An exception is thrown at runtime. -->Unsupported field: HourOfDay



        //it gives exception
        String date3 = LocalDateTime
                .parse("2022-09-27") 	// time is not assigned here
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date3);   // Exception







    }
}
