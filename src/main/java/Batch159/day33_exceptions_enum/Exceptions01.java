package Batch159.day33_exceptions_enum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions01 {

        /*
            1)If you get red underline while you type code, it means it is CompileTime Exception (Checked Exception)
            2)To handle Checked Exception you can use "try-catch" block.
            3)If you use multiple catch blocks after try block anf the Exception Classes have parent-child relationship
            Child Exception Class must be typed first, Parent must be typed later.

            Interview Question:
            What is the difference between "throw" and "throws" keywords?
            i)"throw" is used in the method body, "throws" is used in the method signature line.
            ii)"throw" can be used many times in a method body, but "throws" can be used just once.
            iii)After using "throw" keyword we create an Exception Class Object, but after using "throws" we type just the name of the Exception Class
            iv)After using "throw" keyword we can use just one Exception Class, but after using "throws" we can use multiple Exception Classes
            v)"throw" keyword handles the Exception and lets next codes to be executed, but "throws" make the code throws exception and stops the execution
     */

    public static void main(String[] args)  {  //or throws IOException

        readTextFile1();


        try {                                   //or throws IOException after method signature
            readTextFile2();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    //Example 1: Create a method reads text in a text file.

    //1.way: Used try-catch
    public static void readTextFile1()  {

        try {
            FileInputStream fis = new FileInputStream("src/main/java/Batch159/day33_exceptions/MyTestFile.txt");     //To get data from the file

            int k=0;
            while( (k=fis.read()) != -1){          //it gives ascii value for every character fis.read(). For example first for "J"

                System.out.print((char)k);      //because I dont want ascii value. I used casting with (char)
            }


        } catch (FileNotFoundException e) {         //FileNotFoundException is for path and the existence of the file. Compile Time Exception (Checked exception)
            System.out.println("There an issue in the path or the file was deleted");
        } catch (IOException e) {                   //IOException is for all issues related with Input and Output. Compile Time Exception (Checked exception). this exception is about reading characters
            System.out.println("Some characters are not in English");
        }
    }


    //2.way: Used "throw" keyword
    public static void readTextFile2() throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/Batch159/day33_exceptions/MyTestFile.txt");

        int k=0;
        while( (k=fis.read()) != -1){

            System.out.print((char)k);
        }

    }

}


/*To be able to read text file I use FileInputStream class. It is coming from java.io library.
It is stands for input-output. From a file I will get data into my system as a stream. Stream means
first line will be the first element, second line will be the second element...
It is not like list, it has different structure.
path of file: src/main/java/Batch159/day33_exceptions/MyTestFile.txt (right click on file-->copy path/reference-->path from content root

java thinks : if file address is wrong what will I do ? -->try-catch

IOException can handle accessing and reading file issues
If an exception class covers another exception class it calls parent. If the name is general it is parent exception.

Exception > IO Exception > FileNotFoundException
If between exception classes there is parent-child relationship, child comes first. We should make child first.

40.55
         */


