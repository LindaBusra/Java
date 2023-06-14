package Others.MyPractice.P1;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {


//Question-1-Write a Java Program to reverse a string.

    String a = "Java is easy";
    String temp = "";

    for(int i=a.length()-1; i>=0; i-- ){

        temp += a.charAt(i);
    }

   System.out.println("reverse of string is: " + temp);


   //2.way
   StringBuilder ss = new StringBuilder();
   ss.append(a);

        System.out.println(ss.reverse());

//----------------------------------------------------------------------------------------------------------------------


//Question-2-Write a Java Program to swap two numbers

        int x = 5;
        int y = 4;

        System.out.println("Before svap X=" + x + ", and y=" + y);

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After svap X=" + x + ", and y=" + y);


//----------------------------------------------------------------------------------------------------------------------


//Question-3-//Ask to user how many fibonacci numbers want to see and write a Java Program to print them..  1,1,2,3,5,8,...

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many fibonacci numbers do you want to see");
//        int num = scanner.nextInt();
//
//        int fibonacci = 0;
//        int f1 = 1;
//        int f2 = 1;
//
//        System.out.print(f1 + " " + f2 + " ");
//
//        for(int i=1; i<=num; i++) {
//
//            fibonacci = f1 + f2;
//            f1 = f2;
//            f2 =  fibonacci;
//
//            System.out.print(fibonacci + " ");
//
//        }


//----------------------------------------------------------------------------------------------------------------------



//Question-3-//Ask to user Enter a positive integer and check if it is prime or not
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer to check if it is prime or not");
        int num = scan.nextInt();

//        int count = 0;
//
//
//        for(int i=1; i<num; i++) {
//
//            if(num%1==0) {
//                count++;
//            }
//
//        }
//
//        if(count>0) {
//            System.out.println("The number is prime");
//        } else {
//            System.out.println("The number is not prime");
//        }



    }
}
