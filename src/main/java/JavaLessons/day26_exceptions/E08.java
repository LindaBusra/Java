package JavaLessons.day26_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E08 {
    public static void main(String[] args) throws FileNotFoundException {


        //It gives compile time exception,
        // we added throws FileNotFoundException between ) and {
        //we can type throws IOException also between ) and {

        FileInputStream fis = new FileInputStream("src\\main\\java\\JavaLessons\\day26_exceptions\\File01.txt");


        //or we can use try-catch

        try {

            FileInputStream f = new FileInputStream("src\\main\\java\\JavaLessons\\day26_exceptions\\File01.txt");

        } catch(FileNotFoundException e) {
            System.out.println("Path is wrong or file does not exist");
        }
    }





}
