package JavaLessons.day07_stringmanipulations;

public class StringManipulations05 {
    public static void main(String[] args) {




        String str = "Ali is 13 years old, I think he is 15";


//Example1-remove all space characters from the String

        String noSpace = str.replace(" ", "");
        System.out.println(noSpace);


//Example2-Change digits to *


/* ------------- Example for "hard coding"----------------------
if you type a code which runs just for specific data, it is "Hard Coding"
and it is not acceptable in coding.
 */


        String noDigit = str.replace("13", "*").replace("15", "*");
        System.out.println(noDigit);


// ------------- Example without "hard coding"----------------------


        String noDigit2 = str.replaceAll("[0-9]", "*");
        System.out.println(noDigit2);


// ------------- Example without "a and e"----------------------


        String noAe = str.replaceAll("[ae]", "*");
        System.out.println(noAe);


//Change all letters to !   (it uses in the password)


        String noLetters = str.replaceAll("[a-z-A-Z]", "!");
        System.out.println(noLetters);



//Change all characters different from letters to ?

        System.out.println(str.replaceAll("[^A-Za-z]", "?"));



//Change all characters different from digits to *

        System.out.println(str.replaceAll("[^0-9]", "*"));



//Change all characters different form space to asterix

        System.out.println(str.replaceAll("[^ ]", "*"));

/*      1-  \\s means space character
        2-  \\S means different from space character
        3-  \\d means digits
        4-  \\D means different form digits
        5-  \\w means A-Z and a-z and 0-9
        6-  \\W means different from A-Z and a-z and 0-9
        7-  \\p{Punct} means all punctuation marks
        8-  \\P{Punct} means different from all punctuation marks
 */

        System.out.println(str.replaceAll("\\d", "*"));
        System.out.println(str.replaceAll("\\s", "!"));
        System.out.println(str.replaceAll("\\D", "@"));
        System.out.println(str.replaceAll("\\S", "}"));


//Example- How many characters ara used in string different from space

        System.out.println(str.replaceAll(" ", "").length());


//How many digits are used in the String

        System.out.println(str.replaceAll("\\D", "").length());


//How many letters are used in the String

        System.out.println(str.replaceAll("[^a-zA-Z]", "").length());


////How many punctitions marks are used in the String

        System.out.println(str.replaceAll("\\P{Punct}", "").length());




    }
}