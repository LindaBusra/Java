package JavaLessons.day27_exceptions;


//When you "extend" to "RuntimeExceptions Class"  your "Custom Exception" will be "RunTimeException"
public class IllegalNameException extends RuntimeException{

    public IllegalNameException (String message) {

        super(message);
    }
}
