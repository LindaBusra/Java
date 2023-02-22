package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array07 {

    public static void main(String[] args) {



//Example 1- Create a double array and find the sum of all elements in the array.

        double prices[] =  new double[4];
        prices[0] = 1.2;
        prices[1] = 2.3;
        prices[2] = 5.0;
        prices[3] = 4.51;


        //1.way     //for-each-loop can be used with Arrays and Collections
        double sum = 0;

        for(int i=0; i<prices.length; i++) {

            sum = sum + prices[i];
        }
        System.out.println(sum);



        //2.way: We will solve the task by using for-each-loop.

        double sum2 = 0;

        for(double w: prices) {
            sum2 += w;
        }
        System.out.println("The sum of array: " + sum2);



//-----------------------------------------------------------------------------------------------



//Example 2 - Find sum of the array elements

        int num[] = {1,2,45,78,89};


        int sumt = 0;

        for(int w: num){

            sumt += w;
        }

        System.out.println("Sum of the array elements is " + sumt); //215



        }

    }

