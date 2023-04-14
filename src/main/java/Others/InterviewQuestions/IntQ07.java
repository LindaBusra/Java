package Others.InterviewQuestions;

import java.util.Scanner;

public class IntQ07 {

    	/*
	 	A number is called an Armstrong number if it equals to the sum of the cube of its every digit.
	    For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
	    You need to write a program to check if the given number is Armstrong number or not.
	*/

   // https://github.com/salptekin/java_interview_code_questions_updated/blob/main/src/javainterviewcodequestions/InterviewQuestion07.java

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Armstrong number or not");
        int givenNumber = scan.nextInt();
        int num = givenNumber;
        int digit;
        double sumOfDigit=0;

        while(num>0){

            digit = num%10;
            sumOfDigit += Math.pow(digit, 3);
            num = num/10;
        }

        if(sumOfDigit==givenNumber) {
            System.out.println("The given number is Armstrong");
        } else {
            System.out.println("The given number is not Armstrong");
        }

    }
}
