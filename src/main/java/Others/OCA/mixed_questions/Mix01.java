package Others.OCA.mixed_questions;

public class Mix01 {
    public static void main(String[] args) {


        //Question:What is the output?
        String s = new String("hello");
        String s2 = "hello";

        if (s == s2) {
            System.out.println("==");
        }

        if (s.equals(s2)) {
            System.out.println("equals");
        }











        //Question:What is the output?

        String m = new String("hello");
        String m2 = m;

        if (m == m2) {
            System.out.println("==");
        }

        if (m.equals(m2)) {
            System.out.println("equals");
        }




        //Question:What is the output?

        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);



        //Question:What is the output
        int a = 10;
        int b = 20;

        if (++a <= 10 && --b < 20) {}
        System.out.println("Output of && operator: "
                + "a = " + a + " b = " + b);
        System.out.println("-------------");

        a = 10;
        b = 20;
        if (++a <= 10 & --b < 20) {}
        System.out.println("Output of & operator: "
                + "a = " + a + " b = " + b);


    }
}
