package Others.javaQuestionBank_TechPro;

import java.util.Scanner;

public class Loops68 {

    public static void main(String[] args) {



//Question 28-  Type a code that prints all prime numbers less than a given number. Example: if user enters
//20 output will be 2, 3, 5, 7, 11, 13, 17, 19


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int num = scan.nextInt();

        int count = 0;

        if (num < 2) {
            System.out.println(num + "is not prime");
        } else {

            for (int i = 2; i < num; i++) {

                for (int j = 1; j < i; j++) {

                    if (i % j == 0) {
                        count++;
                    }
                }
                if (!(count > 1)) {

                    System.out.print(i + " ");
               }

                count = 0;
            }


        }




    }
}
