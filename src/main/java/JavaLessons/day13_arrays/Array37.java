package JavaLessons.day13_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array37 {

    public static void main(String[] args) {


//Example 1:Let user enter student names into the application
//(Create an Arrays04 together with the user)

//1.step-->I have to create an array
//I have to insert the elements into the Arrays04


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of the students you want to enter");
        int numOfStd = scan.nextInt();

        String names[] = new String[numOfStd];
        System.out.println(Arrays.toString(names));    // enter 5--> [null, null, null, null, null]

        //2.Step: Insert the elements into the Arrays04


        for(int i=0; i<numOfStd; i++) {

            System.out.println("Enter the " + (i + 1) + ". student name. To stop insertion press Q");
            String stdName = scan.next();               //nextLine()'da sorun cikiyor

            if (!stdName.equalsIgnoreCase("q")) {
                names[i] = stdName;                         //I need index, so I used for loop
            } else {
                break;
            }
        }

        System.out.println(Arrays.toString(names));




//----------------------------------------------------------------------------------------------------




        Scanner input = new Scanner(System.in);
        System.out.println("How many number will do enter?");
        int length = input.nextInt();

        int numberList [] = new int[length];

        for(int i=0; i<numberList.length; i++) {

            System.out.println("Enter the " + (i+1) + ". number");
            numberList[i] = scan.nextInt();

        }

        System.out.println("Your list is: " + Arrays.toString(numberList));     // [2, 5, 6]

    }
}
