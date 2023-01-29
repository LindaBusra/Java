package JavaLessons.day05_concatenation_modulus_nestedternary;

public class NestedTernary05 {


    public static void main(String[] args) {


        int k = 112;

        System.out.println((k>5)? 21 : "Zebra");    //21


//----------------------------------------------------------------------

        int y = 112;

        System.out.println((y < 91) ?  9 : "Horse" );


//----------------------------------------------------------------------

        int m = 11;
        int n = 11;

        int result = m<10 ? m++ : n++;
        System.out.println(result + "," + m + "," + n);


//----------------------------------------------------------------------


        int a = -16 ;
        int z = -7;

        System.out.println(a<2 ? a <-1 ? z <-5 ? a <-1 ? z<5 ? 4 : 10 : -2 :  8 : 7  : 10);

//----------------------------------------------------------------------
    }
}
