package JavaLessons.day26_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E14 {

    public static void main(String[] args) {


        try {

            FileInputStream fis = new FileInputStream("src\\main\\java\\JavaLessons\\day26_exceptions\\File01.txt");

            int k=0;
            while((k=fis.read()) != -1) {
                System.out.print((char)k);
            }


        } catch (FileNotFoundException e) {     //child must be first
            System.out.println("Path is wrong or file does not exist");
        } catch (IOException e ){               //parent
            System.out.println("Text could not be read or the file could not be closed");
        } finally {
            System.out.println("Close the file");
        }
    }
}
