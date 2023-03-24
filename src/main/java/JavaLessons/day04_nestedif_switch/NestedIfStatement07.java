package JavaLessons.day04_nestedif_switch;

import java.util.Scanner;

public class NestedIfStatement07 {

    public static void main(String[] args) {



        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int num1 = sc.nextInt();


        //if the number 1 is greater than or equal to 23
        if( num1 >= 23 ) {
            System.out.print("Number 1 is :"+ num1 +" and it is greater than 23.");
        //if number is 45
            if( num1 >= 45 ) {
                System.out.print("Oh!! it is greater than 45 also");
            }
            else
            {
                System.out.print(" But, the number "+num1+" is less than 45");
            }
        }
        else
        {
            System.out.print("The number "+num1+" is less than 23");
        }


    }
}
