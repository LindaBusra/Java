package Others.MyPractice.P5;

import java.util.Scanner;

public class Q03_Swapping {

    public static void main(String[] args) {


        try{
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first element");
        double a = scan.nextDouble();

        System.out.println("Enter second element");
        double b = scan.nextDouble();


            System.out.println("Before swap a:" + a + " - b:" + b);

            double temp = 0;

            temp =b;
            b=a;
            a=temp;
            System.out.println("After swap a:" + a + " - b:" + b);

        } catch (Exception e) {
            System.out.println("Something went wrong while swapping");
        }






    }
}
