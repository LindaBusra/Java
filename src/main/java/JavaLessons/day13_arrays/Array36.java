package JavaLessons.day13_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array36 {


    public static void main(String[] args) {



//Example - Ask the user to give number of employees, and write an array with the given names


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of employees to store in the array");
        int length= scan.nextInt();

        String names[] = new String[length];


        for(int i=0; i<length; i++) {

            System.out.println("Enter " +(i+1)+". employee name");
            names[i] = scan.next();
        }

        System.out.println(Arrays.toString(names));


//------------------------------------------------------------------------------------------



/*    Create an integer array by getting the elements from the user then print the difference
    between the smallest and the greatest elements on the console.
 */


        Scanner input = new Scanner(System.in);
        System.out.println("How many number will du enter for array");
        int number = input.nextInt();

        int myArray[] = new int[number];

        for (int i=0; i<number; i++) {

            System.out.println("Enter " + (i+1) + ". number");
            myArray[i] = scan.nextInt();
        }

        System.out.println("Your array is: " + Arrays.toString(myArray));       //[3, -5, 8, 12, -4]
        Arrays.sort(myArray);

        int result =  myArray[number-1] - myArray[0] ;

        System.out.println("the difference between the smallest and the greatest elements:" + result);      //17
    }
}
