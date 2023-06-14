package Others.MyPractice.P2;

import java.util.Scanner;

public class Q42 {

    public static void main(String[] args) {

/*
 * Get a sentence and a letter from the user, Find how many times the letter finds  in the sentence and print it
 * find used and print

 * SAMPLE:
 * INPUT : Sentence: It's great to learn Java. letter :e
 * OUTPUT : The letter "e" is used 2 times in the sentence you entered.

 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string please");
        String str = scan.nextLine();
        System.out.println("Enter a character you want to get");
        char ch = scan.next().charAt(0);

        char arr[] = str.toCharArray();
        int count = 0;


        for(char w: arr) {

            if(w == ch) {
                count++;
            }
        }

        System.out.println("The letter \"e\" is used " + count + " times in the sentence you entered.");

    }
}
