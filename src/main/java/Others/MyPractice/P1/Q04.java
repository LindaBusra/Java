package Others.MyPractice.P1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {


//Write a program to enter the numbers till the user wants and at the end the program should display
// the largest and smallest numbers entered.


        ArrayList<Integer> list = new ArrayList<>();
        char choose = 'y';
        int i=1;

        do{

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the " + i + ". number please");
            int input = scan.nextInt();


            list.add(input);

            System.out.println("Will do enter a number again? Yes:y / No:n");
            choose = scan.next().toLowerCase().charAt(0);
            i++;


                }while(choose=='y');

        int arr[] = new int[list.size()];


        for(int k=0; k<arr.length; k++) {

            arr[k] = list.get(k);
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println("min element in the array is: " + arr[0]);
        System.out.println("max element in the array is: " + arr[arr.length-1]);

    }
}
