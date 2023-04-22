package Batch159.day07_ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        //If it rains, I will cancel the picnic

        //Example 1: Type code to check if a number is even or odd.

        int num =13;

        //1.way
        if(num%2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }


        //2.way
        if(num%2 == 0) {
            System.out.println("The number is even");
        }

        if(num%2 != 0) {
            System.out.println("The number is odd");
        }



        //Example 2: Type code to check if initial of a String is uppercase or not.

        String name = "Emily";

        //1.way

        if(name.charAt(0)>='A' && name.charAt(0)<='Z') {
            System.out.println("It is uppercase");
        }

        if(name.charAt(0)<'A' || name.charAt(0)>'Z') {
            System.out.println("It is not uppercase");
        }


        //2.way

        if(name.charAt(0)>='A' && name.charAt(0)<='Z') {
            System.out.println("It is uppercase");
        } else  {
            System.out.println("It is not uppercase");
        }


        //Example 3: Type code to check if a number is positive, negative or zero

        int number = -3;

        if(number>0) {
            System.out.println("positive");
        } else if (number<0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }


        //Example 4: Type code to print they name when you know they number
        //1-->Sunday, 2-->Monday.., 3-->Saturday

        int day = 3;

        if(day==1) {
            System.out.println("Sunday");
        } else if (day==2) {
            System.out.println("Monday");
        } else if (day==3) {
            System.out.println("Thursday");
        } else if (day==4) {
            System.out.println("Wednesday");
        } else if (day==5) {
            System.out.println("Thursday");
        } else if (day==6) {
            System.out.println("Friday");
        } else if (day==7) {
            System.out.println("Saturday");
        } else {
            System.out.println("invalid day number, please enter number from 1 to 7");
        }

    }
}
