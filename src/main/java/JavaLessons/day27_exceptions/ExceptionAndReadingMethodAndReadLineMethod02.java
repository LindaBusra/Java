package JavaLessons.day27_exceptions;

import java.io.*;

public class ExceptionAndReadingMethodAndReadLineMethod02 {
    /*
    If they ask us to type code to read a text...We should say do you want me to type reading code with read()
    letter by letter or readLine().

    Firstly create a text file==>for reading one by one  */

   /*   If they ask to type code readLine() long lines instead of reading one by one
   firstly create a long text for readLine(). */

    public static void main(String[] args) {

        try { //normally we just typed ==>BufferedReader br= new BufferedReader(new FileReader("src\\main\\java\\day29Exception02\\TextFile01"));
            //java gave CTE bec. it is not sure about the correctness of the path for the file or the existence of the file so we come over
            // FileReader class name and chose add try-catch clauses.

            BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\JavaLessons\\day27_exceptions\\File01.txt"));

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine(); //by this way java will repeat the action, each line will be printed in order.
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}








