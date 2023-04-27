package Batch159.day11_forloops;

public class ForLoop01 {

    public static void main(String[] args) {


/*
    1)Loops are used for "repeated actions" in Java
    2)There are 4 loops in Java     i)for-loop  ii)while loop   iii)do-while loop   iv)for-each loop
 */

//Example 1: Type code to find the sum of integers from 5 to 26
        int sum = 0;

        for(int i=5; i<27; i++) {

            sum+=i;
        }

        System.out.println("the sum of integers: " + sum);




//Example 2: Type code to find the multiplication of integers from 5 to 9

        int multiply = 1;
        for(int i=5; i<10; i++) {
            multiply = multiply*i;
        }

        System.out.println("the multiplication of integers :" + multiply);




//Example 3: Type code to find the sum of the digits of an integer
//           587 ==> 5+8+7=20

        int num = -587;
        num = Math.abs(num);
        int sumOfDigits = 0;

        //1.Way
        for(int i=num; i>0; i/=10) {

            sumOfDigits += i%10;
        }

        System.out.println("the sum of the digits:" + sumOfDigits);



        //2.way

        String b = String.valueOf(num);
        sumOfDigits = 0;


        for (int i=0; i<b.length(); i++) {

            sumOfDigits += Integer.valueOf(b.charAt(i) + "");
        }
        System.out.println("the sum of the digits:" + sumOfDigits);
    }
}
