package JavaLessons.day05_concatenation_modulus_nestedternary;

public class NestedTernary09 {
    public static void main(String[] args) {




       /* Type code to check the password
        if it has more than 8 characters, initial should be'i'
        if it has no more than 8 characters, inital should be 'K' (and last character should be '!')
        Solve th e task by using nested ternary
         */
        //length() method returns the number of characters in a String

        String pwd = "izmir538";

        String result = (pwd.length() > 8) ? (pwd.charAt(0) == 'i' ? "Valid password" : "Invalid password") : (pwd.charAt(0) == 'K' ? "Valid password" : "Invalid password");
        System.out.println(result);



        //-----------------------------------------------------------------------



        String text = "English";

        String check =  text.equalsIgnoreCase("english") ? "The lesson is English" : "The lesson is Norwegian";

        System.out.println(check);
    }
}
