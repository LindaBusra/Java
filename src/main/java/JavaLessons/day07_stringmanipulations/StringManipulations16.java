package JavaLessons.day07_stringmanipulations;

public class StringManipulations16 {

    public static void main(String[] args) {



// Type a code to find the number of punctuation marks used in a String. (! , . , ' , - , " , ? , ; )

        String str = "Wow!... Emily is 13 years old, and he is a university.";


//String strNew = str.replace(" ", "").replaceAll("[a-zA-Z0-9]", "");

        String strNew = str.replaceAll("[^\\p{Punct}]", "");
        System.out.println(strNew);
        System.out.println(strNew.length());

        //Not:  [^\p{Punct}] => \\P{Punct}
        // String strNew = str.replaceAll("[^\\p{Punct}]", "");

        String strNew2 = str.replaceAll("\\P{Punct}", "");
        System.out.println(strNew2);



//regular expression for ALL punctuations can be typed "\\p" ==> By replaceAll() punctuation will be replaced with nothing.
//So, we can find the number of characters in the statement.



//-----------------------------------------------------------------------------



//if your code does not work for all values, it is called "Hard Coding" and  "Hard Coding" cannot be accepted

    /*
    Regex : Regular Expressions
    Regex represents a group of data.
    All digits:   [0-9]
    All lowercase letter: [a-z]
    All uppercase letter: [A-Z]
    All lowercase and uppercase letter: [a-zA-Z]
    All lowercase and uppercase letter: [a-zA-Z0-9]
    All characters different from digits : [^0-9]
    All characters different from vowels: [^aeiou]

    Space character \\s
    All characters different from space character \\S

    All digits:  \\d
    All characters different form digits \\D

    All upper and lowercase letters and digits and _: \\w
    Different from All uppercase, lowercase letters and digits and _:\\W


    All punctuation marks:   \\p{Punct}
    Different from all punctuation marks :  \\P{Punct}  or [^\p{Punct}]

     */



    }
}
