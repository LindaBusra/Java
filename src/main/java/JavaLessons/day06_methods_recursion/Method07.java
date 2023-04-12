package JavaLessons.day06_methods_recursion;

public class Method07 {
    public static void main(String[] args) {

        //write a method to calculate the square of a number.


        for(int i=0; i<5; i++) {

            System.out.println("Square of " + i + " is: " + square(i));
        }

    }


    private static int square(int a) {

        return a*a;
    }
}
