package Others.OCA.abiten.Q142;

public class Q142 {
    public static void main(String[] args) {

        int wd = 0;
        String days[] = {"sun", "mon", "wed", "sat"};
        for (String s: days){
            switch (s){
                case "sat":
                case "sun":
                    wd-=1;
                    break;
                case "mon":
                    wd-=1;
                    break;
                case "wed":
                    wd+=2;
            }
        }
        System.out.println(wd);




        System.out.println("version 2");

   int wdd = 0;
        String day[] = {"sun", "mon", "wed", "sat"};
        for (String s: day){
           switch (s){
                case "sat":
                 case "sun":
                   wdd-=1;
                   break;
                case "mon":
                   wdd++;

                case "wed":
                    wdd+=2;
            }
         }
         System.out.println(wdd);



    }

}
/*
* What is the result?
A. 3
B. 0
C. Compilation fails.
D. -1  +
*Answer: D
*
* */

/*

 * /*
 * * What is the result?
 * A. 3
 * B. 4
 * C. -1
 * D. Compilation fails.
 * Answer: C ??
 * * */