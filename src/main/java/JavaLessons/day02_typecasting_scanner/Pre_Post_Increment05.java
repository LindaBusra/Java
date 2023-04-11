package JavaLessons.day02_typecasting_scanner;

public class Pre_Post_Increment05 {
    public static void main(String[] args) {



        int a = 12;

        int b = a++;            //b=12, a=13

        System.out.println(b);  //12
        System.out.println(a);  //13


        int x = 15;
        int y = x--;            //y=15; x=14
        System.out.println(x);  //14
        System.out.println(y);  //15


        int m = 21;
        int n = ++m;            //n=22, m=22
        System.out.println(m);  //22
        System.out.println(n);  //22


    }
}
