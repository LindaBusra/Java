package Batch159.day22_stringbuilder_stringbuffer;

public class StringBuffer01 {

    public static void main(String[] args) {

            /*
        1)StringBuffer is a class in Java, it gives us String
        2)StringBuffer is "mutable" like StringBuilder
        3)StringBuffer is "thread-safe" and "synchronized" but StringBuilder neither "thread-safe" nor "synchronized"
                //doing multi tasks at the same time, java uses this for to save time, StringBuffer is a form to use that kind of multi tasks
        4)StringBuffer was created in Java-5, StringBuilder was created after StringBuffer
        5)StringBuilder has fewer features than StringBuffer that is  why it works faster than StringBuffer

        If you need String, you have 3 options in Java
        a)String Class: It gives you "immutable" Strings
        b)StringBuilder: It gives you "mutable", "non-thread-safe", "non-synchronized" Strings
        c)StringBuffer: It gives you "mutable", "thread-safe", "synchronized" Strings
     */

        //If the Strings are completely same compareTo() method returns zero
        StringBuffer sbf1 = new StringBuffer("Python");
        StringBuffer sbf2 = new StringBuffer("Python");

        int compare = sbf1.compareTo(sbf2);
        System.out.println(compare);        //0



        //If the first String comes after the second String the result is positive
        StringBuffer sbf3 = new StringBuffer("Sython");         // P Q R S  -->3
        StringBuffer sbf4 = new StringBuffer("Python");

        int compare2 = sbf3.compareTo(sbf4);
        System.out.println(compare2);        //3



        //If the first String comes before the second String the result is negative
        StringBuffer sbf5 = new StringBuffer("Python");
        StringBuffer sbf6 = new StringBuffer("Sython");

        int compare3 = sbf5.compareTo(sbf6);
        System.out.println(compare3);        //-3


        //Comparing of lowercase and uppercase
        StringBuffer sbf7 = new StringBuffer("Python");
        StringBuffer sbf8 = new StringBuffer("python");

        int compare4 = sbf7.compareTo(sbf8);
        System.out.println(compare4);        //-32
        //ASCII value of 'A'-->65,   'a'-->97    for every letter is same = 65-97 = -32 (if we compare uppercase with lower case)


        //go to that index, and change it
        sbf1.setCharAt(2, 'T');
        System.out.println(sbf1);           //PyThon


        //
        CharSequence r2 = sbf1.subSequence(1,4);
        System.out.println(r2);     //if you click and see the body of the method from java documentation, you can see it is the same with substring(start,end)


    }
}
