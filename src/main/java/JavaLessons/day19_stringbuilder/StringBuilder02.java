package JavaLessons.day19_stringbuilder;


public class StringBuilder02 {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Mississippi");   //length 7 , capasity =16

        //toString() method is used to change StringBuilders to Strings
//      sb1.toString();

        String test = sb1.toString();   //
        System.out.println(test);

        //reverse() is used to reverse a String
        //If you get a question like "How to reverse a String, tell them;
        // 1-I can reverse a String by using reverse() method from StringBuilder class
        // 2-I can reverse a String by using loops  -->Interviewer will tell you use the loops
        StringBuilder revSb1 = sb1.reverse();
        System.out.println(revSb1);     //ippississiM

        //deleteChartAt() is used to delete a character at a specific index

        sb1.deleteCharAt(0);
        System.out.println(sb1);        //ppississiM

        //unbold ones don't change original value.
        //When you use a method for StringBuilders, if it is  bold
        // "not coming from String Class" it changes the original value

        //delete(starting index, ending index) is used to delete  characters from "starting index" to "ending index"
        //starting index is inclusive, ending index is exclusive

        sb1.delete(2,5);        //(1. index inclusive, 2. er exclusive)
        System.out.println(sb1);        //ppissiM


        //replace(starting index, ending index, new value) is used to change characters from starting index to ending index to a new value
        sb1.replace(2,4, "IS");     //ppISsiM
        System.out.println(sb1);


        //insert(number of characters from the beginning, new value) method will insert new value after skipping number of characters from the beginning
        sb1.insert(3,"XXX");    //offset:skip the first 3 character
        System.out.println();   //ppIXXXSsiM









    }
}
