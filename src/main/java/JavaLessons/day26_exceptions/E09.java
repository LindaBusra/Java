package JavaLessons.day26_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E09 {

    public static void main(String[] args) throws IOException {


        //it gives CTE
        //FileNotFoundException can handle just this part
        FileInputStream f = new FileInputStream("src\\main\\java\\JavaLessons\\day26_exceptions\\File01.txt");

        //to handle that part we have to throw IOException between ) and {
        int i=0;

        while( (i = f.read()) != -1) {

            System.out.println((char) i);
        }

        f.close();


        //IOException and FileNotFoundException are compile time exceptions
        //FileNotFoundException  extends IOException
        //IOException is produced by failed or interrupted input or output operations



    }
}
