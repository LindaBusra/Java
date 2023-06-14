package Others.MyPractice.P2;

public class Q21 {


    public static void main(String[] args) {



 /* Ask user to enter the number of lines of a half pyramid.
    Type a program to create the half pyramid.
    For example if the number of lines is 5, the pyramid will be like;

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/

      int row=5;

      for(int i=0; i<row; i++) {

          for(int j=1; j<=row-i; j++) {

              System.out.print(j + " ");
          }
          System.out.println();
      }













    }
}
