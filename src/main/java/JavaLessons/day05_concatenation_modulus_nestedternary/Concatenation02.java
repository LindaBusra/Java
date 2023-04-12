package JavaLessons.day05_concatenation_modulus_nestedternary;

import java.util.StringJoiner;

public class Concatenation02 {

    public static void main(String[] args) {


        String s=50+30+"Einar"+40+40;
        System.out.println(s);      //80Einar4040


        String s1="Ole & ";
        String s2="Carina";
        String s3=s1.concat(s2);
        System.out.println(s3); // Ole & Carina


        //String concatenation using StringBuilder class
        StringBuilder a = new StringBuilder("Welcome");    //String 1
        StringBuilder b = new StringBuilder(" our house");    //String 2
        StringBuilder c = a.append(b);   //String 3 to store the result
        System.out.println(c.toString());  //Displays result

        //In the above code snippet, s1, s2 and s are declared as objects of StringBuilder class.
        // s stores the result of concatenation of s1 and s2 using append() method.



        //String concatenation using String.join() method
        String d = new String("Hello");    //String 1
        String e = new String(" again");    //String 2
        String f = String.join("",d,e);   //String 3 to store the result
        System.out.println(f.toString());



        String m1 = new String("You");
        String m2 = new String("are");
        String m3 = new String("the");
        String m4 = new String("best");
        String str = String.join("* ", m1, m2, m3, m4);
        System.out.println(str.toString());





    }
}
