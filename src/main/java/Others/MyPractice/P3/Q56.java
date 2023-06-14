package Others.MyPractice.P3;

import java.util.Scanner;

public class Q56 {

    public static void main(String[] args) {


        //Get a String from the user and print just vowels(aeiou) inside the String on the console
        //by using for loop, while or other third way :)



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string please");
        String text =scan.next().toLowerCase();
        String temp ="";


        //1.way
        String s = text.replaceAll("[^aeiou]", "");
        System.out.println(s);



        //2.way
        for(int i=0; i<text.length(); i++) {

            boolean isVowel = text.charAt(i)=='a' || text.charAt(i)=='e' || text.charAt(i)=='i' ||
                        text.charAt(i)=='o' || text.charAt(i)=='u';

            if(isVowel){

                System.out.print(text.charAt(i));


            }
            }



        //3.way :
        int i = 0;
        while (i< text.length()) {
            char c = text.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.print(c);
            }
            i++;
        }
        System.out.println();






    }
}
