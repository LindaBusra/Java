package Others.MyPractice.P2;

public class Q24 {

    static int deger = 0;

    public static void main(String[] args) {


/* Type this pattern on the console

 *
 * *
 *   *
 *     *
 * * * * *


 */




        //1.way
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 2 && j == 1) {
                    System.out.print("  ");
                } else if (i == 3 && j == 1) {

                    System.out.print("  ");
                } else if (i == 3 && j == 2) {

                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }


        System.out.println();



        //2.way
        System.out.println("Enter a number :");
        int num = 5;
        // int num = scanner.nextInt();
        System.out.println("* ");

        for (int i = 0; i < num; i++) {

            if (i != num - 1) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("* ");
                    for (int k = 0; k < i; k++) {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int k = 0; k <= i + 1; k++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


        System.out.println( );



        //3.way
        System.out.println("*");
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println(" *");
            deger = i + 3;
        }
        System.out.print("*");

        for (int k = 1; k < deger; k++) {
            System.out.print(" *");
        }


    }
}