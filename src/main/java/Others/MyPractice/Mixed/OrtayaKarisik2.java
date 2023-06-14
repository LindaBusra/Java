package Others.MyPractice.Mixed;

import java.util.Scanner;

public class OrtayaKarisik2 {

    public static void main(String[] args) {


//Question-3    Find the value of num in bytes.   (byte olarak degeri nedir?
//        int num = 500;


//Question-4-What is the result of   y<2 ? y <-1 ? z <-5 ? y <-1 ? z<5 ? 4 : 10 : -2 :  8 : 7  : 10

//        int y = -16 ;
//        int z = -7;
















//Question-5-Create a multiplication Table


//Question-6-Type code to find sum of the numbers from 3 to 12, except 5


/*Question-7-- Check PERFECT NUMBER using for Loop
A perfect number is a number that is equal to the sum of its positive divisors
(excluding the number itself). For example, 6, 28, 496 etc. are perfect number
*/


//Question-8-Two numbers are entered through the keyboard. Write a program to find
        // the value of one number raised to the power of another. (Do not use Java built-in method)


//Question-9--Write a program that reads a set of integers, and then prints the sum of the even and odd integers.








//1-    Find the value of num in bytes.   (byte olarak degeri nedir?
//        int num = 130;
//        byte b= (byte)num;
//        System.out.println(b);























//2-What is the result?

//        int y = -16 ;
//        int z = -7;
//
//        int result = (y<2 ? y <-1 ? z <-5 ? y <-1 ? z<5 ? 4 : 10 : -2 :  8 : 7  : 10);
//        System.out.println(result);


//3-Create a multiplication Table

//        for (int i = 1; i < 11; i++) {
//
//            for (int j = 1; j < 11; j++) {
//
//                System.out.print(i + " X " + j + " = " + i * j + "\t\t");
//            }
//            System.out.println();
//
//        }


//4-Type code to find sum of the numbers from 3 to 12, except 5
//        int a =3;
//        int sum=0;
//
//        do {
//            if( a!= 5 ) {
//                sum=sum+a;
//            }
//            a++;
//
//        }    while(a <13);
//
//        System.out.println(sum);


//2.way
//        int sum=0;
//        for (int i= 3;i<13;i++){
//            if(i!=5){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);


 System.out.println("Grubumuza  \"Hosgeldiniz\" Yasin Bey :)");




/*5-- Check PERFECT NUMBER using for Loop
A perfect number is a number that is equal to the sum of its positive divisors
(excluding the number itself). For example, 6, 28, 496 etc. are perfect number
*/

//        int num= 496;
//        int sum = 0;
//
//        for(int i=1; i<num; i++) {
//            if(num%i == 0) {
//                sum = sum+i;
//            }
//        }
//        System.out.println(num==sum ? "it is perfect number" : "it is not perfect number");





//6-Two numbers are entered through the keyboard. Write a program to find
// the value of one number raised to the power of another. (Do not use Java built-in method)

//        Scanner console = new Scanner(System.in);
//
//        int base;
//        int power;
//        int result = 1;
//
//        System.out.print("Enter the base number ");
//        base = console.nextInt();
//
//        System.out.print("Enter the power ");
//        power = console.nextInt();
//
//        for (int i = 1; i <= power; i++) {
//            result *= base;
//        }
//
//
//        System.out.println("Result: " + result);
//
//        //2.way
//        System.out.println((int)Math.pow(base, power));




//7-Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

//        int resEven = 0;
//        int resOdd = 0;
//        char choose = 'y';
//        int i=1;
//
//        do{
//
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Enter the " + i + ". number please");
//            int input = scan.nextInt();
//
//
//            if(input%2==0) {
//
//                resEven += input;
//            } else  {
//
//                resOdd += input;
//            }
//
//            System.out.println("Will do enter a number again? Yes:y / No:n");
//            choose = scan.next().toLowerCase().charAt(0);
//            i++;
//
//
//        }while(choose=='y');
//
//        System.out.println("the sum of the odd numbers: " + resOdd);
//
//        System.out.println("the sum of the even numbers: " + resEven);




//From a given array find all pairs whose sum is a given number
//{4, 6, 5, -10, 8, 5, 20} ==> 10
//For example;   4+6=10, 5+5=10, -10+20=10

        int given = 10;

        int arr[] = {4, 6, 5, -10, 8, 5, 20};


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == given) {
                    System.out.println(arr[i] + " & " + arr[j] + "-->" + given);
                }
            }
        }















//        int X, y;
//
//        for (X = 2, y = 5; X < y; X++, y--) {
//
//            System.out.println("X:" + X + " y:" + y);
//
//        }


        /*

         *
         **
         ***
         ****
         *****


         */


//        int row = 5;
//
//        for(int i=1; i<=row; i++) {
//
//            for(int j=1; j<=i; j++) {
//
//                System.out.print( i+j-1 + " ");
//            }
//            System.out.println();
//        }
    }
}

