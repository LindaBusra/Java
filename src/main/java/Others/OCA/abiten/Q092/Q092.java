package Others.OCA.abiten.Q092;

public class Q092 {

    public static void main(String[] args) {

        //line n1
        Integer x = new Integer("1");
//        byte x = 1;
//        short x = 1;


        switch (x) {

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }
}

/*
Which three code fragments can be independently inserted at line n1 to enable the code to print One?
(Choose three.)
A. byte x = 1;          +
B. short x = 1;         +
C. String x = "1";
D. long x = 1;
E. double x = 1;
F. Integer x = new Integer("1");    +
Answer: A B F
 */