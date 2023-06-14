package Others.MyPractice.P3;

import java.util.Scanner;

public class Q51 {


    public static void main(String[] args) {


        // Create a  method to check whether a year (integer) entered by the user is a leap year or not.


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scan.nextInt();

        System.out.println(isLeapYear(year));

    }



    public static boolean isLeapYear(int year){

        if((year %4==0 && year %100 !=0)  || year % 400 ==0 ){
            return true;
        }else{
            return false;
        }

    }
    }

