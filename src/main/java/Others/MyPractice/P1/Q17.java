package Others.MyPractice.P1;

import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {



/*Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

        Input : 30 and 40         --->ikisinide bolenler: 2,5,10   en buyuk ortak bolen :10:GCD
                                  --->ikisinin en kucuk ortak kati: 120:LCM  (240,360 vs de var ama en kucugunu istiyor)
        Expected OutPut:

        GCD for 30 and 40 = 10
        LCM for 30 and 40 = 120       */






        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first Number: ");
        int a = s.nextInt();
        System.out.print("Enter the second Number: ");
        int b = s.nextInt();


        //to find GCD (Greatest Common Divisor) -->GCD for 30 and 40 = 10
        int num = Math.min(a, b);
        int gcd = 0;

        for (int i = 1; i <= num; i++) {

            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD for " + a + " and "+ b + " = " + gcd);






        //to find LCM (Least Common Multiple) -->LCM for 30 and 40

        int lcm1 = (a*b)/gcd;
        System.out.println("LCD for " + a + " and "+ b + " = " + lcm1);

        //or
        int lcm =a*b;

        for(int i=1; i<=lcm; i++ ) {

            if(i%a==0 &&  i%b==0) {

                lcm =Math.min(lcm, i);
            }

        }
        System.out.println("LCD for " + a + " and "+ b + " = " + lcm);
    }
}
