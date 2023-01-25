package JavaLessons.day14_arrays_foreachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_practice {

    public static void main(String[] args) {


//Example 1- Ask user to enter the names into the application by using an Array then take the number of the elements and
// then print them on the console.


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of names you want to insert");
        int length = scan.nextInt();
        String arrNames[] = new String[length];


        for(int i=0; i<length; i++) {

            System.out.println("Enter the " + (i+1) + ". employee name. Please enter 'Q' to quit the application");
            String employeeName = scan.next();

           if( ! employeeName.equalsIgnoreCase("Q")) {
               arrNames[i] = employeeName;

           } else {
               break;
           }

        }
        System.out.println(Arrays.toString(arrNames));








    }

}




















