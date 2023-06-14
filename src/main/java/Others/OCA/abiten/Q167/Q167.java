package Others.OCA.abiten.Q167;

public class Q167 {

    public static void main(String[] args) {


        int x= 100;
        int a=x++;
        int b=++x;
        int c=x++;
        int d= (a<b)? (a<c)? a: (b<c) ? b: c: x;
        System.out.println(d);



    }

    /*
        int x= 100;
        int a=x++;   a=100 x=101
        int b=++x;   b=102 x=102
        int c=x++;  c=102 x=103
        int d= (a<b)? (a<c)? a: (b<c) ? b: c: x;
        if

        (a<b)? (a<c)? is true, so result is a -->100
        if it is false the result is x-->103

     */

}
