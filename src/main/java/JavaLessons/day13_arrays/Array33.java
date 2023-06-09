package JavaLessons.day13_arrays;

import java.util.Scanner;

public class Array33 {

    public static void main(String[] args) {



//1)Get string from user and type code to find the number of words in a String.
//2)Count how many words starts with "a".(Make code case-sensitive)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String text =  scan.nextLine();

        String str[] = text.toLowerCase().split(" ");

        String ch = "a";
        int numWord = str.length;
        int count=0;

        for(String w: str) {
            if (w.substring(0, 1).equals(ch)) {
                count++;
            }
        }
        System.out.println(count + " words start with  " + ch);



//---------------------------------------------------------------------------------



//Find number of specific character in a String


        String s = "Java, I like Java?";

        System.out.println("The number of the character: " + (s.split("a").length-1));

        System.out.println(s.length()-s.replaceAll("a", "").length());



        String arr[] = s.split("");
        int counter = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i].equals("a")) {
                counter++;
            }
        }
        System.out.println("The number of the character: " + counter);
    }
}
