package JavaLessons.day02_typecasting_scanner;

public class Pre_Post_Increment02 {


    public static void main(String[] args) {




//Question-1 : What is the final result of a, b, c, d?


        int a = 5;
        int b = 2;
        int c;
        int d;

        c = ++b;        //c=3  b=3
        d = a++;        //d=5; a=6
        c++;            //c=4;
        b = --a;        //b=5;  a=5;
        a = --c;        //a=3; c=3;
        d = b--;        //d=5; b=4


        System.out.println(a);      //3
        System.out.println(b);      //4
        System.out.println(c);      //3
        System.out.println(d);      //5




//Question-2 : What is the final result of a+b+c+y?
        int x= 10;

        int y=++x;      //y=11, x=11;
        int e=--x;      //e=10, x=10;
        int f= x++;     //f=10, x=11;
        int g= x--;     //g=11, x=10

        System.out.println(e+f+g+y);  //10+10+11+11=42





    }
}
