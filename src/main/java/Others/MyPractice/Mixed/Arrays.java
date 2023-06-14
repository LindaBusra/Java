package Others.MyPractice.Mixed;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {


//Question 1)Type the code to print number by increasing 3 starting from 10 up to 61
//61 will be included

//        int start=10;
//        int finish = 62;
//
//        for(int i=start; i<finish; i+=3) {
//
//            System.out.print(i+" ");
//
//        }


//----------------------------------------------------------------------------------------


//Question 2- Type code to print to reverse a String
//   i)by using loop
//   ii)by using a method from StringBuilder Class
//
//  String str = "Tom Hanks";  ==> "sknaH moT"


        String str = "Tom Hanks";

        for(int i=str.length()-1; i>=0; i--) {

            System.out.print(str.charAt(i));
        }

        String a = "Tom Hanks";
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        System.out.println(b);


//----------------------------------------------------------------------------------------


//Type code to find the sum of the digits of an Integer by using loop
// int n = -3558;   ==> 3+5+5+8=21

//        int n = -3558;
//
//        n = Math.abs(n);
//
//        int sum = 0;
//
//        while(n>0) {
//
//            sum =sum+n%10;
//            n=n/10;
//
//        }
//        System.out.println("The sum of the digits :" + sum);


//----------------------------------------------------------------------------------------


//Type code to print characters before the last occurrence of "p" in a String
// String str = "Mississippi";   Output ==> "Mississip"

//        String str = "Mississippi";
//
//        int ind = str.lastIndexOf("p");
//
//        System.out.println(str.substring(0,ind));



//Find the number of vowels in a String

//        String str = "I like to move it move it";
//
//        int j = str.toLowerCase().replaceAll("[^aeiou]", "").length();
//
//        System.out.println(j);



////Ask user to type a positive  Integer and type code to find the sum of the unique digits of that integer


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Type a positive integer");
//        String a = scan.nextLine();
//        int sum = 0;
//
//
//        String str = String.valueOf(a);
//
//
//        for(int i=0; i<str.length(); i++) {
//
//            String ch = str.substring(i, i+1);
//
//            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
//                sum = sum + Integer.valueOf(ch);
//            }
//        }
//
//        System.out.println("the sum of the unique digits of an integer: " + sum);



////Ask user to enter an integer and then type a code that prints all prime numbers less than a given number.
//// Example: If user enters 20 output will be 2, 3, 5, 7, 11, 13, 17, 19



//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a positive integer");
//        int num = scan.nextInt();
//
//        int count = 0;
//
//
//
//        if (num < 2) {
//            System.out.println(num + "is not prime");
//
//        } else {
//
//            for (int i = 2; i < num; i++) {
//
//                for (int j = 1; j <= i; j++) {
//
//                    if (i % j == 0) {
//                        count++;
//                    }
//                }
//
//                if (!(count > 2)) {
//
//                    System.out.print(i + " ");
//                }
//
//                count = 0;
//            }
//        }


//---------------------------------------------------------------------------------------------------


////Type code to print repeated characters in a String by using do while loop
////Example: String str = "accessories";   ==>  ces


//
//        String s = "accessories";
//        String d = "";
//
//        for(int i=0; i<s.length(); i++){
//            String c = s.substring(i,i+1);
//            if(s.indexOf(c)!=s.lastIndexOf(c)){
//                if(!d.contains(c)){
//                    d = d + c;
//                }
//            }
//        }
//        System.out.println(d);















    }


}
