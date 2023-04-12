package JavaLessons.day08_forloop;

public class ForLoop06 {

    public static void main(String[] args) {



// Example 1-Create a simple multiplication table.

        for(int i=1; i<=10; i++) {
            for(int n =1; n<=10; n++) {
                System.out.println( i + " X " + n + " = " + i*n);
            }
        }

        System.out.println();



//---------------------------------------------------------------------------



// Example 2- print 3 by 3 from the first of the two given numbers to the second
// (the second number may not be printed if it does not meet the conditions


        int start = 20;
        int finish = 61;

        for(int i= start; i<=finish; i+=3) {
            System.out.print(i + " ");
        }
        System.out.println();



//---------------------------------------------------------------------------



// Example 3-Starting from a given number, write backwards numbers that are divisible by 1 to 3

        int a = 30;

        for(int i=a; i>=1; i--) {
            if(i%3==0) {
                System.out.print(i + " ");
            }
        }

    }
}
