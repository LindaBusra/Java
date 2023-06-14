package Others.OCA.abiten.Q016;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q016 {
    public static void main(String[] args) {


        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);

        dt.plusDays(30);  // not assigned to dt, no effects on dt
        dt.plusMonths(1);// not assigned to dt, no effects on dt
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));


    }
}
