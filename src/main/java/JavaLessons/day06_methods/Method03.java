package JavaLessons.day06_methods;

public class Method03 {
    public static void main(String[] args) {


        System.out.println( substractFour(addTwo(multiplyWith3(4))) );

    }


    public static int multiplyWith3(int a) {

            return 3*a;
    }


    public static int addTwo(int a) {

        return a+2;
    }


    public static int substractFour(int a) {

        return a-4;
    }




    }
