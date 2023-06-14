package Others.javaQuestionBank_TechPro;

import java.util.Scanner;

public class IfStatement_19_26 {
    public static void main(String[] args) {

/*/ 1- Type code to print

 a) "Winter" for December, January, February
 b) "Spring" for March, April, May
 c) "Summer" for June, July, August
 d) "Fall" for September, October, November
 e) "Invalid month name" for all the others         */

        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the month");
//        String monthName = scan.next();
//
//        String month = monthName.toLowerCase();
//
//        if(month.equals("december") || month.equals("january") || month.equals("february")) {
//            System.out.println("it is Winter");
//        } else if (month.equals("march") || month.equals("april") || month.equals("may")) {
//            System.out.println("it is Spring");
//        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
//            System.out.println("it is Summer");
//        } else if (month.equals("september") || month.equals("october") || month.equals("november")) {
//            System.out.println("it is Fall");
//        } else {
//            System.out.println("Invalid month name");
//        }

//----------------------------------------------------------------------------------------------------------------------

/* 2-  Type code to print
 a) "Valid Password" if the password has at least 8 characters different from space
 character
 b) "Do not use space character in password" if the password has any space
 character in any position
 c) "Invalid Password" if a and b conditions are not satisfied
 Note: Be careful about the orders of conditions in the solution
        Password should not contain any space.  */


//        String password = "123ab456";
//
//        if(password.contains(" ")){
//            System.out.println("Do not use space character in password");
//        } else if (password.length()>=8 && !password.contains(" ")){
//            System.out.println("Valid Password");
//        }else{
//            System.out.println("Invalid Password");
//        }


        //kaynaktaki cozum:

//        String password = "a1b2c3d4";
//        if(password.replaceAll("\\S", "").length()>0){
//            System.out.println("Do not use space character in password");
//        }else if(password.replaceAll("\\s", "").length()>=8){
//            System.out.println("Valid Password");
//        }else{
//            System.out.println("Invalid Password");
//        }

        //


//---------------------------------------------------------------------------------

/* 3-  Type code to print
 a) "Round up by last digit:" and print the rounded value if the last digit is greater than
or equal to 5
 b) "Round down by last digit" and print the rounded value if the last digit is less than 5   */

//        int i = 124;
//
//        if(i % 10 >=5) {
//            System.out.println("Round up by last digit: " +  (i/10 + 1) * 10);
//
//        } else {
//
//            System.out.println("Round down by last digit: " +  (i/10)*10 );
//        }

//-----------------------------------------------------------------------------

/* 4- Type code to print the name of the month when you entered the number of the month.
Example; For 1 output is "January", for 2 output is "February" etc.


         */
//        int numOfMonth = 3;
//        if(numOfMonth==1){
//            System.out.println("January");
//        }else if(numOfMonth==2){
//            System.out.println("February");
//        }else if(numOfMonth==3){
//            System.out.println("March");
//        }else if(numOfMonth==4){
//            System.out.println("April");
//        }else if(numOfMonth==5){
//            System.out.println("May");
//        }else if(numOfMonth==6){
//            System.out.println("June");
//        }else if(numOfMonth==7){
//            System.out.println("July");
//        }else if(numOfMonth==8){
//            System.out.println("August");
//        }else if(numOfMonth==9){
//            System.out.println("September");
//        }else if(numOfMonth==10){
//            System.out.println("November");
//        }else if(numOfMonth==11){
//            System.out.println("October");
//        }else if(numOfMonth==12){
//            System.out.println("December");
//        }else{
//            System.out.println("Invalid month number");
//        }

//----------------------------------------------------------------------------

/* 5) Type code to print
a) "Isosceles Triangle" if two sides of a triangle are equal in length.
b) "Equilateral Triangle" if all sides of a triangle are equal in length.
c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied */

// double side1 = 4.6, side2 =5.2, side3=2.8;
//
// if(side1 == side2  ||  side1 == side3  ||  side2 == side3 ) {
//     System.out.println("Isosceles Triangle");
// } else if(side1 == side3  && side1 == side2  &&  side2 == side3 ) {
//     System.out.println("Equilateral Triangle");
// } else {
//     System.out.println("Neither isosceles, nor equilateral");
// }

//----------------------------------------------------------------------------

/* 6) Type code to create a converter which converts mile to km, second to hour, fahrenheit to
celsius. Find the formulas for conversions from Google.
 a) When user entered 10 and mileToKm String, your code should print "16 km"(The
 number will be dynamic) on the console
 b) When user entered 7200 and secondsToHours String, your code should print "2
 Hours"(The number will be dynamic) on the console
 c) When user entered 83 and fahrenheitToCelsius String, your code should print
 "28.3333 celsius"(The number will be dynamic) on the console
*/

//double mile = 10;
//double seconds = 7200;
//double fahrenheit = 83;
//
//double mileToKm = mile*1.60934;
//double hour = seconds /3600;
//double celcius = (fahrenheit-32)*5/9 ;
//
//        System.out.println(mile + " mile is: " + mileToKm + " km, " + seconds + " seconds is "
//                + hour + " hours, " +  fahrenheit + " fahrenheit is " + celcius + " celcius");


/* 7- Type code to check the grammatical rules for full name
 a) Your code should print "Error in initials" for "ali Can", "Ali can", "ali can"
 b) Your code should print "First name or last name missed" for single words like
 "Ali" or "Can" or "ali"
 c) Your code should print "Format error" for all the format like "ALI CAN"
 d) Your code should print "Name was not entered" for one or more space
 characters like " " or " "
 e) Your code should print "Invalid Name" if the name has any character different
 from letters and space.
 Note: If the abbreviation has more than 1 error all related error messages should be
 printed. For example; for "ali3" your code should print "Error in initials", "First name
 or last name missed", and "Invalid Name"

 */     // C O Z E M E D I M

//        String fullName = "   ";
//        String iFirstName = fullName.substring(0,1);
//        Integer indexOfSpace = fullName.trim().indexOf(' ');
//        //trim metodu, metnin sonunda ve başında yer alan boşlukları yok ederken kelime aralarındaki boşluklara dokunmaz
//
//        String iLastName = fullName.substring(indexOfSpace+1,indexOfSpace+2);
//        Boolean isFirstNameInitialUpperCase = (iFirstName.charAt(0)>='A' && iFirstName.
//                charAt(0)<='Z');
//        Boolean isLastNameInitialUpperCase = (iLastName.charAt(0)>='A' && iLastName.
//                charAt(0)<='Z');
//
//        if(indexOfSpace==-1){  //yani bosluk bulamiyorsa
//            System.out.println("First name or last name missed");
//        }
//        if(!isFirstNameInitialUpperCase || !isLastNameInitialUpperCase){
//            System.out.println("Error in initials");
//        }
//        if(fullName.equals(fullName.toUpperCase())){
//            System.out.println("Format error");
//        }
//        if(fullName.replaceAll("\\s","").length()==0){
//            System.out.println("Name was not entered");
//        }
//        if(fullName.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){
//            System.out.println("Invalid Name");
//        }


//-------------------------------------------------------------------------------------------

 /*8) Type code to check the format of state abbreviations in the USA
 a) Your code should print "State abbreviations cannot have more than 2 characters" if the
abbreviation has more than 2 characters
 b) Your code should print "State abbreviations cannot have lowercase characters" if the
abbreviation has lowercase characters
 c) Your code should print "State abbreviations cannot have characters different from
letters" if the abbreviation has characters different from letters.
 Note: If the abbreviation has more than 1 error all related error messages should be printed.
For example; for "fl3" your code should print, "State abbreviations cannot have more than
2 characters", "State abbreviations cannot have lowercase characters", and "State abbreviations
 cannot have characters different from letters"

  */
//        String abbState = "Tr";
//
//        if (abbState.length()>2) {
//            System.out.println("State abbreviations cannot have more than 2 characters");
//        } if (abbState.charAt(0)>='a' && abbState.charAt(1)<='z') {
//            System.out.println("State abbreviations cannot have lowercase characters");
//        } if (abbState.replaceAll("[A-Za-z]","").length()>0){
//            System.out.println("State abbreviations cannot have characters different from\n" +
//                    "letters");
//        }

//---------------------------------------------------------------------------------------------

/*9) Type code to create a simple calculator which does addition, subtraction, multiplication,
and division with any 2 number
 a) When user entered 10.2 and 5 and + sign your code should print "The result is
 15.2" on the console
 b) When user entered 10 and 5 and - sign your code should print "The result is 5.0"
 on the console
 c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0"
 on the console
 d) When user entered 10 and -5 and / sign your code should print "The result is -2.0"
 on the console

 */
System.out.println("Enter the first number:");
double num1 = scan.nextDouble();
System.out.println("Enter the second number:");
double num2 = scan.nextDouble();

System.out.println("Which mathematical operation would you like to do?");
String opr = scan.next();

    switch(opr) {
        case "+":
            System.out.println("num1 + num2 = " + (num1+num2));
            break;
        case "-":
            System.out.println("num1 - num2 = " + (num1-num2));
            break;
        case "*":
            System.out.println("num1 * num2 = " + (num1*num2));
            break;
        case "/":
            System.out.println("num1 / num2 = " + (num1/num2));
            break;
        default:
}


//------------------------------------------------------------------------------

// 10 - Type code to print the messages about the Body Mass Index(BMI) for the given BMI values
//      Invalid BMI value < 0
//      Underweight = <18.5
//      Normal weight = 18.5–24.9
//      Overweight = 25–29.9
//      Obesity = BMI of 30 or greater

//        double bmi = 12;
//        if(bmi<0){
//            System.out.println("Invalid BMI value");
//        }else if(bmi<18.5){
//            System.out.println("Underweight");
//        }else if(bmi<24.9 && bmi>=18.5){
//            System.out.println("Normal weight");
//        }else if(bmi<29.9 && bmi>=25){
//            System.out.println("Overweight");
//        }else if(bmi>30){
//            System.out.println("Obesity");
//        }











    }
}




