package JavaLessons.day26_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E15 {

    public static void main(String[] args) {



        try{

        FileInputStream fis = new FileInputStream("src\\main\\java\\JavaLessons\\day26_exceptions\\File01.txt");

        } catch(FileNotFoundException e) {
            System.out.println("Hey");
        } catch(IOException e) {        //actually we dont have this part.  The output cannot be Bye
            System.out.println("Bye");
        } finally {
            System.out.println("Good night");
        }

        //we have two options here. positive situation :nothing(prints nothing) and Good night
        //                          negative situation: Hey Good night

        //If we switch FileNotFoundException and IOException it gives CTE because of parent must come after child
    }
}
