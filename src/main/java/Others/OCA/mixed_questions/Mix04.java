package Others.OCA.mixed_questions;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mix04 {

    public static void main(String[] args) {



        int i=1;

        do{

            if(i==3) {
                continue;
            } else if(i==5) {
                System.out.print(i + " ");
                break;
            } else {
                System.out.println(i + " ");
            }
            System.out.println("write");
            i++;
        } while(true);

























    }

}