package Others.MyPractice.P3;

import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {

/*

// Ask the user for numbers to be collected
     // if the number of numbers exceeds 10 or the total exceeds 500
     // that's enough numbers
     // print ".. you have entered a number of numbers, the sum is..."
 */

        Scanner scan = new Scanner(System.in);
        int count = 0;
        int sum =0;

        do{

            System.out.println("Enter your " + (count+1) +  ".  number please");
            int num = scan.nextInt();
            sum +=num;
            count++;
            if(sum>500) {

                break;
            }


        } while(count<10);

        System.out.println("It is enough. You have entered " + count + " number and the sum is " + sum);


    }
}
