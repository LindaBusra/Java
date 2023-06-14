package Others.MyPractice.P3;


import java.util.Scanner;

public class Q60 {


    public static void main(String[] args) {


// Question 1- Write a code tp reverse a string.


            String str = "All is well";

            String temp = "";

            for(int i=str.length()-1; i>=0; i--) {

                temp += str.charAt(i);
            }

        System.out.println(temp);





 /* Question 2- Ask the user to enter a name and character, then check how many times the character is repeated.
             char ch= 'e' ;
             String name ="Lovely"
             => Number of Repetitions = 3
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name please");
        String name = scan.nextLine();
        System.out.println("Enter a character please");
        char ch = scan.next().charAt(0);

        int count = 0;

        for(int i=0; i<name.length(); i++) {

           if(name.charAt(i)==ch) {

               count++;
           }
        }

        System.out.println("\""+ ch + "\" is existing " + count + " in this name");


    }

}
