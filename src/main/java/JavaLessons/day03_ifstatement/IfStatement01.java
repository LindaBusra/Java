package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {


/*  if statement: We need to execute same codes under some specific conditions.
    if it rains,  I will cancel the picnic.
    Condition       Result              */



 // Example 1 :Type code to print negative for the numbers less than zero, non-negative for
//the numbers greater than or equal to zero


       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number please");
       double num = scan.nextDouble();

       if(num<0) {
           System.out.println("negative");
       } else if (num>=0) {
           System.out.println("positive");

       } else {
           System.out.println("Invalid input");
       }



 //---------------------------------------------------------------------

//Example 2: Type code to print "Divisible by 5" if the number can be divided by 5
//otherwise print "non divisible by 5" if the number can not be divided by 5.
//Note:"==" in java checks equality like "=" in Math
//Note: "!" in java means "does not equal to"
//  !true-->false   !false-->true       !!true-->true


        int number = 27;

        String result = number%5 == 0 ? "Divisible by 5" :   "non divisible by 5";

        System.out.println(result);



 //---------------------------------------------------------------------



 //Example 3 - Compare to number
        int s1 = 80;
        int s2 = 50;

        if(s1 > s2){
            System.out.println(s1 + " is greater than " + s2);
        }
        else if(s1 < s2){
            System.out.println(s2 + " is greater than " + s1);
        }
        else {              //else:for the other options
            System.out.println(s1 + " is equals to " + s2 );
        }






    }
}
