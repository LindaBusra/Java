package JavaLessons.day13_arrays;

import java.util.Scanner;

public class Array25 {

    public static void main(String[] args) {



//Ask user to create an integer array and type all odd numbers on the console.

            Scanner input = new Scanner(System.in);
            System.out.println("please, enter the num of elements");
            int numOfElements =input.nextInt();

            int arr[] = new int[numOfElements];

            for (int i =0; i<arr.length; i++){

                System.out.println("please, enter the "+ (i+1)+ " . element");
                int num = input.nextInt();
                arr[i] =num;

            }

            for (Integer w: arr){
                if (w%2!=0){
                    System.out.print(w+" ");
                }
            }




    }
}
