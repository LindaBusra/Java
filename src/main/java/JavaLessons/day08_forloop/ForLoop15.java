package JavaLessons.day08_forloop;

import java.util.Scanner;

public class ForLoop15 {

    public static void main(String[] args) {




//Example - Type code to find the sum of the unique digits in a integer   //12321


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to see the sum of the unique digits in it");

        String num = scan.next();   //12321
        int sumt = 0;


        for(int i=0; i<num.length(); i++) {

            String digits = num.substring(i,i+1);

            if(num.indexOf(digits) == num.lastIndexOf(digits) ) {

                sumt = sumt + Integer.valueOf(digits);
            }
        }

        System.out.println("the sum of the unique digits: " + sumt);

    }
}
