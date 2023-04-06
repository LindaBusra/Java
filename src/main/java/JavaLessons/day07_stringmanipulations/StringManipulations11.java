package JavaLessons.day07_stringmanipulations;

import java.util.Scanner;

public class StringManipulations11 {
    public static void main(String[] args) {




String str = "Emily is 13 years old, I like Emily, Emily does not like me!...";

//Example 1. How many punctuations are used in the given String

        System.out.println(str.replaceAll("[^\\p{Punct}]", "").length()  ); //6
        System.out.println(str.replaceAll("\\P{Punct}", "").length()  ); //6

//or
        int numOfAllChars = str.length();
        int numOfAllCharsDifFromPuncMarks = str.replaceAll("\\p{Punct}","").length();

        System.out.println(numOfAllChars-numOfAllCharsDifFromPuncMarks); //6



 //-------------------delete spaces---------------------------------



//Example 2-Ask user to enter his full name, and fix if the user enters space
//at the beginning and at the end.


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String name = scan.nextLine();

        String fixedFullName = name.trim();
        System.out.println("Name without space: " + fixedFullName);





    }
}
