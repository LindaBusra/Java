package JavaLessons.day27_exceptions;

public class CustomExceptions01 {

    /*
    Normally Java has many Exception classes which cover many issues.
    Sometimes we need Custom Exceptions for 2 reasons.
    1)To make Java exceptions more specific

    "FileNotFoundException" has to reason in it i)path can be wrong ii)file doesn't exist
    Which one for example

    2)To create some exceptions for our application.
    "IllegalGradeException" can be created for a school management system application.

    3)Custom Exceptions guide the developers not to break the application rules

    //Exception is a class. When you name a class don't forget to put Exception the last part of name

    */
    public static void main(String[] args) {

        try {
            printGrades(45);
        } catch (IllegalGradeException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(checkNameFormat("Tom"));



    }
    public static void printGrades(double grade) throws IllegalGradeException {  //Compile time error, we use throws

        if(grade <0 || grade>100) {
            throw new IllegalGradeException("Grade can not be less than zero and more than 100");
        } else {
            System.out.println(grade);
        }
    }



    public static boolean checkNameFormat(String name ) {       //Run time error
        if(name.charAt(0) >='A' && name.charAt(0) <='Z') {
            return true;
        } else {
            throw new IllegalNameException("Names must start with uppercases");
        }
    }



    }
