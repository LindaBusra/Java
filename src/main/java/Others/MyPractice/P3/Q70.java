package Others.MyPractice.P3;

import java.util.Scanner;

public class Q70 {

    public static void main(String[] args) {



  /*
     Type java code by using while loop,
     Write a program to count the factors of an integer which is entered by user.
     Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
     Factors of 8  = 1, 2, 4, 8 ==> 4
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please :");
        int num = scan.nextInt();

        int count = 0;

        for(int i=1; i<=num; i++) {

            if(num%i==0){
                count++;
            }
        }

        System.out.println("The given number " + num + " has " + count + " factors") ;




    }
}
