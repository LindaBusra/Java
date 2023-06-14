package JavaLessons.day10_dowhileloop;

public class DoWhile01 {
    public static void main(String[] args) {



//Example 1- To write five times "Hello World" by using do-while


        // Declaring and initialization expression
        int i = 1;

        // Do-while loop
        do {

            // Body of do-while loop
            // Print statement
            System.out.println("Hello World");

            // Update expression
            i++;
        }

        // Test1 expression
        while (i < 6);

        System.out.println();



//---------------------------------------------------------------------------------------------------------------



//Example 2- Find the sum of number from 11 to 21 by using do-while

        int x = 21, sum = 0;


        do {
            sum += x;
            x--;

        }  while (x > 10);



        System.out.println("The sum of the numbers: " + sum);



//---------------------------------------------------------------------------------------------------------------



//Example 3- Find the digits of number by using do-while


   int numb =1234;

   int sumt = 0;


   do{
       sumt = sumt + numb % 10;
       numb = numb / 10;

   } while(numb > 0);

        System.out.println("The digits of number: " + sumt);

    }
}
