package JavaLessons.day18_datetime_class_vararrgs;

public class Varargs05 {

    void m1(int a, int... b){
        System.out.println(b.length);
    }

    void m1(char c, String... d){
        System.out.println(d[0]);
    }

    public static void main(String[] args) {

        int b = 'd';
        Varargs05 vrg = new Varargs05();

        vrg.m1(3, 4,5,6,7);
        vrg.m1('c',75,80,90);
        vrg.m1('d', "hello");
        System.out.println(b);
    }
}
