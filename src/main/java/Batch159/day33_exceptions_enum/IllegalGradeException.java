package Batch159.day33_exceptions_enum;

public class IllegalGradeException extends RuntimeException {  //if you want to make your exception class unchecked, it must be extend RuntimeException


    public IllegalGradeException(String msg){ //most of the times when we throw exception we need message as well.

        super(msg);
    }
}
