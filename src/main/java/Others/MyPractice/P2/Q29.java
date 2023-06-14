package Others.MyPractice.P2;

public class Q29 {


    public static void main(String[] args) {


/*Question-2-- Check PERFECT NUMBER using for Loop
A perfect number is a number that is equal to the sum of its positive divisors
(excluding the number itself). For example, 6, 28, 496 etc. are perfect number
*/


        int num= 496;

        int sum = 0;

        for( int j=1; j<num; j++) {

            if(num%j==0) {

                sum += j;
            }
        }


        if(sum==num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println("It is not a perfect number");
        }
    }
}
