package Others.javaQuestionBank_TechPro;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Slide14_DateClass {

    public static void main(String[] args) {


//1-Type the code that finds out how many days Ali lived.
//Date of birth of Ali is 12th of May 2002

//    LocalDate current = LocalDate.now();
//    LocalDate birthday = LocalDate.of(2002,05,12);
//
//    long difference = ChronoUnit.DAYS.between(birthday, current);
//    System.out.println(difference);


//-----------------------------------------------------------------------------------------------



//2) Type the code that finds out how many months Ali lived.
//Date of birth of Ali is 4th of June 1997


//    LocalDate current = LocalDate.now();
//    LocalDate birtday = LocalDate.of(1997,06,04);
//
//    long difference =ChronoUnit.MONTHS.between(birtday, current);
//
//            System.out.println(difference);



//-----------------------------------------------------------------------------------------------



//3-) Date of birth of Ali is 4th of June 1997. Type code to find the exact date 2 years, 3 months,
//and 12 days after Ali's birth date.

//        LocalDate birthday = LocalDate.of(1997,06,04);
//
//        LocalDate framtid = birthday.plusYears(2).plusMonths(3).plusDays(12);
//
//        System.out.println(framtid);



//-----------------------------------------------------------------------------------------------



//4- Ali was born 45 years, 8 months and 5 days after 29 October 1923.
//Veli was born 24 years, 2 months and 11 days before 15 September 1993.
//Type code to calculate the exact date of birth of Ali and Veli
//Type code to check if the date of birth of Ali and Veli is the same or not


//        LocalDate forAli = LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
//        LocalDate forVeli = LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);
//
//        System.out.println("Ali's birthday: " + forAli);
//        System.out.println("Veli's birthday: " + forVeli);
//
//        System.out.println("the date of birth of Ali and Veli is the same: " + forAli.equals(forVeli));



//-----------------------------------------------------------------------------------------------


//5) Veli was born 3 years and 11 days after Ali.
//Ali gave you his date of birth as 24th of November 2012
//Type code to calculate Veli’s date of birth.

//        LocalDate birthdayVeli = LocalDate.of(2012,11,24).plusYears(3).plusDays(11);
//
//        System.out.println("Veli’s date of birth: " + birthdayVeli);
//
//
//        //Questionbank solution:  Localdate.parse
//        LocalDate dobAli = LocalDate.parse("2012-11-24");
//        LocalDate dobVeli = dobAli.plusYears(3).plusDays(11);
//        System.out.println("The date of birth of Veli is " + dobVeli);


//------------------------------------------------------------------------------------------------------------


//6) Create a Date Value for your birth date and create Date Value for your kid's birth date then
//calculate the difference in days.


        LocalDate birtdayI = LocalDate.of(1975,12,28);
        LocalDate birthdayAda = LocalDate.of(2014,11,29);

        long difference = ChronoUnit.DAYS.between(birtdayI, birthdayAda);
        System.out.println(difference);



//------------------------------------------------------------------------------------------------------------



//7) Get the last 2 digits of the year in current date

//        LocalDate current = LocalDate.now();
//
//        int lastTwoDigits = current.getYear()%100;
//
//        System.out.println("the last 2 digits of the year in current date: " + lastTwoDigits);



//------------------------------------------------------------------------------------------------------------




/*8) Type code to check if a given year is “Leap year” or not
Leap Year:
i) If a year is divisible by 100 and divisible by 400 it is called leap year. For example; 2000 is, 1900
is not
ii) If a year is not divisible by 100 and divisible by 4 it is called leap year. For example; 2004 is, 2007
is not        */


//        LocalDate anyTime = LocalDate.of(1996,8,21);
//
//        System.out.println("The year is leap year: " + anyTime.isLeapYear());
//
//
//        int year=1996;
//        String result=   year%100==0? ( year%400==0 ? "is Leap year" : "is not leap year" ):  (year%4==0? "is Leap year" : "is not leap year");
//
//        System.out.println(year + " " + result);



//------------------------------------------------------------------------------------------------------------



//9) Find the sum of the month numbers of two different dates

//        LocalDate myDob = LocalDate.of(1996, 8, 21);
//        LocalDate myKidsDob = LocalDate.of(2015, 3, 12);
//
//
//        System.out.println(myDob.getMonthValue() + myKidsDob.getMonthValue());
//
//        //QuestionBank:
//        System.out.println("The sum is " + myDob.getMonth() + myKidsDob.getMonth());



//------------------------------------------------------------------------------------------------------------



//10) Find the difference in hours for two different dates


//        LocalDate myDob = LocalDate.of(1996, 8, 21);
//        LocalDate myKidsDob = LocalDate.of(2015, 3, 12);
//
//        long difference = ChronoUnit.DAYS.between(myDob, myKidsDob);
//
//        System.out.println(difference*24);

//------------------------------------------------------------------------------------------------------------













    }
}
