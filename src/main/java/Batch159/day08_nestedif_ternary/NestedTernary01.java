package Batch159.day08_nestedif_ternary;

public class NestedTernary01 {

    public static void main(String[] args) {

        //Example 1: Type code to check if a number is positive or not

        //Use if-else statement
        int num = 12;
        if(num>0){ System.out.println("Positive"); }else{ System.out.println("Not positive"); }

        //Use ternary statement

        String result =  num>0 ? "Positive" : "Not positive";
        System.out.println(result);



        //Example 2: Type code to check if a number is even or odd
        int number = 13;

        String s = number%2==0 ? "even" : "odd";
        System.out.println(s);



        //Example 3: Type code to find the minimum of two integers
        int a = 10, b=22;
        System.out.println(a<b ? a : b);



        //Example 4: Type code to calculate the "absolute value" of a number
        //           5 ==> 5        -5 ==> -1*-5         0 ==> 0

        int n = -5;
        int abs = n>0 ? n : n*(-1);
        System.out.println(abs);



        //Example 5:  You have 2 integers;
        //            If both of the integers are positive do multiplication.
        //            Otherwise, return "I do not know how to multiply"

        int m = -4,  k =9;
        Object r = m>0 && k>0 ?  m*k :"I do not know how to multiply";  //different data types
        System.out.println(r);



        //Example 6: You have 2 integers
        //           If both are positive do addition
        //           Otherwise return the maximum one

        int h=23, y=-8;
        int rst = h>0 && y>0 ? (h+y) : (h>y ? h : y);
        System.out.println(rst);

    }
}
