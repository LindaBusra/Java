package JavaLessons.day26_exceptions;

public class E25 {

    public static void main(String[] args) {


        int num1, num2;
        try {

            num1 = 0;
            num2 = 46 / num1;
            System.out.println(num2);
            System.out.println("I'm at the end of try block");
        }
        catch (ArithmeticException e) {
            /* This block will only execute if any Arithmetic exception
             occurs in try block
             */
            System.out.println("You should not divide a number by zero");
        }
        catch (Exception e) {
            /* This is a generic Exception handler which means it can handle
             all the exceptions. This will execute if the exception is not
              handled by previous catch blocks.  */

            System.out.println("Exception occurred");
        }
        System.out.println("I'm out of try-catch block in Java.");

    }
}
