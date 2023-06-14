package Others.MyPractice.P2;

import java.util.Scanner;

public class Q38 {

    public static void main(String[] args) {


//Question 3 )Type a program which gets integer values from the user and
//stops by displaying "Done" when the sum of these values is grater than 100

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        do {
            System.out.println("Enter integer please");
            int num = scan.nextInt();
            sum = sum+num;


        } while (sum < 100);
        System.out.println("Sum is : " + sum+ " DONE");





//2.way
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer please");
        int sumt=0;
        do {
            int x = input.nextInt();

            sumt = sumt + x;
            if (sumt>100){
                System.out.println("Done");
                break;
            }
        }while(true);

    }
}
