package Others.MyPractice.P4;

import java.util.Scanner;

public class Q77 {

    public static void main(String[] args) {




        // Write a code that prints characters with an odd number index


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text please : ");
        String str = scanner.nextLine();


        //1. way

        for(int i=0; i<str.length(); i++) {

            if(i%2==1) {
                System.out.print(str.charAt(i) + " ");
            }
        }
        System.out.println();





        //2. way with do-while


        int index = 0;

        do {

            if (index % 2 != 0) {
                System.out.print(str.charAt(index) + " ");
            }
            index++;
        } while (index < str.length());

    }
}
