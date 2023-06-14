package JavaLessons.day27_exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {


        readFileLineByLine();

    }
    public static void readFileLineByLine(){

        //java has a class for to read file-->BufferedReader


        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\main\\java\\JavaLessons\\day27_exceptions\\File01.txt"));

            String line = reader.readLine();            //when we will use reader.readLine(); it goes the file and gets first line

            while(line != null) {
                System.out.println(line);
                line = reader.readLine();               // it should go second line....
            }

        } catch (FileNotFoundException e) {
            System.out.println("There is an issue about the path or about the file" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
