package JavaLessons.day19_stringbuilder;

public class StringBuilder04 {

    public static void main(String[] args) {


 /*
           The value 0 if this StringBuilder contains the same character sequence as that of the argument StringBuilder;
           a negative integer if the first StringBuilder is lexicographically less than the second StringBuilder argument;
           a positive integer if the first StringBuilder is lexicographically greater than the second StringBuilder argument.

           Note: compareTo() method does not ignore cases, it checks alphabetical order by using ASCII Values.
*/


        StringBuilder sb2 = new StringBuilder("Java is love");
        StringBuilder sb3 = new StringBuilder("Lava is love");
        StringBuilder sb4 = new StringBuilder("java is love");

        int result = sb2.compareTo(sb3);        //-2        //first one comes first.(before the second one)
        System.out.println(result);

        int result1 = sb2.compareTo(sb4);       //-32
        System.out.println(result1);

        int result2 = sb3.compareTo(sb2);       //2         ///first one comes after the second one
        System.out.println(result2);


        //if the first one comes before the second one the result will be negative
        //if the first one comes after the second one the result will be positive

        //setCharAt(index, new char value) is used to update a specific character at a specific index
        sb3.setCharAt(8,'m');
        System.out.println(sb3);            //Java is move


        /*

        1-Mechanism behind the "immutability"
        2-Benefits of immutability
        3-Difference between "immutability" and "mutability"
        4-Features of the StringBuilder
         */

        // !!! If a method comes from String class (for example substring) it will be inmutable, it means it can not update StringBuilder
        //it is not accepted assigment    sb5 = sb5.substring(3);


        StringBuilder sb5 = new StringBuilder("Ali Can");
        // sb5 = sb5.substring(3);     it is not accepted.
        System.out.println(sb5);

        //       String newString = sb5.substring(4);
//        System.out.println(newString);


//-------------------------------------------------------------------------------------------

        //Can we convert Stringbuilder to String-->yes, by using toString()
        String stringFromStringBuilder = sb5.toString();      //now we can se many methods, equals, contains, lastIndexOf...


        //We convert string to StringBuilder by using StringBuilder constructor
        StringBuilder stringFromString = new StringBuilder(stringFromStringBuilder);



    }
}
