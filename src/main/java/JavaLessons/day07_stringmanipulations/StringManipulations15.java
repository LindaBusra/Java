package JavaLessons.day07_stringmanipulations;

public class StringManipulations15 {


    public static void main(String[] args) {



/*
Type code to check if a password is valid or not for the following conditions;
Password must have at least 8 characters different from space character
Password must have at least 1 symbol
 */


        String pwd = "a1 !2  s def ";

        //Password must have  at least 8 characters different from space character
        boolean firstRule = pwd.replaceAll("\\s", "").length()>7;

        //Password must have at least 1 symbol

//  boolean secondRule = pwd.replaceAll("\\s", "").replaceAll("[a-zA-Z0-9]","").length()>0;


        //following can be used to remove space as well, but it is difficult
        //to notice space was removed, because of that above is better to use

        boolean secondRule = pwd.replaceAll("[^a-zA-Z0-9 ]", "" ).length()>0;

        System.out.println("Is the password valid? " + (firstRule && secondRule));



 //-------------------------------------------------------------------------------------------



/*
       String shirtPrice= "$ 12.99";
       String bookPrice= "$ 35.99";

       Type a code to find the sum of the shirt and book prices.

*/

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String sP = shirtPrice.replace("$","");
        String bP = bookPrice.replace("$","");
        double x = Double.valueOf(sP);
        double y = Double.valueOf(bP);
        System.out.println("Total price is " + (x+y));


/* How can I convert String to Double?
We should use Double wrapper class and put dot.
We can convert Strings to double (or integer) values because it is not possible
to operate math operations with Strings

 */










    }
}

