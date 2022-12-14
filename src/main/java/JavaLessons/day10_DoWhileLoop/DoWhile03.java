package JavaLessons.day10_DoWhileLoop;

public class DoWhile03 {
    public static void main(String[] args) {




//while-loop
//When you use while loop zero execution is possible.

    int i=1;
    while(i<1) {
        System.out.println("While loop");
        i++;    //The loop will be broken. I should not getting on the console

    }



//do-while loop
//When you use do-while loop, zero execution is impossible, loop body will be executed at least once.
//If it is mandatory to execute the code inside the loop at least once, use do while loop

        int k=1;

    do{
        System.out.println("Do-while loop");
        k++;
    } while(k<1);   //The loop will be broken, but body will be executed at least ones

        System.out.println();



//---------------------------------------------------------------------------------------



//Type 5 times "Hello World"

        // Declaring and initialization expression
        int j = 1;

        // Do-while loop
        do {

            // Body of do-while loop
            // Print statement
            System.out.println("Hello World");

            // Update expression
            j++;
        }

        // Test expression
        while (j < 6);

        System.out.println();



//---------------------------------------------------------------------------------------



//Type code to print integers from 3 to 9, except 5
        int a =3;

        do {
            if( a!= 5 ) {
                System.out.println(a);
            }
            a++;

        }    while(a <10);






    }
}
