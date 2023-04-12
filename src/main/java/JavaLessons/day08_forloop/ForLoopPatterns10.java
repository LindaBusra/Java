package JavaLessons.day08_forloop;

public class ForLoopPatterns10 {

    public static void main(String[] args) {



        /*  Type this pattern on the console


             *
            * *
           * * *
          * * * *
         * * * * *
         */


        int n =5;

        for( int i=1; i<=n; i++) {

            for(int j=n-i; j>0; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }










    }
}
