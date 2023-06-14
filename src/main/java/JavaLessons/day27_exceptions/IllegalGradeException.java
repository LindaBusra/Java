package JavaLessons.day27_exceptions;


//to make a class exception class make it child of the "Exception Class" by using "extend" keyword
//If you use "extends Exception" it will be "Compile Time Exception" (Checked Exception)
public class IllegalGradeException extends Exception{



    public IllegalGradeException (String message) {         //we create a constructor for that class
        super(message);


    }

}
