package Others.MyPractice.P2;

import java.util.Scanner;

public class Q39 {

    public static void main(String[] args) {


//Ask user to enter  number with double digits. Example: 124267-->1+4+6=2+2+7 write "God" on the console.
//Otherwise write "Bad" on the console

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer please");
        int number = input.nextInt();
        String numb = String.valueOf(number);
        String arr[] = numb.split("");


        int ab = 0;
        int cd = 0;

        if (numb.length() % 2 == 1) {
            System.out.println("Enter a number with double digits");

        } else {
            for (int i = 0; i < numb.length(); i = i + 2) {

                ab += Integer.valueOf(arr[i]);
            }


            for (int j = 1; j < numb.length(); j = j + 2) {

                cd += Integer.valueOf(arr[j]);
            }


            if (ab == cd) {
                System.out.println("God");
            } else {

                System.out.println("Bad");
            }
        }
    }
}