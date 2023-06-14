package Others.MyPractice.P2;

import java.util.Scanner;

public class Q31 {


    public static void main(String[] args) {



        //Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 24 .....

        Scanner scan = new Scanner(System.in);

        int number;  // To hold number of terms

        int firstTerm = 0, secondTerm = 1, thirdTerm;

        System.out.print("Enter number of terms of series : ");
        number = scan.nextInt();

        System.out.print(firstTerm + " " + secondTerm + " ");

        for(int i = 3; i <= number; i++)
        {
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }



    }
}
