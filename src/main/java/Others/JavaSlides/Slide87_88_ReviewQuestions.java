package Others.JavaSlides;

import java.util.Scanner;

public class Slide87_88_ReviewQuestions {
    public static void main(String[] args) {

// 1-Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
//If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same
//and print it on the console

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int num = scan.nextInt();
//
//        if(num<10) {
//            System.out.println("its square: " + num*num);
//        } else if (num>10) {
//            System.out.println("result is: " + num*2);
//        } else {
//            System.out.println("num");
//        }

//-----------------------------------------------------------------------------------------------------------------

// 2-Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.”
//if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
//“This name contains neither ‘a’ nor ‘z’.”


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your kids name");   //zehra girmesi duurmu icin satir ekledim
//        String name = scan.nextLine();
//
//        if (name.contains("a") && name.contains("z")) {
//            System.out.println("This name contains ‘a’ and 'z.");
//        } else if(name.contains("a")) {
//            System.out.println("This name contains ‘a’.");
//        } else if (name.contains("z")) {
//            System.out.println("This name contains ‘z’.");
//        } else {
//            System.out.println("This name contains neither ‘a’ nor ‘z’");
//        }

//---------------------------------------------------------------------------------------------------

// 3-Ask user to enter a letter, if it is uppercase check it is before “F” or not in alphabetical order.
//If it is before “F” in alphabetical order output will be “ Big before F”, otherwise output will be
//“Big after F.” If it is lowercase check it is before “h” or not in alphabetical order.
//If it is before “h” in alphabetical order output will be “Small before h”, otherwise “Small after h”

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a letter");
//        char firstLetter = scan.next().charAt(0);    //a
//        int letter = firstLetter;
//
//        if(letter>=65 && letter<=90) {
//            if (letter < 70) {
//                System.out.println("Big before F");
//            } else {
//                System.out.println("Big after F");
//            }
//        } else if (letter >= 97 && letter <= 122) {
//                if (letter < 104) {
//                    System.out.println("Small before h");
//                } else {
//                    System.out.println("Small after h");
//                }
//        } else {
//            System.out.println("It is not a letter");
//        }

//----------------------------------------------------------------------------------------------------------------

//  4-Ask user ta enter his/her first and last name. If the first name is longer
//output will be “First name is longer.” If the length of last name is equal
//To the length of last name output will be “First name and last name
//have same length.” Otherwise, output will be “Last name is longer”


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your first name");
//        String fName = scan.nextLine();
//        System.out.println("Enter your last name");
//        String lName = scan.nextLine();
//
//        if(fName.length() > lName.length()) {
//            System.out.println("First name is longer.");
//        } else if (fName.length() == lName.length()) {
//            System.out.println("First name and last name have same length.");
//        } else {
//            System.out.println("Last name is longer");
//        }

//--------------------------------------------------------------------------------

// 5-Ask user to enter a word which has 4 letters and output will be inverse of the word.
//For example; if user enters “MARK” output will be “KRAM”

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a word which has 4 letters");
//        String word = scan.nextLine();
//
//        System.out.println( word.charAt(3) + "" + word.charAt(2) + "" +     //1.yol
//                word.charAt(1) + "" +  word.charAt(0) );
//
//        System.out.println( word.substring(3,4) + word.substring(2,3) +     //2.yol
//                word.substring(1,2) + word.substring(0,1) );


         // Javada Stringi/kelimeyi tersine cevirmek                            //3.yol

//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter a word");
//        String wordBefore = scan.nextLine();
//        String spare = "";
//
//        for (int i=wordBefore.length()-1; i>=0;  i--) {
//           spare = spare + wordBefore.charAt(i);
//
//        }
//        System.out.println(spare);


//-------------------------------------------------------------------------------------------------------

// 6- Ask user to enter a String and output will be the number of the characters in the String.

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a string");
//        String text = scan.nextLine();
//
//        System.out.println("the number of the characters in the String is " + text.length());

//-------------------------------------------------------------------------------------------------------

// 7) Ask user to enter a String and output will be the number of the characters in the String.
//Ask user to enter password, if the password is okay for the following conditions output will be
//“Your password is created successfully.” If the password is not okay for any of the following conditions
//Output will be “Enter a new password according to the give conditions”
//1.First letter must be uppercase
//2.Last letter must be lowercase
//3.Password must contain 6 characters


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a password");
//        String password = scan.nextLine();
//        int firstLetter= password.charAt(0);
//
//        int last = password.length()-1;
//        int lastLetter= password.charAt(last);
//
//if ((firstLetter>65 && firstLetter<=90) && (lastLetter>=97 && lastLetter<=122) && (password.length()==6)) {
//
//                System.out.println("Your password is created successfully.");
//} else {
//    System.out.println("Enter a new password according to the give conditions");
//}



//-------------------------------------------------------------------------------------------------------

// 8- Ask user ta enter his/her first name, last name and Social Security Number.
//Then type a program which makes
//a) initials of the first name and the last name in uppercase,
//other characters will be in lowercase.
//b) all characters except last 4 characters of the Social Security Number “ * ”.
// For example; Suleyman Alptekin *****5678

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String fName = scan.nextLine();
        System.out.println("Enter your last name");
        String lName = scan.nextLine();
        System.out.println("Enter your Social Security Number");
        String ssn = scan.nextLine();

        String firsNamePart1 = fName.substring(0,1).toUpperCase();
        String firsNamePart2 = fName.toLowerCase().substring(1);

        String lastNamePart1 = lName.substring(0,1).toUpperCase();
        String lastNamePart2 = lName.toLowerCase().substring(1);

        String newSsn = ssn.substring(0, 5).replaceAll("[0-9]", "*") + ssn.substring(5);
//      String newSsn = "*****" + ssn.substring(5);     //bu da olabilir belki

        System.out.println(firsNamePart1 + firsNamePart2 + " " + lastNamePart1 + lastNamePart2 + " " + newSsn);



//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your first name");
//        String fName = scan.nextLine();
//        System.out.println("Enter your last name");
//        String lName = scan.nextLine();
//        System.out.println("Enter your Social Security Number");
//        String ssn = scan.nextLine();
//
//        String name1 = fName.substring(0,1).toUpperCase();
//        String name2 = fName.toLowerCase().substring(1);
//
//        String name3 = lName.substring(0,1).toUpperCase();
//        String name4 = lName.toLowerCase().substring(1);
//
//        System.out.println(name1+name2 + " " + name3+name4 + " " + ssn);




    }
}
