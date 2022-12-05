package JavaLessons.day05_concatenation_modulus_nestedternary;

public class NestedTernary01 {
    public static void main(String[] args) {

/*
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
 */


        int year = 1800;
        String isLeap  = year % 100 == 0 ?    (year % 400 == 0? "Leap" : "Not leap") : (year % 4 == 0 ? "Leap" : "Not leap" ) ;
        System.out.println(isLeap);




        int year1 = 2017;

        if(year1 % 100 == 0) {
            if(year1 % 400 == 0) {
                System.out.println( year1 + " is a leap year");
            }
        } else if (year1 % 4 == 0) {
            System.out.println( year1 + " is a leap year");
        } else{
            System.out.println( year1 + " is not a leap year");

        }

//--------------------------------------------------------------------------------

 /*
     Type code to check the password
     If it has more than 8 characters, initial should be 'i'
     If it has no more than 8 characters initial should be 'K'
     Solve the task by using nested-ternary
*/

        String password = "ia1b3cXyz";

        String isValid =  password.length()>8 ? (password.charAt(0)=='i' ? "Valid" : "Invalid") : (password.charAt(0)=='K'? "Valid" : "Invalid") ;

        System.out.println(isValid);





    }
}
