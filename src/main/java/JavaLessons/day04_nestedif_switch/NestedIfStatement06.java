package JavaLessons.day04_nestedif_switch;

import java.util.Scanner;

public class NestedIfStatement06 {

    public static void main(String[] args) {



        //Take input from the user
        //Create an instance of the Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number please: ");
        int num=sc.nextInt();


        if( num < 100 )
        {
            System.out.println("The entered number is less than 100");
            if(num > 50)
            {
                System.out.println("The entered number is greater than 50");
            }
        }
        else
        {
            System.out.println("The entered number is greater than 100");
        }

    }
}
