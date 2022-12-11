package JavaLessons.day08_forloop;

public class ForLoop04 {
    public static void main(String[] args) {




// Example 1- Print the squares of the numbers from 1 to 5.


        for (int i=1; i<6; i++) {
            System.out.print(i*i + " ");
        }



//---------------------------------------------------------------------------



// Example 2-Using the for loop, print between 50 and 60 degrees Fahrenheit on the screen.

        for(int c=50; c<=60; c++) {
            double f = c*1.8+32;
            System.out.println(c+" Degrees = "+f+" Fahrenheit");
        }
        System.out.println(" ");



//---------------------------------------------------------------------------



// Example 3-Find sum of numbers from 1 to 20.

        int sum = 0;

        for (int x = 1; x <21; x++) {
            sum = sum + x;
        }
        System.out.println("Sum: " + sum);





    }
}
