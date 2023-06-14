package Others.MyPractice.P4;

import java.util.Scanner;

public class Q76 {
    public static void main(String[] args) {


      /*  AtbashCode ; It is a simple method based on the Hebrew alphabet to encrypt or decrypt a text.
       The first letter of the alphabet is used instead of the last letter.
      "abcdefghijklmnopqrstuvwxyz"; 26 character
      "zyxwvutsrqponmlkjihgfedcba";       */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your text");
        String str = scan.nextLine().toLowerCase();



        //1.way

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String useThis =   "zyxwvutsrqponmlkjihgfedcba";



            for(int j=0; j<str.length(); j++) {


                System.out.print(useThis.charAt(alphabet.indexOf(str.charAt(j))));
        }
        System.out.println();





        //2.way


        for (int i = 0; i < str.length(); i++) {

            int index = 'z' - str.charAt(i);
            System.out.print((char) (('a') + index));

        }


    }

}




