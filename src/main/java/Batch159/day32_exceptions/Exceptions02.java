package Batch159.day32_exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        /*Throwable class-->    1)Exception Class : Exception can be handles  --> a)Runtime Exceptions    b)Compile Time Exceptions
                                2)Error Class : There is nothing to handle, If you get any error, your application is down.
                                Type of errors: StackOutOfMemory Error. if stack memory is full java can not do anything. (Be carefully about memory usage)
                                                OutOfMemory Error (This is for heap memory, you created a lot of uncontrolled objects, it means your application is died)
                                                Virtual Machine Error

        RuntimeExceptions (Un-Checked Exception) :Exception will be thrown after you click on run button.
        1)Arithmetic Exception, 2)ArrayIndexOutOfBoundException, 3)StringIndexOutOfBoundException
        4)NullPointer Exception,  5)NumberFormatException

        Compile Type Execution (Checked Exception): This type exception will occur when you type code
        1)File Not Found Exception  2)IO Exception (input-output exception)


       1)When you use "multiple catch block"s after "try-block " the order of "multiple-catch-block"s does not matter
         You can put them in any order but following the code order is the best practice.
         Note:But some "Exception Classes" are the parent of another Exception Classes, when you use parent-child Exception Classes
         child Exception Class must come first
         2)"Try-block "can not be used alone.
            i)"try-block" + single catch block
            ii)"try-block" + multiple catch block
            iii)"try-block" + finally block
            iv) "try-block" + single catch-block + finally block
            v) "try-block" + multiple catch-block + finally block
         */


        divideByNumOfCharsInString("123");
        divideByNumOfCharsInString("1a2");   //NumberFormatException
        divideByNumOfCharsInString("1");    //ArithmeticException
        divideByNumOfCharsInString(null);   //NumberFormatException

        divideByNumOfCharsInString2("123");
        divideByNumOfCharsInString2("1a2");   //NumberFormatException
        divideByNumOfCharsInString2("1");    //ArithmeticException
        divideByNumOfCharsInString2(null);   //NumberFormatException
    }

//Example 1: Create a method divides an integer converted from a String by 1 less than the number of characters of the String
//           String s = "240"; ==> 240 / 3 = 80

    //1.Way: To handle multiple exceptions -->For every type of exception, I found different type solution.
    public static int divideByNumOfCharsInString(String str) {

        try {
            int num = Integer.valueOf(str);     //1a-->NumberFormatException, null-->NumberFormatException,  java stop the execution
            int numOfChars = str.length();
            return num / (numOfChars - 1);      //Arithmetic Exception
        } catch (NumberFormatException e) {
            System.out.println("Do not use non-digit characters in value of method");       //my own message, non-technical message
            System.out.println(e.getMessage());     //For input string: "1a2"--> java's technical message
            e.printStackTrace();        //gives all the details about exception
            return 0;
        } catch (ArithmeticException e) {
            System.out.println("There is a problem in mathematically operation");
            System.out.println(e.getMessage());     //   / by zero --> java's technical message
            e.printStackTrace();
            return 0;
        } catch (NullPointerException e) {      //it is possible to get this exception
            System.out.println("Do not use null with some String class methods");
            System.out.println(e.getMessage());     //Cannot parse null string, it does not have any technically message
            e.printStackTrace();
            return 0;
        }
    }



    //2.Way: To handle multiple exceptions  -->if task will you a generally solution you can 2.way
    public static int divideByNumOfCharsInString2(String str) {

        try {
            int num = Integer.valueOf(str);     // "240"; --> 240
            int numOfChars = str.length();      //"240"-->3
            return num / (numOfChars - 1);      //240/(3-1)=120
        } catch (Exception e) {
            System.out.println("Exception was caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }




}