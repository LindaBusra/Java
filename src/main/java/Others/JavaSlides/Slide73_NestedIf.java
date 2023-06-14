package Others.JavaSlides;

import java.util.Scanner;

public class Slide73_NestedIf {
    public static void main(String[] args) {



//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("What is your score?");
//        int score =scan.nextInt();
//
//        if (score<50) {
//            System.out.println("you will fail :( ");
//        } else if ((score >=50) && (score<=100)){
//            System.out.println("you will pass :) ");
//        } else if ((score<=0) || (score>100)) {
//            System.out.println("Invalid scare");
//        }
//        System.out.println("<------------------------------------------------------------------------------>");

//------------------------------------------------------------------------------------------


        //if Statement Questions

  //1-Type java code, if an integer is even, output will be “The integer is even”.
  //If the integer is odd, output will be “The integer is odd”

        int number= 25;

        if (number%2==0) {
            System.out.println("The integer is even");
        } else {
            System.out.println("The integer is odd");
        }
        System.out.println("<------------------------------------------------------------------------------>");

//2-Type java code by using if statement. When you enter the initial of the day of a week,
//output should be all possible names of the days.
//For example; if the initial is ’S’ output should be “Saturday or Sunday”

       Scanner scan = new Scanner(System.in);

       System.out.println("Enter an initial of the day of a week");
       String day =scan.next();

       String newDay = day.toLowerCase();
       if(newDay.equals("m")) {
           System.out.println("Monday");
       } else if (newDay.equals("t")) {
           System.out.println("Thirsday and Thursday");
       }  else if (newDay.equals("w")) {
           System.out.println("Wednesday");
       } else if (newDay.equals("f")) {
           System.out.println("Friday");
       } else if (newDay.equals("s")) {
           System.out.println("Saturday and Sunday");
       } else {
           System.out.println("Invalid");
       }
        System.out.println("<------------------------------------------------------------------------------>");

       //4- Ask user to enter the values of length and width of a rectangle, then check if it is square or not.

        System.out.println("What is the length  of a rectangle?");
        double length =scan.nextDouble();
        System.out.println("What is the width  of a rectangle?");
        double width =scan.nextDouble();

        if(length==width) {
            System.out.println("it is square");
        } else {
            System.out.println("it is rectangle");
        }
        System.out.println("<------------------------------------------------------------------------------>");

/*Type a program which converts the mile to kilometer. Mile value will be
entered by user. (Use double)
Hint 1: km = mile X 1.6
Hint 2: To get double, use nextDouble()  */

        System.out.println("What is the mile?");
        double mile =scan.nextDouble();
        System.out.println("km is " + (mile*1.6));

//----------------------------------------------------------------------------


        // "Type java code by using if-else statement, Write
        // a program to print absolute value of a number entered
        // by user. Absolute Value: If the number is positive or zero
        // return the number itself. If the number is negative return
        // the number after multiplying by -1"

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a value");
//        int number = scan.nextInt();
//
//        if(number>=0) {
//            System.out.println("absolute value of " +  number + " is " + number);
//
//        } else {
//            System.out.println("absolute value of " +  number + " is " + (number*(-1)));
//        }

//-------------------------------------------------------------------------------------------------
/*
Q-1, Slide 73 Ask user to enter a password
If the initial of the password is uppercase then check if it is ‘A’ or not.
If it is ‘A’ the output will be “Valid Password”
otherwise the output will be “Invalid Password”
For example; Ali ==> Valid password - ali ==> Invalid - Mark ==> Invalid

If the initial of the password is lowercase then check if it is ‘z’ or not.
If it is ‘z’ the output will be “Valid Password”
otherwise the output will be “Invalid Password”
For example; zoe ==> Valid password - Zoe ==> Invalid - john ==> Invalid

 */         // tam calismiyor!!!!!!!!!!!!!!!
        Scanner imput = new Scanner(System.in);
        System.out.println("Enter a password");
        char passwordInitial= imput.next().charAt(0);


        int asciiOfNumber = passwordInitial;

        if (asciiOfNumber >= 65 && asciiOfNumber <= 90) {
            if(passwordInitial=='A') {
                System.out.println("Valid Password");
            }  else {
                System.out.println("Invalid password");
            }
        } else if ( asciiOfNumber >= 97 && asciiOfNumber <= 122) {
            if (passwordInitial == 'z') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid password");
            }
        }

//charAt() mthod returns just a single karakter.
//data type in java for single charackter is "char". Because of that I used char dat type for the pdw container
    //java scanner clasinda nextChar() metodu yoktur, bunun yerine string olarak ilk kelimeyi alip onun da ilk harfini alabiliriz.



//-------------------------------------------------------------------------------------------------------------


/* Q-3, Slide 73 Type java code by using nested if statement,
If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
“Perfect even number” otherwise, the output will be “Good even number.”
If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
“Perfect odd number” otherwise, the output will be “Good odd number.”

 */

        int number1 = 91;

        if(number1 %2  == 0) {
            if(number1 %3 == 0) {
                System.out.println("Perfect even number");
            } else {
                System.out.println("Good even number");
            }
        } else {
            if (number1 % 3 == 0) {
                System.out.println("Perfect odd number");
            } else {
                System.out.println("Good odd number");
            }
        }

//------------------------------------------------------------------------------------------------------------



















    }

}
