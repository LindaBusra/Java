package JavaLessons.day05_concatenation_modulus_nestedternary;

import java.util.Scanner;

public class NestedTernary06 {

    public static void main(String[] args) {




///Type code to calculate the absolute value of a number
// For positive numbers and zero absolute value is the same with the number
// For negative numbers to find absolute value multiply the number by -1


        double z = 3.4;

        double abs = z>=0 ? z : z*(-1) ;
        double betterAbs = z<0 ? z*(-1) : z ;  // bu daha kullanisli

        System.out.println("absolute value is " + abs);

        //You have 2 integers;
        //If both of the integers are positive do multiplication
        //otherwise return "I do not how to multiply"

        int a = -10;
        int c = 5;


//object data type can bu used for all data types whenever we need,
        Object res = a>0 && c>0 ? a*c : "I do not how to multiply";
        System.out.println(res);


//_-------------------------------------------------------------------------------


//Question-01- //Ask user to enter an integer and print "even" on the console for even integers, increase the value by 3
//for odd integers and print it on the console by using ternary.


    Scanner scan =new Scanner(System.in);


    System.out.println("Enter a integer");
    int num = scan.nextInt();

            System.out.println(num%2==0 ? "even" : num+3);




    }
}
