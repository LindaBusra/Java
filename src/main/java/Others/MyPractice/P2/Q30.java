package Others.MyPractice.P2;

import java.util.Scanner;

public class Q30 {


    public static void main(String[] args) {


        //Question-3- Write a program to calculate the sum of following series where n is input by user.
//1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number please");
            int number = scan.nextInt();
            double dSum = 0.0;

            for(int i=1; i<=number; i++) {

                dSum += (1.0/i);
            }

        System.out.println("the sum of following series: " + dSum);

    }
}
