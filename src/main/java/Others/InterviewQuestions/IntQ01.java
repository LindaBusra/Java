package Others.InterviewQuestions;

import java.util.Scanner;

public class IntQ01 {

    //Write a Java Program to reverse a string

    public static void main(String[] args) {

        System.out.println("Enter a string to reverse:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        //1.way By using String

        for(int i=str.length()-1; i>=0; i--) {

            System.out.print(str.charAt(i));
        }

        System.out.println("\n");

        //2.way By using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        System.out.println("\n");

        //By using method
        reverse(str);

    }

    public static void reverse(String word){

        for(int i=word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
