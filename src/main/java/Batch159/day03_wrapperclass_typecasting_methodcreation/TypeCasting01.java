package Batch159.day03_wrapperclass_typecasting_methodcreation;

public class TypeCasting01 {

    public static void main(String[] args) {

        // byte - short - int - long - float - double ==> Do AutoWidening
        //byte to short.  -->convert small data type to large data type is easy.
        byte b = 25;
        short s = b;
        System.out.println(s);  //25

        int k = 8900;
        long h= k;
        System.out.println(h);  //8900

        long l = 456;
        double d = l;
        System.out.println(d);  //456.0

        // byte - short - int - long - float - double ==> ExplicitNarrowing
        //long to int.  -->convert large data type to small data type have risk.
        long n = 5674;
        short m = (short)n;     //short m = n; -->it is complaining

        float f = 12.78F;
        int i = (int)f;
        System.out.println(i);// 12

    }

}
