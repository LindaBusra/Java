package Batch159.day10_forloops;

public class ForLoops02 {

    public static void main(String[] args) {

        //Example 1: Put "*" between 2 consecutive characters and to the end in a String.
        //For example; Java ==> J*a*v*a*


        String str = "Java";

        for(int i=0; i<str.length(); i++) {

            System.out.print(str.charAt(i) + "*");
        }
        System.out.println("\n");




        //Example 2: Type code to print unique characters in a String. Hello ==> Heo
        String text = "Hello";

        for(int i=0; i<text.length(); i++) {

            char ch= text.charAt(i);

            if(text.indexOf(ch)==text.lastIndexOf(ch)) {
                System.out.print(ch);
            }
        }
        System.out.println("\n");




        //Example 3: Type code to reverse a String
        //           For Example: Tom ==> moT

        String st = "Emily";
        String rev = "";


        for(int i=st.length()-1; i>=0; i--) {

            rev = rev + st.charAt(i);
        }

        System.out.println(rev);

    }
}
