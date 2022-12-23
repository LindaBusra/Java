package JavaLessons.day14_arrays_foreachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Array40 {
    public static void main(String[] args) {



//Example 1-  09/20/2022 is given, print the date "Month: 09   Day:20   Year:2022

      String a ="09/20/2022";

      String b[]= a.split("/");     //split method returns Array

      System.out.println(Arrays.toString(b));     //[09, 20, 2022]


            System.out.println("Month: " + b[0]);
            System.out.println("Day: " + b[1]);
            System.out.println("Year: " + b[2]);



//----------------------------------------------------------------------------------------------------------------------



//Example 2- Get string from user and type code to find the number of words in a String.

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a sentence....");
    String text = scan.nextLine();              //"I like to move it, move it";


     String text1[] = text.split(" ");

     System.out.println("the number of words in a String: " + text1.length);



//-------------------------------------------------------------------------------------



//Example 3:Count the number of words starts with "a" in the String


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence....");
        String str = input.nextLine();              //text :  Get string from user and type,  Get string from user and type

        String str1[] = str.split(" ");
        int count = 0;
        String ch = "a";

        for(String w: str1) {


            if(w.startsWith(ch)) {
                count++;
            }
        }

        System.out.println(count + " words start with " + ch);



//---------------------------------------------------------------------------------------------------------------












    }
}
