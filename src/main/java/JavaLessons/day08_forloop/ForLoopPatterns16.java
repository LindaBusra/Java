package JavaLessons.day08_forloop;

public class ForLoopPatterns16 {

    public static void main(String[] args) {



//  Type this pattern on the console


/*

   A
  B C
 D E F
G H I J
 K L M
  N O
   P


 */




        int n = 4;
        char ch ='A';

        for(int i=1; i<=n; i++) {

            for(int j=n-i; j>=1; j--) {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print(ch++ +" ");
            }
            System.out.println();

        }

        for(int i=1; i<=n-1; i++) {

            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }

            for(int k=n-i; k>=1; k--) {
                System.out.print(ch++ + " ");
            }
            System.out.println();

        }

    }
}
