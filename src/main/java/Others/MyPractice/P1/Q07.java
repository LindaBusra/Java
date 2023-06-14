package Others.MyPractice.P1;

import java.util.Arrays;
import java.util.Scanner;

public class Q07 {


/* Questions 1-	Create a function that takes an array and returns the difference between the biggest and the smallest numbers.
 Ask user to enter array elements.
*/


    static Scanner scan  = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the length og array please");
        int length = scan.nextInt();
        differenceNumbers(length);


    }

    private static void differenceNumbers(int length) {

        int arr[] = new int[length];


        for(int i=0; i<length; i++) {

            System.out.println("enter the " + (i+1) + " element please");
            arr[i] = scan.nextInt();

        }

        Arrays.sort(arr);

        System.out.println("Difference: " +(arr[arr.length-1]- arr[0] ));
    }

}