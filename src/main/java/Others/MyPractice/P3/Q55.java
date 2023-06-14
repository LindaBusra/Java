package Others.MyPractice.P3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q55 {

    public static void main(String[] args) {


/*
            Ask user to enter a number and then check
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
    */


            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number please");
            String number =scan.next();

            System.out.println("Which number dou you check?");
            String find = scan.next();

            int count = 0;

            String num [] = number.split("");

            for(int i=0; i<num.length; i++) {

                if(num[i].equals(find)) {
                    count++;
                }
            }

        System.out.println("There is " + count + " times " + "\"" + find + "\" in this number");







    }
}
