package JavaLessons.day05_concatenation_modulus_nestedternary;

public class NestedTernary08 {

    public static void main(String[] args) {



//      Examples for NestedIf

        int time = 20;
        String result;
        result = (time < 18) ? "Good afternoon." : "Good evening.";
        System.out.println(result);


//-----------------------------------------------------------------------------------


        String name = "Einar";
        String console = (name.equalsIgnoreCase("Einar")) ? "You are welcome" : "I don't know who you are";
        System.out.println(console);



//-----------------------------------------------------------------------



//If statement: W sometimes need to execute some codes under some specific conditions.

        int k = 15;

        String result1 = (k%4 == 0 ) ? "The number is divisible by 4" : "The number is not divisible by 4";
        System.out.println(result1);





    }
}
