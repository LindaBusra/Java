package JavaLessons.day02_typecasting_scanner;

public class Pre_Post_Increment04 {


    public static void main(String[] args) {


        //Question 1- What is the sum of a+b+c+d

        int a = 5;
        int b = 2;
        int c;
        int d;

        c = ++b;            //c=3, b=3
        d = a++;            //d=5, a=6
        c++;                //c=4
        d = b--;            //d=3, b=2
        b= a++;             //b=6, a=7
        c = --b+ (--a);     //c=5+6=11,  b=5,  a=6


        System.out.println(a+b+c+d);    //6+5+11+3=25
    }
}
