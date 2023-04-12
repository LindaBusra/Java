package JavaLessons.day08_forloop;

public class ForLoopPatterns17 {
    public static void main(String[] args) {




 /* Type this pattern on the console

  *****
  *   *
  *   *
  *   *
  *****


  */

        int rows =5, columns=5;

        for(int i=1; i<=rows; i++) {


            for (int j = 1; j <= columns; j++) {


                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }





}
}
