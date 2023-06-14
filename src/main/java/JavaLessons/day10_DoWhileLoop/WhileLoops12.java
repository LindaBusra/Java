package JavaLessons.day10_dowhileloop;

public class WhileLoops12 {

    public static void main(String[] args) {




// Example 1- Find factorial of given number.

        int num = 5;

        int f = 1;

        while(num>0) {

            f = f * num;
            num--;
        }

        System.out.println("the factorial is: " + f);



//---------------------------------------------------------------------------------------------------------


// Example 2- Find sum of all dividers of guven number



        int number = 60;
        int divider = 1;
        int sumOfDivider = 0;


        while(number>0) {

            if(number%divider ==0) {
                System.out.println(divider  + " is divider of " + number);
                sumOfDivider += divider;
            }

            divider++;
        }

        System.out.println("The sum of all dividers is: " + sumOfDivider);



    }
}
