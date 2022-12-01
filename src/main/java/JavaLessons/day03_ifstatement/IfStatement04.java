package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {




  /*
        Ask user ta enter a 4 digits integer, then print the sum of the first
        and the last digit of the number on console.
        For example; if user enters 1234 you will add 1 and 4,
        then print on the console 5
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 4 digits integer");
        String num = scan.next();

        String fD = num.substring(0,1);
        String lD = num.substring(num.length()-1);
        int fDi = Integer.valueOf(fD);
        int lDi = Integer.valueOf(lD);          // int lDi = Integer.parseInt(lD);

        if(num.length()==4) {

            System.out.println("the sum of the first and the last digit of the number: " + (fDi + lDi));
        } else {
            System.out.println("You didn't enter a 4 digits integer");
        }


//-------------------------------------------------------------------------------------------------


        int n1=9;

        int n2= n1++;


        if(n2 < 10){
            System.out.println(n2 + " Hello World");
        } else {
            System.out.println(n1 + " Hello Universel");
        }


    }
}
