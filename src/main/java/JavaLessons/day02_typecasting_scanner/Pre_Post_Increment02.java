package JavaLessons.day02_typecasting_scanner;

public class Pre_Post_Increment02 {


    public static void main(String[] args) {




//Question-1 : What is the final result of a, b, c, d?


        int a = 5;
        int b = 2;
        int c;
        int d;

        c = ++b;
        d = a++;
        c++;
        b = --a;
        a = --c;
        d = b--;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);




//Question-2 : What is the final result of a+b+c+y?
        int x= 10;

        int y=++x;      //y=11, X=11;
        int e=--x;      //e=10, X=10;
        int f= x++;     //f=10, X=11;
        int g= x--;     //g=11, X=10

        System.out.println(e+f+g+y);  //10+10+11+11=42





    }
}
