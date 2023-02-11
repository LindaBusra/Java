package JavaLessons.day07_stringmanipulations;

import java.util.Scanner;

public class StringManipulations08 {
    public static void main(String[] args) {



//1.Example: Type code to get initials of the first name and the last name
// of a given name. Ali Can ==> AC, Mary Star ==> MS etc.


        String name = "Tom Hanks";

        String iOfFirstName = name.split(" ")[0].substring(0,1);
        String iOfLastName = name.split(" ")[1].substring(0,1);

        System.out.println(iOfFirstName.toUpperCase()+iOfLastName.toUpperCase());



// 2. way
        int space = name.indexOf(" ");

        String iOfFirstName1 = name.substring(0,1);
        String iOfLastName1 = name.substring(space+1,space+2);

        System.out.println(iOfFirstName1 + iOfLastName1);


//--------------------------------------------------------------------------



//2.Example: Type code to find the number of word in a String
        String word= "I like to move it, move it";

        int numOfWord = word.split(" ").length;  //how many word I have
// after split I dont use () for length
//if you use "length" after split() method do not use parenthesis, when you use it for strings put parenthesis

        System.out.println(numOfWord);



//-------------------------------------------------------------------------------------------


//3.Example: Print first and last word on the console

        String a = "Welcome to my house";
        String first = a.split(" ")[0];
        int lastWord = a.split(" ").length;
        String last = a.split(" ")[lastWord-1];

        System.out.println(first + " " + last);






    }
}
