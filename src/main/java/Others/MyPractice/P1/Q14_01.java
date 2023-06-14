package Others.MyPractice.P1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Q14_01 {
    public static void main(String[] args) {


        //Example 1- Type code to print the number of occurrences of letters in a sentence.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to see repeated characters");
        String str = scan.nextLine();



        findRepeated(str);




    }

    private static void findRepeated(String str2) {

        str2 = str2.replaceAll("[^a-zA-Z]", "");

        String arr[] = str2.split("");
        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++) {      //  a r a b a
           int count = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                } else {
                    i = j - 1;
                    break;
                }
            }

            //Get the letters which one is more than 1.
            if (count != 1) {
                System.out.println(arr[i] + " = " + count);
            }


        }


    }


        }
