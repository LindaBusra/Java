package JavaLessons.day05_concatenation_modulus_nestedternary;

import java.util.Scanner;

public class ModulusOperator02 {
    public static void main(String[] args) {



//Question 1- Ask user to enter an integer then print "Even" on the console if the number is even.
//-1000, -10, 0==> We should always consider boundary values. We should use Math.abs(variable name)


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scan.nextInt();
        int newNumber = Math.abs(number);

        System.out.println((newNumber %2 == 0 ?  "Even" : "Odd"));
//or
        System.out.println("Is the number even? " + (newNumber %2 == 0 ?  true : false));


//-------------------------------------------------------------------------------------------------------------


//Question 2- Ask user to enter a 3 digits integer then find the sum of the digits.
/*For Ex; when the user enters 237 into the system we should first use modulus method like; 237%10= 7 and then */

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a 3 digits integer");
        int number1 = scan1.nextInt();

        //237
        int last = number1 % 10;     //7
        int middle = (number1 /10) % 10;     //3
        int first = number1/100;     //2

        System.out.println("The total is " + (last+middle+first));




        //to find mod with Math.floorMod();

        int a = Math.floorMod(16, 3);
        System.out.println(a);



//-------------------------------------------------------------------------------------------------------------


//Question-3 - Find the sum of the digits of  a 4 digits number. For example 4567;

// if the number is negative:   int absNumber = Math.abs(number);

int num = 4567;

        int b4 = num%10;            //7
        int b3= (num /10) % 10;     //6
        int b2 = (num/100) % 10;    //5
        int b1 = num/1000;          //4

        System.out.println("The total is " + (b1+b2+b3+b4));




        //2nd way, this way is not hardcoding

        int sum = 0;
        num= Math.abs(num);
        String nm = String.valueOf(num);

        for(int i=0; i<nm.length(); i++) {

            int d = (int) Math.pow(10,i);
            sum = sum + (num/d)%10;

        }

        System.out.println("The total is " + sum);




    }
}
