package JavaLessons.day08_forloop;

public class ForLoopPatterns15 {

    public static void main(String[] args) {


    /*  Type this pattern on the console

    0
   1 1
  2 2 2
 3 3 3 3
4 4 4 4 4


  */


        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();



/* Type this pattern on the console


A
B C
D E F
G H I J
K L M N O

*/


        int nn = 5;
        char ch = 'A';
        for (int i = 1; i <= nn; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(ch++ + " ");
            }
            System.out.println();


        }
    }
}