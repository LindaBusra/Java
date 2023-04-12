package JavaLessons.day08_forloop;

public class ForLoopPatterns05 {


    public static void main(String[] args) {



        /* Example - Type code for this pattern


        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */


        int row=5;

        for(int i=1; i<=row; i++) {

            for(int j=1; j<=i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1; i<row; i++) {

            for(int j=i; j<row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


 //------------------------------------------------------------------



 /*  Type this pattern on the console

    5
   4
  3
 2
1


 */



        int n=5;

        for(int i=1; i<=n; i++) {

            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int k=i; k<=i; k++) {
                System.out.println(n-i+1);
            }
        }



    }
}
