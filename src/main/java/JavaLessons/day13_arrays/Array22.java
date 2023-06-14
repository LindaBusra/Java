package JavaLessons.day13_arrays;

import java.util.Scanner;

public class Array22 {


    public static void main(String[] args) {


//Reverse a String by using Arrays04

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = scanner.next();

        String arrayText[] = text.split("");

        for(int i=arrayText.length-1; i>=0; i--) {

            System.out.print(arrayText[i]);
        }
        System.out.println();


        //or


        char arr[] = text.toCharArray();

        String neWS = "";

        for(int i=arr.length-1; i>=0; i--) {
            neWS = neWS + arr[i];
        }
        System.out.println("Reverse of given string is: " + neWS);



//---------------------------------------------------------------------------------------------------



//To print an array on the console

       int[] numbers = {35,87,96,43,18,22};

       for(int w : numbers)  {

           System.out.print(w + " ");       // 35 87 96 43 18 22
       }


    //2.way

        for (int i = 0; i < numbers.length; i++) {

            System.out.println((i + 1) + ".element is = " + numbers[i]);
        }

    }
}
