package JavaLessons.day09_NestedForLoop;

import java.util.Scanner;

public class NestedForLoop04 {

    public static void main(String[] args) {



//Example - Multiplication table with for loop and while loop

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to see the multiplication table on the console:");
        int num = scan.nextInt();


        int y=1;

        while(y<11) {

            System.out.println(num + "x" + y + "=" + num*y);
            y++;
        }



        for(int i=1; i<11; i++) {

            System.out.println(num + "x" + i + "=" + num*i);
        }


    }
}
