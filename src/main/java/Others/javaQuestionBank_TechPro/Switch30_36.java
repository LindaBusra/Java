package Others.javaQuestionBank_TechPro;

import java.util.Random;

public class Switch30_36 {

    public static void main(String[] args) {



//The switch Expression
//Fill in the blanks to create a valid switch expression for coffee price.




                /* Question 1
 Use switch statement to print
a) "Winter" for December, January, February
b) "Spring" for March, April, May
c) "Summer" for June, July, August
d) "Fall" for September, October, November
e) "Invalid month name" for all the others
 */

//        String month = "June";
//        month = month.toLowerCase();
//
//
//        switch(month) {
//
//            case "december":
//            case "january":
//            case "february":
//                System.out.println("Winter");
//                break;
//            case "march":
//            case "april":
//            case "may":
//                System.out.println("Spring");
//                break;
//            case "june":
//            case "july":
//            case "august":
//                System.out.println("Summer");
//                break;
//            case "september":
//            case "october":
//            case "november":
//                System.out.println("Fall");
//                break;
//            default:
//                System.out.println("Invalid month name");
//                break;
//
//        }



/* Question-2
Use a switch statement to print the name of the month when you enter the number of the
month. For example; if user enters 1 your code should print "January",
if user enters 2 your code should print "February" etc. if user enters invalid month number
your code should print "Invalid number”
 */

//      int m =3;
//
//      switch (m) {
//
//          case 1:
//              System.out.println("January");
//              break;
//          case 2:
//              System.out.println("February");
//              break;
//          case 3:
//              System.out.println("March");
//              break;
//          case 4:
//              System.out.println("April");
//              break;
//          case 5:
//              System.out.println("May");
//              break;
//          case 6:
//              System.out.println("June");
//              break;
//          case 7:
//              System.out.println("July");
//              break;
//          case 8:
//              System.out.println("August");
//              break;
//          case 9:
//              System.out.println("September");
//              break;
//          case 10:
//              System.out.println("October");
//              break;
//          case 11:
//              System.out.println("November");
//              break;
//          case 12:
//              System.out.println("December");
//              break;
//          default:
//              System.out.println("Invalid month name");
//              break;
//      }



 /*Question 3 - Type a code which prints the all month names starting with the given month numbers.
Example: If the month number is 9 output will be September October November December

*/

//        int mNumber = 6;
//
//        switch (mNumber) {
//            case 1:
//                System.out.println("January");
//            case 2:
//                System.out.println("February");
//            case 3:
//                System.out.println("March");
//            case 4:
//                System.out.println("April");
//            case 5:
//                System.out.println("May");
//            case 6:
//                System.out.println("June");
//            case 7:
//                System.out.println("July");
//            case 8:
//                System.out.println("August");
//            case 9:
//                System.out.println("September");
//            case 10:
//                System.out.println("October");
//            case 11:
//                System.out.println("November");
//            case 12:
//                System.out.println("December");
//            default:
//                System.out.println("Invalid month name");
//                break;
//        }




/* Question 4- Print "Boy" if the gender is "Male" (Ignore cases)
Print "Girl" if the gender is "Female" (Ignore cases)
Print "Others" if the gender is different from "Male" and "Female"*/

//        String gender ="Male";
//        gender = gender.toLowerCase();
//
//        switch (gender) {
//            case "male" :
//                System.out.println("Boy");
//                break;
//            case "female" :
//                System.out.println("Girl");
//                break;
//            default:
//                System.out.println("Others");
//                break;
//
//        }



//Question- 5 Type a code to display the number of days in a given month of a given year.
//Example: The number of days in February of 2000 was 29.

//        int month = 2;
//        int year = 2400;
//        int numDays = 0;
//
//        switch (month) {
//
//         case 1: case 3: case 5:
//         case 7: case 8: case 10:
//         case 12:
//         numDays = 31;
//         break;
//
//         case 4: case 6:
//         case 9: case 11:
//         numDays = 30;
//         break;
//
//         case 2:
//         if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
//         numDays = 29;
//         }else {
//         numDays = 28;
//         }
//         break;
//
//         default:
//         System.out.println("Invalid month.");
//         break;
//        }
//
//        System.out.println("Number of Days = " + numDays);




/*Question 6- Use switch statement to create a simple calculator which does addition, subtraction,
multiplication, and division with any 2 numbers
a) When user entered 10.2 and 5 and + sign your code should print "The result is 15.2" on the
console
b) When user entered 10 and 5 and - sign your code should print "The result is 5.0" on the
console
c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0" on the
console
d) When user entered 10 and -5 and / sign your code should print "The result is -2.0" on the
console
e) When user entered 10 and -5 and operation different from +, -, *, / your code should print
"That operation cannot be done"

 */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter first integer");
//        int a = scan.nextInt();
//        System.out.println("Enter second integer");
//        int b = scan.nextInt();
//        System.out.println("Will do addition, subtraction,multiplication or division ");
//        char operator = scan.next().charAt(0);
//
//        switch (operator) {
//
//            case '+' :
//                System.out.println(" a + b = " + (a+b));
//                break;
//            case '-' :
//                System.out.println(" a - b = " + (a-b));
//                break;
//            case '*' :
//                System.out.println(" a * b = " + (a*b));
//                break;
//            case '/' :
//                System.out.println(" a / b = " + (a/b));
//                break;
//            default:
//                System.out.println("Invalid enter");
//                break;
//
//        }




/* Question- 7 Use switch statement to create a converter which converts mile to km, second to hour,
fahrenheit to celsius. Find the formulas for conversions from Google.
a) When user entered 10 and mileToKm String, your code should print "16 km" (The number
will be dynamic) on the console
b) When user entered 7200 and secondsToHours String, your code should print "2 Hours"(The
number will be dynamic) on the console
c) When user entered 83 and fahrenheitToCelsius String, your code should print "28.3333
celsius"(The number will be dynamic) on the console
d) When user entered operation different from mileToKm, secondsToHours, fahrenheitToCelsius
your code should print "That operation was not defined for that converter"
 mile*1.60934   ((seconds/60)/60    ystem.out.println((fahrenheit-32)*5/9);*/


//        Scanner scan = new Scanner(System.in);
//        System.out.println("What do you want to do? \n\"mileToKm\" or \"secondsToHours\" or \"fahrenheitToCelsius\" ");
//        String want = scan.nextLine().toLowerCase();
//
//
//        switch (want) {
//
//            case "miletokm":
//                System.out.println("Enter the mile");
//                double mile = scan.nextDouble();
//                System.out.println(mile + " mile is: " + (mile*1.60934) + " km");
//                break;
//
//            case "secondstohours":
//                System.out.println("Enter the seconds");
//                double seconds = scan.nextDouble();
//                System.out.println(seconds + " second is: " + (seconds/3600) + " hour");
//                break;
//
//            case "fahrenheittocelsius":
//                System.out.println("Enter the fahrenheit");
//                double fahrenheit = scan.nextDouble();
//                System.out.println(fahrenheit + " fahrenheit is: " + ((fahrenheit-32)*5/9) + " celsius");
//                break;
//
//            default:
//                System.out.println("That operation was not defined for that converter");
//        }



/* Question 8-  Create an Enum and put the browser names in it like CHROME, SAFARI, IE, FIREFOX,
YANDEX. Use switch statement and print ‘I am using CHROME’ for CHROME, 'I am using
SAFARI’ for SAFARI, 'I am using IE for IE', 'I am using FIREFOX for FIREFOX', and 'I am using
YANDEX’ for YANDEX, 'Not valid browser' for browsers different from CHROME, SAFARI, IE,
FIREFOX, YANDEX.
 */
        String browser = "CHROME";

        switch(browser){
            case "CHROME":
                System.out.println("I am using CHROME");
                break;
            case "SAFARI":
                System.out.println("I am using SAFARI");
                break;
            case "IE":
                System.out.println("I am using IE");
                break;
            case "FIREFOX":
                System.out.println("I am using FIREFOX");
                break;
            case "YANDEX":
                System.out.println("I am using YANDEX");
                break;
            default:
                System.out.println("It is not valid browser");
        }
        System.out.println("-------------------------------------------------------------------------------\n");



// Question-9  Create an Enum whose name is ‘Seasons’ and print the following by using the Enum in
//switch-on statement
//For winter print 'Snowboarding'
//For summer and spring print 'Fishing'
//For fall print 'Trekking'

        String seasons = "Winter";
        seasons = seasons.toLowerCase();

        switch(seasons) {

            case "winter":
                System.out.println("Snowboarding");
                break;

            case "summer":
            case "spring":
                System.out.println("Fishing");
                break;

            case "fall":
                System.out.println("Trekking");
                break;
            default:
                System.out.println("Undefined season");

        }


// Question 10 -Create a method which gives you a random alphabetical character in myClass Class then
//print the following by using the method.
//Print "First Character" for 'A' and 'a'
//Print "Second Character" for 'B' and 'b'
//Print "Third Character" for 'C' and 'c'
//Print "Forth Character" for 'D' and 'd'
//Print "Other Characters" for all others

char ch = 'a';

String chr = String.valueOf(ch).toLowerCase();



switch(chr) {

    case "a":
        System.out.println("First Character");
        break;
    case "b":
        System.out.println("Second Character");
        break;
    case "c":
        System.out.println("Third Character");
        break;
    case "d":
        System.out.println("Forth Character");
        break;
    default:
        System.out.println("Other Characters");
}









    }

}
