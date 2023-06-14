package Others.MyPractice.P3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Q52 {

    public static void main(String[] args) {

         /*
            Create a function that takes an array and the difference between the largest
            and the smallest numbers.
            Ask user to enter array elements.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your arrays length:");
        int length = scan.nextInt();

        int arr[] = new int[length];

        int i=0;
        do{
            System.out.println("Enter your " + (i+1) + ". element please");
            arr[i] = scan.nextInt();
            i++;

        }while(i<length);

        Arrays.sort(arr);

        System.out.println("The max element: " + (arr[arr.length-1]) + "the minimum element: " + arr[0] );
        System.out.println("The difference is " + (arr[arr.length-1] - arr[0]));



    }
}
