package JavaLessons.day08_forloop;

public class ForLoopPatterns13 {

    public static void main(String[] args) {




/*  Type this pattern on the console

   1
  2 2
 3 3 3
4 4 4 4
 3 3 3
  2 2
   1

 */



        int n=4;

        for( int i=1; i<=n; i++) {

            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for(int i=1; i<=n-1; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(" ");
            }
            for(int k=n-i; k>0; k--) {
                System.out.print(n-i+" ");
            }
            System.out.println();
        }


    }
}
