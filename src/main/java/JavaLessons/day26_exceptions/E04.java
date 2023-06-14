package JavaLessons.day26_exceptions;

import java.io.*;
class E04 {

    void myMethod(int num) throws IOException, ClassNotFoundException {
        if (num == 1)
            throw new IOException("IOException Occurred");
        else
            throw new ClassNotFoundException("ClassNotFoundException");
    }


    public static void main(String args[]) {
        try {
            E04 obj = new E04();
            obj.myMethod(1);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}