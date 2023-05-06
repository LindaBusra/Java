package JavaLessons.day04_nestedif_switch;

public class NestedIfStatement01 {
    public static void main(String[] args) {



/*
        if(Boolean_expression 1) {
            // Executes when the Boolean expression 1 is true
            if(Boolean_expression 2) {
                // Executes when the Boolean expression 2 is true
            }
        }
*/


        int x = 30;
        int y = 10;

        if( x == 30 ) {
            if( y == 10 ) {
                System.out.print("X = 30 and Y = 10");
            }
        }



//-----------------------------------------------------------------------


//declare 2 variables and store some values in it

        int num1 = 23;
        int num2 = 45;

        if( num1 == 23 ) {

            if( num2 == 45 ) {
                System.out.print("Number 1 is :"+ num1 +" and Number 2 is :"+ num2);
            }
        }


//-----------------------------------------------------------------------


        if (x == 0)  {
            System.out.println("X is zero");
        } else {
            if (x > 0)
            {
                System.out.println("X is positive");
            }
            else
            {
                System.out.println("X is negative");
            }
        }

    }
}
