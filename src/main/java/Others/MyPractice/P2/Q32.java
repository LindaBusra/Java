package Others.MyPractice.P2;

public class Q32 {

    public static void main(String[] args) {


/* Type this pattern on the console.

1
2 3
3 4 5
4 5 6 7
5 6 7 8 9

   */

        int row = 5;

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print( j  +" ");
            }
            System.out.println();
        }
    }
}
