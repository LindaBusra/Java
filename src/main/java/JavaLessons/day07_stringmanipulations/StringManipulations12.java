package JavaLessons.day07_stringmanipulations;

public class StringManipulations12 {
    public static void main(String[] args) {




 //------------------isEmpty()-----------------------------------------------------------


String str = "String is a non-primitive data type in Java";

        /* isEmpty() method returns true if the String does not any character,
        returns false if the String has any character
        str.length()==0 and isEmpty() have some meaning but to check if a String is empty
        using isEmpty() is preferable.  */


        boolean result1 = str.isEmpty();
        System.out.println(result1);        // false
        System.out.println(" ".isEmpty());  //false



//------------------isBlank()---------------------------------------------------------------



        boolean result2 = str.isBlank();    //isEmpty("")==>true,   isEmpty(" ")==>false
                                            //isBlank("")==>true,   isBlank(" ")==>true
        System.out.println(result2);        //true




//Example 1:Check if a String has just letters and space in it.

        String s = "Learn Java earn money!";

        boolean result3 = s.replaceAll("[a-zA-Z ]", "").isEmpty();   //change letters and space with ""

        if(result3) {
            System.out.println("String has just letters and space in it.");
        } else {
            System.out.println("String has not just letters and space in it.");
        }

        System.out.println(result3);    //false



//----------------------------------------------------------------------------------------------------



/*Example 2:Check SSN for the following rules
1-it must have just digits
2-it must have 9 digits
 */

        String ssn = "12A545678";


        Boolean rule1 = ssn.replaceAll("[0-9]", "").isEmpty();
        Boolean rule2 = ssn.length()==9;

        System.out.println(rule1 && rule2 ?  "Valid ssn" : "Invalid ssn");








    }
}
