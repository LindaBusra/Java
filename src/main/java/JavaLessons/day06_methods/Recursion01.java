package JavaLessons.day06_methods;

public class Recursion01 {


    public static void main(String[] args) {



    // Recursion : In Java, a method that calls itself is known as a recursive method. And, this process is known as recursion.
    //Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems
    // down into simple problems which are easier to solve.


    // Question: Use recursion to add all of the numbers up to 10.

        int result = sum(10);

        System.out.println(result);
    }




    public static int sum(int k) {

        if (k > 0) {

            return k + sum(k - 1);

        } else {

            return 0;
        }

    }

/*
When running, the program follows these steps:
10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

 */


 /*
Advantages and Disadvantages of Recursion
When a recursive call is made, new storage locations for variables are allocated on the stack. As, each recursive call returns, the old variables and parameters are removed from the stack. Hence, recursion generally uses more memory and is generally slow.
On the other hand, a recursive solution is much simpler and takes less time to write, debug and maintain.
*/


 /*

How to find factorial of a number using recursion ? (Solution)


How to find the sum of digits of a number using recursion ? (Solution)


How to convert a number from Decimal to Binary using recursion ? (Solution)


How to calculate Power of a number using recursion ? (Solution)


How to reverse a LinkedList using recursion ? (Solution)


How to form the Fibonacci series using recursion ? (Solution)


How to do a recursive binary search to find a number in an array? (Solution)


Write recursive Quicksort algorithm in java. (Solution)


How to find GCD(Greatest Common Divisor) of two numbers using recursion ? (Solution)


How to find all permutations of characters in a String using recursion ? (Solution)

//Ressurs : https://www.topjavatutorial.com/java/java-programs/top-programming-interview-questions-using-recursion-in-java/    */

}