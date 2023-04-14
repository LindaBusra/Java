package Others.InterviewQuestions;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class IntQ05 {

    public static void main(String[] args) {

    /*
	 	Create a function that takes an array and
	 	returns the difference between the biggest and the smallest numbers.
	    Ask user to enter array elements.
	*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of element in the array");
        int length = scanner.nextInt();


        int arr[] = new int[length];

        for(int i=0; i<length; i++) {

            System.out.println("Type " + (i+1) + ".elements in the array");
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        //the difference between the biggest and the smallest numbers

        System.out.println("the biggest number - the smallest number = " + (arr[arr.length-1] - arr[0]));
    }




}
