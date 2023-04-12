package JavaLessons.day06_methods_recursion;

public class Recursion04 {



        //method to calculate fibonacci series by using recursion.

        static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


        public static void main(String[] args) {
        int number = 10;

        //print first 10 numbers of fibonacci series

        System.out.println ("Fibonacci Series: First 10 numbers:");

        for (int i = 1; i <= number; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }

    }
    }