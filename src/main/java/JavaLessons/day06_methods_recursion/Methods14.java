package JavaLessons.day06_methods_recursion;

import java.util.Arrays;

public class Methods14 {

    public static void main(String[] args) {




 /* Create a method accepts a name as parameter and prints the name to the console

 Input : John  Output : [J, o, h, n] */


        forCharArray("John");

        System.out.println();




 /* Create a method accepts a name as parameter and prints the name as a char array
(do not use toCharArray() method)   Input : John  Output : [J, o, h, n] */

        stringToCharArray("John");


        getNameAsAChar("John");

    }


    static void forCharArray(String name) {

        char[] ch = name.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);

        }
    }


    static void stringToCharArray(String name) {

        String ch[] = name.split("");
        System.out.println(Arrays.toString(ch));
    }



    public static void getNameAsAChar(String name){
        char c[]=new char[name.length()];
        int j=0;
        for(int i=0;i<name.length();i++){
            c[j]=name.charAt(i);
            j++;
        }
        System.out.println(Arrays.toString(c));
    }


}