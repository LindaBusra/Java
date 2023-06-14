package Others.MyPractice.P1;

import java.util.Arrays;
import java.util.Scanner;


public class Q14_rpt {



    //Find repeated characters in a String    // SUPER
    //Find all characters in a String

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to see repeated characters");
        String str = scan.nextLine();


        str = str.trim().replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
        String arr[] = str.split("");
        Arrays.sort(arr);
        String output = "";


        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }


            if(count>1) {           //If I delete this if part can I get all characters

            if (!output.contains(arr[i])) {
                output = output + arr[i] + count + " ";
            }
            }
        }
        System.out.println(output);

    }}