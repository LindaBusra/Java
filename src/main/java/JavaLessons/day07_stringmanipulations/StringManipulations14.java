package JavaLessons.day07_stringmanipulations;

import java.util.Scanner;

public class StringManipulations14 {


    public static void main(String[] args) {



//in java we have to different ways to concatenate the two different string Together

        String mySentence = "Rock";
        String mySentence1 = "Star";

        String result = mySentence.concat(mySentence1);

        System.out.println(result);

//indexOf, CharAt
        System.out.println(result.charAt(5));
        System.out.println(result.indexOf('R'));

//contain
        System.out.println(result.contains("kStar"));

//replace All
        System.out.println(result.replaceAll("Rock", "Rockssss"));

        System.out.println(result.replace("R", "r"));





//Question-1 Write a program to assign a value of 100.235 to a double variable
//and then convert it to int. Print it on the console.


        double d=100.235;
        int n = (int)d;
        System.out.println(n);




//Question-2 Ask user to enter two integer values. Write a Java Program to swap
//two numbers by using the third variable.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integer values");
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        System.out.println("Before swap n1:" + n1 + " n2:" + n2);
        int temp=0;
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("After swap n1:" + n1 + " n2:" + n2);

    }
}