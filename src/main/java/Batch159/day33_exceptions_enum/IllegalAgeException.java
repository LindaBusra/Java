package Batch159.day33_exceptions_enum;

public class IllegalAgeException extends Exception {      //it is custom exception, it must be child of Java Exception class

    public IllegalAgeException(String msg){

        super(msg);        //go to parent class and get the constructor of parent class
    }

}

