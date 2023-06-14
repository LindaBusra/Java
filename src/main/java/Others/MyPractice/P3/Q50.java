package Others.MyPractice.P3;

import java.util.Scanner;

public class Q50 {

    public static void main(String[] args) {


        // 5)Create a method to count all characters different from space in a string
        // get the string from user

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = scan .nextLine();

        System.out.println("The number of Characters in the string is " + numOfChar(s));

    }
    public static int numOfChar(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
    }

