package Others.OCA.Q210;

import java.util.function.Predicate;

public class Q210 {
    public static void main(String[] args) {


        Predicate<Integer> p = (n) -> n % 2 == 0;
        //insert code here


//which code snippet at line 9 prints true?

        //A.
//        Boolean s=p.apply(101);
//         System.out.println(s);


        //   B.
//        Boolean s = p.test(100);
//        System.out.println(s);

        //C
//        Integer s=p.test(100);   //Boolean
//        if(s==1){
//            System.out.println("false");
//        }else{
//            System.out.println("true");
        }

        //D
// System.out.println(p.apply(100));
    }

/* A.Option A
   B. Option B
   C. Option C
   D. Option D
   answer B
*/