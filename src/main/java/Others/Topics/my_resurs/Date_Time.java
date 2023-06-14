package Others.Topics.my_resurs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_Time {
    public static void main(String[] args) {

        //https://www.w3schools.com/java/java_date.asp


        //Display Current Date
        //To display the current date, import the java.time.LocalDate class, and use its now() method:

        LocalDate currentDate = LocalDate.now(); // Create a date object
        System.out.println(currentDate); // Display the current date

//-----------------------------------------------------------------------------------------------------

        //Display Current Time
        //To display the current time (hour, minute, second, and nanoseconds),
        // import the java.time.LocalTime class, and use its now() method:

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

//-----------------------------------------------------------------------------------------------------

        //Display Current Date and Time
        //To display the current date and time, import the java.time.LocalDateTime class, and use its now() method:

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

//-----------------------------------------------------------------------------------------------------


    }
}
