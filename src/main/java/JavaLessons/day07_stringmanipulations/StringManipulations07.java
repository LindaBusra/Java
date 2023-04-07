package JavaLessons.day07_stringmanipulations;

public class StringManipulations07 {
    public static void main(String[] args) {



        String str = "Java is easy, Java is OOP.";

        //Replace first changes just the first one

        System.out.println(str.replaceFirst("Java", "Apex"));

        //Replace changes everyone

        System.out.println(str.replace("Java", "Apex"));



//------------------------------------------------------------------------------------------------------------



 /*   String shirtPrice = ‘$12.99’;
      String bookPrice = ‘$35.99’;
      Type code to find the sum of the shirt and book prices.
  */
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String shirt = shirtPrice.replace("$", "");
        String book = bookPrice.replace("$", "");

        //valueOf() method converst Strings data type to numeric data type
        //Note:To be able to use valueOf() method, String must be in numeric format
        double sP = Double.valueOf(shirt);
        double bP = Double.valueOf(book);

        System.out.println("The sum of the shirt and book prices: " + (sP + bP));





    }
}
