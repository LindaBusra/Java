package JavaLessons.day10_dowhileloop;

public class WhileLoops11 {

    public static void main(String[] args) {




//Example 1 -Type code to find the sum of integers from 12 to 67.

        int b = 12;   int sum = 0;

        while(b<68) {

            sum = sum + b;
            b++;

        }

        System.out.println("The sum is: " + sum);


//---------------------------------------------------------------------------------------------------


//Example 2 -Type code to find sum of the digits of a given number


        int g = 234;
        int sumt = 0;

        while(g>0) {
            sumt = sumt + g%10;

            g = g/10;
        }
        System.out.println("The sum of digits " + sumt);
        System.out.println();


//---------------------------------------------------------------------------------



//Example 3- Print all number except 4 and 6

        int i = 0;
        while(i<10) {

            if(i==4 || i==6) {
                i++;
                continue;
            }
            System.out.println("i: " + i);
            i++;

        }

    }
}
