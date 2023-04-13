package Others.InterviewQuestions;

import java.util.Scanner;

public class IntQ02 {

    //Write a Java Program to swap two numbers

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integer numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();

        //Do not use 3rd variable
        a = a + b;
        b = a - b;
        a = a -b ;

        System.out.println(a + " - " + b);


        //Use 3rd variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " - " + b);



    }




}
