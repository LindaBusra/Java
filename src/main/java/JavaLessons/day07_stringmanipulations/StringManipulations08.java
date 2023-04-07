package JavaLessons.day07_stringmanipulations;

import java.util.Scanner;

public class StringManipulations08 {
    public static void main(String[] args) {


//1.Example: Type code to get initials of the first name and the last name
// of a given name. Ali Can ==> AC, Mary Star ==> MS etc.

        //1.way
        String name ="Mary Star";
        int space = name.indexOf(" ");

        System.out.println(name.charAt(0)+name.substring(space+1, space+2));


        //2.way
        String str[] = name.split(" ");

        for(String w: str) {

            System.out.print(w.charAt(0));
        }



        System.out.println();

        //3.way
        String iOfFirstName = name.split(" ")[0].substring(0,1);
        String iOfLastName = name.split(" ")[1].substring(0,1);

        System.out.println(iOfFirstName.toUpperCase()+iOfLastName.toUpperCase());


//--------------------------------------------------------------------------



//2.Example: Type code to find the number of word in a String
        String word= "I like to move it, move it";

        //1.way
        System.out.println(word.replaceAll("\\S", "").length() + 1);

        //2. way
        String s[] = word.split(" ");
        System.out.println(s.length);



//-------------------------------------------------------------------------------------------


//3.Example: Print first and last word on the console

        String a = "Welcome to my house";

        String w[] = a.split(" ");

        System.out.println(w[0] + " " + w[w.length-1]);


        //or
        String first = a.split(" ")[0];
        int lastWord = a.split(" ").length;
        String last = a.split(" ")[lastWord-1];

        System.out.println(first + " " + last);


    }
}
