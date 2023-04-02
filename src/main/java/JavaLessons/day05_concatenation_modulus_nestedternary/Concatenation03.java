package JavaLessons.day05_concatenation_modulus_nestedternary;

import java.util.StringJoiner;

public class Concatenation03 {

    public static void main(String[] args) {



        //String concatenation using StringJoiner class
        StringJoiner g = new StringJoiner(", ");   //StringeJoiner object
        g.add("Hello");    //String 1
        g.add("World");    //String 2

        System.out.println(g.toString());  //Displays result




        //Adding values to StringJoiner
        StringJoiner joinNames = new StringJoiner(", ");
        joinNames.add("Emily");
        joinNames.add("Smith");
        joinNames.add("Michael");

        System.out.println(joinNames);




        //Java StringJoiner Example: adding prefix and suffix
        StringJoiner joinName = new StringJoiner(", ", "[", "]");   // passing comma(,) and square-brackets as delimiter
        joinName.add("Emily");
        joinName.add("Amalie");
        joinName.add("Jan");
        joinName.add("Karl");
        System.out.println(joinName);




        //StringJoiner Example: Merge Two StringJoiner

        StringJoiner joinNames1 = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames1.add("Aila");
        joinNames1.add("Emil");

        // Creating StringJoiner with :(colon) delimiter
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames2.add("Peter");
        joinNames2.add("Heidi");

        // Merging two StringJoiner
        StringJoiner merge = joinNames1.merge(joinNames2);
        System.out.println(merge);
    }
}
