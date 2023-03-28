package JavaLessons.day04_nestedif_switch;

import java.util.Scanner;

public class Switch07 {
    public static void main(String[] args) {



        //Ask user to enter a character, if it is vowel print "Vowel." And if it not vowel print "
        //It is not vowel.  a-e-i-o-u


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scan.next().toLowerCase().charAt(0);

        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("This is a vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("It is not vowel");
                break;
            default:
                System.out.println("Enter a letter not the other characters");
        }










    }
}
