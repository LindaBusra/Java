package JavaLessons.day08_forloop;

public class ForLoopPatterns07 {
    public static void main(String[] args) {





    /* Type code for this pattern

    1 1 1 1 1
    2 2 2 2 2
    3 3 3 3 3
    4 4 4 4 4
    5 5 5 5 5
     */




        int n=5;
        for(int i=1; i<6; i++) {

            for(int j=1; j<=5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }




//---------------------------------------------------------



/*  Type code for this pattern

 * * * * *
 * * * *
 * * *
 * *
 *

 */


        int row=5;

        for(int i=1; i<=row; i++) {

            for(int j=5; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }


//---------------------------------------------------------



/*  Type code for this pattern

/*
         *
       * *
     * * *
   * * * *
 * * * * *

 */


        int m = 5;

        for (int i = 1; i <= m; i++) {

            for (int j = m-i; j >0; j--) {

                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }





}
}
