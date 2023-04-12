package JavaLessons.day08_forloop;

public class ForLoopPatterns06 {
    public static void main(String[] args) {




 /*  Example - Type code for this pattern

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

  */

        int row=5;            //row

        for(int i=1; i<=row; i++) {

            for(int j=1; j<=row; j++) {
                System.out.print( j +" ");
            }
            System.out.println();
        }


//----------------------------------------------------------




/*  Example - Type code for this pattern



1
2 3
4 5 6
7 8 9 10


 */



    int rows=4, k=1;


      for(int i=1; i<=rows; i++) {

          for(int j=1; j<=i; j++){

              System.out.print(k++ + " ");
          }
          System.out.println();
      }
        System.out.println();


      //or

        int a=1;

        for(int i=1; i<=rows; i++) {

            for(int j=1; j<=i; j++) {

                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }


}
}
