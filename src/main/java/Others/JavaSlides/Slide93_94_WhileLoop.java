package Others.JavaSlides;

import java.util.Scanner;

public class Slide93_94_WhileLoop {
    public static void main(String[] args) {

// 1) Type java code by using while loop,
//Write a program to print numbers from 1 to 5

//        int i= 1;
//        while(i<=5) {
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println("\n");

//-------------------------------------------------------------------------------------------------


// 2-Type java code by using while loop.
//Write a program that types first 30 consecutive odd integers.  /ardisik


//int count = 1;
//
//while(count<=30) {
//    System.out.print(2*count-1 + " ");   //even deseydi 2k olurdu.
//    count++;
//}


//-------------------------------------------------------------------------------------------------


// 3- Type java code by using while loop,
//Write a program that prompts the user to input a positive integer.
//It should then print the multiplication table of that number

//Scanner scan = new Scanner(System.in);
//System.out.println("Please enter a positive integer");
//int input = scan.nextInt();
//
//int n=1;
//
//while(n<=10) {
//    System.out.println(input + "X" + n + "=" + (n*input));
//    n++;
//}


//-------------------------------------------------------------------------------------------------

// 4-Type java code by using while loop,
//Write a program that prompts the user to input a positive integer.
//It should then print factorial of that number

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter a positive integer");
//        int num = scan.nextInt();
//        int faktoriyel=1;
//
//        while(num>0) {
//            faktoriyel = faktoriyel*num;
//            num--;
//
//        }
//        System.out.println("Faktoriyel of the number is: " + faktoriyel);

//-------------------------------------------------------------------------------------------------

// 5-Type java code by using while loop,
//Write a program to count the factors of an integer which is entered by user. (factors:bolenler)

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        int num = scan.nextInt();   //I think the number is positive in this question.
        int i=1;
        int count=0;



        while(i <= num) {
            if (num % i == 0) {
                count++;
            }
            i++;
        }
        System.out.println( "Count the factors of an integer " + count);


//for loop ile cozersem:


//        System.out.println("Factors of " + num + " are: ");
//        // the solution with for loop, y is factor
//        for (int y = 1; y <= num; i++) {
//
//            if (num % y == 0) {
//                System.out.print(y + " ");
//            }
//            y++;
//        }

// sayi negatif ise:

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter an  integer number");
//        int num = scan.nextInt();   //I think the number is positive in this question.
//        int i=1;
//
//
//            // 0'i atlamak icin continue secengini kullandim
//
//
//        for (i = num; i <= Math.abs(num); i++) {
//
//            // 0'i atlamak icin continue secengini kullandim
//            if (i == 0) {
//                continue;
//            } else {
//                if (num % i == 0) {
//                    System.out.print( i + " ");
//                }
//            }
//        }


// 6-Type java code by using while loop,
//Write a program that prompts the user to input an integer.
//It should then find sum of the digits of that number.

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter an  integer number");
//        int n1 = scan.nextInt();   //I think the number is positive in this question.
//        int num = Math.abs(n1);  //olur da negatif sayi girilirse diye
//
//        int lastDigit=1;
//        int sumOfLAstDigit = 0;
//
//
//        while(num>0) {
//            lastDigit = num%10; //124-->4
//            num = num /10;
//            sumOfLAstDigit = sumOfLAstDigit + lastDigit;
//
//        }
//        System.out.println(sumOfLAstDigit);




    }

    }




























