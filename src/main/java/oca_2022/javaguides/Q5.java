package oca_2022.javaguides;

import java.io.Closeable;
import java.io.IOException;

public class Q5 {

    public static void main(String[] args) {
        try (MyResource1 r1 = new MyResource1(); MyResource2 r2 = new MyResource2();) {
            System.out.print("try ");
        } catch (Exception e) {
            System.out.print("catch ");
            for (Throwable t: e.getSuppressed()) {
                System.out.println(t.getClass().getName());
            }
        }
    }


}


class MyResource2 implements AutoCloseable {
    public void close() throws IOException {
        System.out.print("r2 ");
        throw new IOException();
    }
}


class MyResource1 implements Closeable {
    public void close() {
        System.out.print("r1 ");
    }
}


/*
What is the result?
A) try r2 r1 catch java.io.IOException
B) try r2 r1 catch   +
C) try r1 r2 catch
D) Compilation fails.
 */