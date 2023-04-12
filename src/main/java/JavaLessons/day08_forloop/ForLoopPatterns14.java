package JavaLessons.day08_forloop;

public class ForLoopPatterns14 {

    public static void main(String[] args) {




        /*  Type this pattern on the console


         * * * *
          * * *
           * *
            *

         */


        int n=4;
      for(int i=0; i<n; i++) {

          for(int j=0; j<i; j++) {
              System.out.print(" ");
          }
          for(int k=n-i; k>0; k--) {
              System.out.print("* ");
          }
          System.out.println();
      }


//------------------------------------------------------------------------------------------


 /*  Type this pattern on the console

A
A B
A B C
A B C D
A B C D E

  */


        int row=5;

        char ch = 'A';

        for(int i=1; i<=row; i++) {
            ch ='A';
            for(int j=1; j<=i; j++) {

                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }



        //or
        int x = 65;

        for(int i=1; i<=row; i++) {

            for(int j=1; j<=i; j++) {
                System.out.print((char)(x+j-1) + " ");
            }
            System.out.println();
        }
    }
}
