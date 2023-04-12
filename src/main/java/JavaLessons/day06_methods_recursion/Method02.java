package JavaLessons.day06_methods_recursion;

public class Method02 {
    public static void main(String[] args) {

        System.out.println(addIntegers(25,56));
        System.out.println(addIntegers(2,9));

        add(5,8);
        add(-8,-7);

    }


    public static int addIntegers (int a, int b) {

        return a+b;
    }


    public static void add(int a, int b) {
        System.out.println(a+b);
    }
}
