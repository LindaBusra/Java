package JavaLessons.day06_methods_recursion;

public class Methods09 {

    public static void main(String[] args) {
        add(3.0,4.0); // Output A
        add(5, 6); // Output B
        add(7, 8.0); // Output C
        subtract(9, 10); //Output D

        Methods09 obj = new Methods09();
        System.out.println(obj.sumNumber(1, 2));
        System.out.println(obj.sumNumber(1, 2, 3));

    }


    public static void add(double n1, double n2) {
        System.out.println(n1 + n2);
    }

    public static void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public static void subtract(int n1, int n2) {
        System.out.println(n1 - n2);

        /*
        Output A?-->7.0
        Output B?-->11
        Output C?->15.0
        Output D?-->-1
        In what order does Java execute this code?
         */
    }

    public int sumNumber(int a, int b){
        return a+b;
    }

    public int sumNumber(int a, int b, int c){
        return a+b+c;
    }

}

