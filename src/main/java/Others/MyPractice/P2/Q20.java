package Others.MyPractice.P2;

public class Q20 {

    public static void main(String[] args) {



 /* Ask user to enter the number of lines of a half pyramid.
    Type a program to create the half pyramid.
    For example if the number of lines is 5, the pyramid will be like;


*
* *
* * *
* * * *
* * * * *

*/

        int row=5;

        for(int i=1; i<=row; i++) {

            for(int j=1; j<=i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


//----------------------------------------------------------------------------------------------------------------



 /* Ask user to enter the number of lines of a half pyramid.
    Type a program to create the half pyramid.
    For example if the number of lines is 5, the pyramid will be like;

* * * * *
* * * *
* * *
* *
*

*/



        int row1=5;

        for(int i=1; i<=row1; i++) {

            for(int j=row1-i; j>=0; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }






    }
}
