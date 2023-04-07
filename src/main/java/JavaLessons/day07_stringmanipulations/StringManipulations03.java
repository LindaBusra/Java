package JavaLessons.day07_stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {



        /*
        Strings are non-primitive, non-primitive have values and methods in them
        1) equals() method compares two Strings by not ignoring cases.
            "Tom".equals("tom"); --> false
            equals() method returns  "boolean"
        2) equalsIgnoreCase() method compares two Strings by ignoring cases.
            "Tom".equalsIgnoreCase("tom"); --> false
            equalsIgnoreCase() method returns  "boolean"
        3) toLowerCase() method converts all characters in a String to lower cases.
            "August".toLowerCase();-->august
            toLowerCase() method returns String
        4) toUpperCase() method converts all characters in a String to upper cases.
            "August".toUpperCase();-->AUGUST
            toUpperCase() method returns String
        5) CHARaT() methods gives you a character in the String by using index
            "Java is my love".charAt(2); -->v
            "Java is my love".charAt(6); -->s
            charAt() method returns char
        6) length() method returns the number of characters in a String
            "Learn Java earn money".length(); --->21
            length() method returns integer

         */


//-------------------------------------------------------------------------------------------------------------------



//Count the alphabetical characters in a given Strings



        String str = "    Tom12  Hanks!.... Hello   ";


        String str2 = str.replaceAll("[^A-Za-z]", "");
        int length = str.replaceAll("[^A-Za-z]", "").length();

        String str3 = str.replaceAll("[^A-Za-z0-9]", "");
        String str4 = str.replaceAll("[A-Za-z]", "");


        //^ other than
        System.out.println(str);
        System.out.println(str2);
        System.out.println(length);
        System.out.println(str3);
        System.out.println(str4);


//if your cod gives you correct output for some data but if it is not giving you
// correct output for some other data this is called "hard coding".  It is not acceptable.
//If your cod works for all data it is called "Dynamic coding"



//--------------------------------------------------------------------------------------------------------------------



//Type a code to find the sum of the shirt and book prices.

        String shirtPrice = "$ 12.99";
        String bookPrice = "$ 35.99";

        String shirt = shirtPrice.replace("$ ", "");    //12.99
        String book = bookPrice.replace("$ ", "");      //35.99

//How can I convert String to "Double"?? I should use Double wrapper class and put dot.
//We can convert strings to double numeric values because it is not possible to operate math
//operations with strings.

        double forShirt = Double.valueOf(shirt) ;
        double forBook = Double.valueOf(book);

        System.out.println(forShirt + forBook);  //48.98












    }
}
