package Others.MyPractice.P4;

import java.util.Arrays;
import java.util.TreeSet;

public class Q84 {

    public static void main(String[] args) {



        //Example 1: Type code to print repeated character in a String
        //"HelloEveryone" ==> l


        String str = "HelloEveryone";
        String temp = "";


        for(int i=0; i<str.length(); i++){

            char ch =str.charAt(i);

            if(str.indexOf(ch)!=str.lastIndexOf(ch)) {

                if(!temp.contains(str.substring(i,i+1))) {
                    temp += str.substring(i, i + 1);
                }
                }
        }

        System.out.println("The repeated characters :" + temp);



//---------------------------------------------------------------------------------------------



        //Example 2: Type code to print unique character in a String
        //"HelloEveryone" ==> l


        String text = "HelloEveryone";
        String tp = "";


        for(int i=0; i<text.length(); i++){

            char ch =text.charAt(i);

            if(text.indexOf(ch)==text.lastIndexOf(ch)) {

                    tp += text.substring(i, i + 1);
                }
            }


        System.out.println("The unique characters :" +tp);

    }
}