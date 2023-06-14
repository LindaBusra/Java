package Others.MyPractice.P1;

import java.util.Scanner;

public class Q10 {


/*	 	A number is called an Armstrong number if it equals to the sum of the cube of its every digit.
	    For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
	    You need to write a program to check if the given number is Armstrong number or not.    */



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please");
        int num = scan.nextInt();


        isArmstrong(num);


    }

    public static void isArmstrong(int num) {

        int sum =0;

        String str = String.valueOf(num);

        String arr[] = str.split("");   // 9 4 7 4

        for(int i=0; i<str.length(); i++) {


            sum += Math.pow(Integer.valueOf(arr[i]), arr.length);   // Math.power(2,4 )  =2*2*2*2
        }

        System.out.println(num==sum ? "The number is Armstrong" : "The number is not Armstrong");
    }









}
