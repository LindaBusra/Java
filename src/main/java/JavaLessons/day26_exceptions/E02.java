package JavaLessons.day26_exceptions;

public class E02 {

    public static void main(String[] args) {

    /*
    1)if you want to execute a code for every scenario, use "finally" block after "try" body.
    2)"try" can be used like i) try+single catch    ii)try + multiple catch
    iii)ii)try + multiple catch + finally,  iv)try + single catch + finally   v) try + finally

    Finally uses in try-catch.
    Note: try can not be used alone. using catch is not mandatory.

    3)"ArithmeticException", "NullPointerException", "NumberFormatException", "ArrayIndexOutOfBoundsException",
    "StringIndexOutOfBoundsException", "IllegalArgumentException"  are displayed on the console after I click on
    "Run" button therefore those are called "RunTime Exceptions"

    4)There is "Compile Time Exception", they will be displayed before clicking on the "Run" button.
    Therefore they are called "Compile Time Exception"

    All these exceptions i run time exceptions. they are not visible

     */


//when you send username and password in database-->verification, if it is not ok, it must be cut connection with database.
//    divide(6,2);  //happy scenario

    divide(6,0);


    }

    //Create a method to do division then save the result into database

    public static void divide(int a, int b) {

        try {
            System.out.println(a / b + " was saved into database");
        } catch (ArithmeticException e) {
            System.out.println("Do not use zero as divisor");
        } finally {
            System.out.println("Cut the connection with the database");
        }

    }



}