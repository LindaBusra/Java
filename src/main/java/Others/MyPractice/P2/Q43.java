package Others.MyPractice.P2;

import java.util.Scanner;

public class Q43 {

    public static void main(String[] args) {


/* Check if the integer is an Armstrong numbers to 4 digit numbers.

            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
gösteren program yazınız */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        String ss = scan.next();

        int numOfDigit = ss.length();
        int sum = 0;

        String arr[] = ss.split("");

        for(int i=0; i<ss.length(); i++) {

            sum += Math.pow(Integer.valueOf(arr[i]), numOfDigit);
        }

        if(sum == Integer.valueOf(ss)) {
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is not Armstrong");
        }













    }
}
