package Others.MyPractice.P3;

public class Q59 {

    public static void main(String[] args) {


                /*
        Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
        Return 0 if they both go over.
        blackjack(19, 21) → 21
        blackjack(21, 19) → 21
        blackjack(19, 22) → 19
        */


        int a = 22, b = 22;

        if (a < 22 & b < 22) {
            System.out.println(Math.max(a, b));
        } else if (a < 22 && b > 21) {
            System.out.println(a);
        } else if (b < 22 && a > 21) {
            System.out.println(b);
        } else if (b > 21 && a > 21) {
            System.out.println(0);
        }
    }
}