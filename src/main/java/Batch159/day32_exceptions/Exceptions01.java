package Batch159.day32_exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        //

        String str = "java";
        System.out.println(getCharFromStringByIndex(str,2));
        System.out.println(getCharFromStringByIndex(str,4));    //String index out of range


        System.out.println(getNumberOfCharsInString("Automation"));
        System.out.println(getNumberOfCharsInString(" "));      //1
        System.out.println(getNumberOfCharsInString(""));      //0
        System.out.println(getNumberOfCharsInString(null));      //0


        System.out.println(stringContains(null));      //true


        System.out.println(convertStringToInteger1("123")+ 1);       //124 to be sure it is converted to integer
        System.out.println(convertStringToInteger1("1ab")+ 1);       //1ab can not convert to Integer
        System.out.println(convertStringToInteger1(null));           //null can not convert to Integer

        System.out.println(convertStringToInteger2("123")+ 1);       //124 to be sure it is converted to integer
        System.out.println(convertStringToInteger2("1ab")+ 1);       //1ab can not convert to Integer
        System.out.println(convertStringToInteger2(null));           //null can not convert to Integer

    }

    //Example 1: Create a method to get a character form a String by using index
    public static char getCharFromStringByIndex(String str, int idx){

        try {
            return str.charAt(idx);
        } catch (StringIndexOutOfBoundsException e) {  //StringIndexOutOfBoundsException is thrown if non-existing index was used
            System.out.println(idx  + " does not exist as index...");
            return ' ';         //that type will be writing according to requirements
        }
    }


    //Example 2: Create a method to get the number of characters in a String
    public static int getNumberOfCharsInString(String str){

        try {
            return str.length();
        } catch (NullPointerException e){   //NullPointerException is thrown if "null" was used with some methods in String class
            System.out.println("This method can not be used with null");
            return 0;
        }
    }


    public static boolean stringContains(String str){

        try {
            return str.contains("a");
        } catch (NullPointerException e){   //NullPointerException is thrown if "null" was used with some methods in String class
            System.out.println("This method can not be used with null");
            return true;
        }
    }



    //Example 3: Create a method to convert a String to an Integer
    //1.way
    public static int convertStringToInteger1(String str){

        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e){      //NumberFormatException is thrown if String in valueOf() has non-digit characters
            System.out.println("Do not use non-digit characters in value of method");
            return 0;   //it changes with requirements, with question
        }
    }


    //2.way
    public static int convertStringToInteger2(String str){

        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e){      //NumberFormatException is thrown if String in valueOf() has non-digit characters
            System.out.println("Do not use non-digit characters in value of method");
            return 0;   //it changes with requirements, with question
        }
    }
}
