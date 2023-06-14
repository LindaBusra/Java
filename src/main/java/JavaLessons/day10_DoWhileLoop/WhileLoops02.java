package JavaLessons.day10_dowhileloop;

public class WhileLoops02 {
    public static void main(String[] args) {



 /* Example 1-  Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
        with a space between two consecutive integers  */


        int i=11;

        while(i<121) {
            if(i%4==0 && i%6==0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();


//---------------------------------------------------------------------------------------------------


//Example 2 -  Type code to print "Hello!" 5 times on the console

        int j=1;

        while(j<6) {

            System.out.print("Hello ");
            j++;
        }


//---------------------------------------------------------------------------------------------------


//Example 3 -Type code to print odd integers from 12 to 67 in the same line with a space between them

        int a = 12;

        while(a<68) {

            if(a%2==1) {

                System.out.print(a + " ");
            }
            a++;
        }



    }
}