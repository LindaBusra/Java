package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {



  //Example 1- Type code to print "Weekday" for the weekday names.
  //Monday-Friday-->Weekday,  Saturday, Sunday-->Weekend day

  Scanner scan = new Scanner(System.in);
  System.out.println("Which day is it?");
  String day = scan.next();


  //1.way

  if((day.equalsIgnoreCase("Saturday")) || (day.equalsIgnoreCase("Sunday"))) {
      System.out.println(day + " is weekend day");
        }
  else if( (day.equalsIgnoreCase("Monday")) || (day.equalsIgnoreCase("Tuesday")) ||
          (day.equalsIgnoreCase("Wednesday")) || (day.equalsIgnoreCase("Thursday"))
          || (day.equalsIgnoreCase("Friday")) )   {

      System.out.println(day+ " is weekday");
  } else {
      System.out.println("Invalid day name");
  }



//----------------------------------------------------------------------------------------------


   //2.way

boolean isWeekendDay = day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday");

boolean isWeekDay = day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") ||
                day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday")
                || day.equalsIgnoreCase("Friday");

        if(isWeekDay) {
            System.out.println("Weekday");
        }
        else if (isWeekendDay) {

            System.out.println("Weekend day");
        } else {
            System.out.println("Invalid day name");
        }


 //or

 String dayResult = isWeekDay ? "Weekday" : (isWeekendDay ? "Weekend day" :  "Invalid day name");

        System.out.println(dayResult);



  //------------------------------------------------------------


  //To compare Strings use "equals()", do not use "=="

        //3. way, but it is not recommended

        if(day.equals("Monday")) {
            System.out.println("it is weekday");
        }
        if(day.equals("Tuesday")) {
            System.out.println("it is weekday");
        }
        if(day.equals("Monday")) {
            System.out.println("it is weekday");
        }
        if(day.equals("Wednesday")) {
            System.out.println("it is weekday");
        }
        if(day.equals("Thursday")) {
            System.out.println("it is weekday");
        }
        if(day.equals("Friday")) {
            System.out.println("it is weekday");
        }
        if(day.equals("Saturday")) {
            System.out.println("it is weekend day");
        }
        if(day.equals("Sunday")) {
            System.out.println("it is weekend day");
        }


/*"OR" operator in java is "||"
"||" can be used just with "boolean"s.
true || true  --> true
true || false --> true
false || true --> true
false || false --> false

 */




    }
}
