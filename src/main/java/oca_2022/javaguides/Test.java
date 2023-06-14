package oca_2022.javaguides;

public interface Test {


    public static void method1() {
        System.out.println("method1");
    }

    public
    default void method2() {
        System.out.println("method2");
    }

    public static void method3() {
        System.out.println("method3");
    }

    public abstract void method4();
}


/*
Which statement is true?
A) Only method4() compiles
B) Only method2() and method4() compiles.
C) Only method2(), method3(), and method4() compiles.
D) Test.java compiles.
 */