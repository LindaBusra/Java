package JavaLessons.day26_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {
    public static void main(String[] args) throws IOException {

        /*
        1) FileNotFoundException is related with the "Path of the file" and the "Existence of the file".
        2)"FileNotFoundException" is "Compile Time Exception" (Checked Exception)
        3)"FileNotFoundException" is the child of "IOException"

        4)"IOException" is related with all possible input output issues.
        5)"IOException" is "Compile Time Exception" (Checked Exception)

        Note:"Run Time Exception" : (Unchecked Exception)

        6)When you use parent and child exception classes together in a try-catch, child classes must come first otherwise Java gives error.

        7)When you encounter a "Compile Time Exception", you have to options:
                i)Using "throws" in method signature line
                    *Java will throw exception and stop the execution
                ii)Using try-catch block
                    *Java will execute whatever you typed inside the catch body and does not stop the execution.

        8)What is the different between "throw" and "throws" keywords?

            i)"Throw" keyword is used to throw and Exception in anywhere inside the method body.
            "throws keywords is used in the method signature line  --> ) *  {

            ii)By using "throws" keyword you can declare multiple exceptions
            After using "throw" keyword you can  declare just one exception

            iii)After using "throw" keyword you have to create an Exception object.
            After using "throws" keyword, you will tell just the name Exception class

            Exceptions: That can handle
            Error:Can not be handled. If there is error, it means there is nothing to do.

        9)What is the difference between Exception and error. "Exception" can be handled but "Error" can not.
        OutOfMemory, StackOutOfMemory, VirtualMachine, Assertion can be example for errors.
        if StackOutOfMemory, it means there is not enough space in memory.

         */

        //throw-->stop execution


        readTheText();

        System.out.println();

        readTheTextFromTheFile();


    }

    //Create a method to read a text from a text file.
    //If the path is wrong, if the file does not exist, if the file can not be read stop execution

    public static void readTheText() throws IOException {         //it was FileNotFoundException, but I have to write something for reading also.

        FileInputStream fis = new FileInputStream("src\\main\\java\\JavaLessons\\day26_exceptions\\File01.txt");             //to get data from file or to get something outside the code, exceptionsX  I put X for negative scenario
        int k = 0;

        while ((k = fis.read()) != -1) {           //it reads with ascii value, it does not equal to -1...if java can not next character, it will return-1

            System.out.print((char) k);      //(char)74 -->j, (char)97 -->a
        }
    }

//Create a method to read a text from a text file.
//If the path is wrong, give a message to the user and do not stop execution
//if the file does not exist, give a message to the user and do not stop execution
//if the text cannot be read, give a message to the user and do not stop execution
    public static void readTheTextFromTheFile() {

        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\JavaLessons\\day26_exceptions\\File01.txt");           //for negative scenario: exceptionsX --->to do not find the file I put X
            int k = 0;
            while ((k = fis.read()) != -1) {                ////To read that text I will create loop. After "?"  it stop to reading
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {                 //For make our code more spesific
            System.out.println("There is an issue in path or in the file - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("There is an issue in reading the text - " + e.getMessage());
        }

        System.out.println("Execution did not stop");

    }
}