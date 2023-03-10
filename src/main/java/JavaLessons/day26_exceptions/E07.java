package JavaLessons.day26_exceptions;

public class E07 {

    public static void main(String[] args) {


        System.out.println(myMethod());
    }
    public static int myMethod()
    {
        try {
            System.out.println("Hi");
            return 112;

        }
        finally {
            System.out.println("This is Finally block");
            System.out.println("Finally block ran even after return statement");
        }
    }
}
