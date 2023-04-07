package JavaLessons.day07_stringmanipulations;

public class StringManipulations09 {

    public static void main(String[] args) {




/*Example 1- Check if the given password

i)has 'A' in any position
ii)has "xy" at the beginning
iii) has "W" as 7th characater
iv)has 8 characters in total


*/

        String psw = "xy1AmSW?";

        if(psw.contains("A") && (psw.startsWith("xy")) &&
                (psw.startsWith("W",6)) && psw.length()==8) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

//or

        String pwd = "xy1AmSW?";

//i) has "A" in any position
        boolean firstRule = pwd.contains("A");

//ii) has "xy" at yhe beginning
        boolean secondRule = pwd.startsWith("xy");

//iii) has "W" as 7th character
        boolean thirdRule = pwd.startsWith("W", 6);

//iv) has 8 characters in total
        boolean fourthRule = pwd.length()==8;

        System.out.println("Is the password vaild? " + (firstRule && secondRule && thirdRule && fourthRule));



        //or

        Boolean rule1= psw.indexOf('A') != -1;
        Boolean rule2 = psw.startsWith("xy");
        Boolean rule3 = psw.indexOf("W")==6 ?  true : false;
        Boolean rule4 = psw.length()==8;

        Boolean result =rule1 && rule2 && rule3 && rule4;
        System.out.println(result);


    }
}
