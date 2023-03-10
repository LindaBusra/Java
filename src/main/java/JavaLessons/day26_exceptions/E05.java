package JavaLessons.day26_exceptions;

public class E05 {

    /* In this program we are checking the Student age
     * if the student age<12 and weight <40 then our program
     * should return that the student is not eligible for registration.
     */

    static void checkEligibilty(int age, int weight){

        if(age<14 && weight<45) {
            throw new ArithmeticException("Student is not eligible for registration");
        }
        else {
            System.out.println("Student Entry is Valid!!");
        }
    }

    public static void main(String args[]){
        System.out.println("Welcome to the Registration process!!");
        checkEligibilty(13, 42);
        System.out.println("Have a nice day..");
    }
}