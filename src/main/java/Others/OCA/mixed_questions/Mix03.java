package Others.OCA.mixed_questions;

public class Mix03 {

    public static void main(String[] args) {


        System.out.println(fun());
    }
    static int fun() {
        return 20;
    }

    /*
    non-static methods cannot be called in a static method without creating an object. If we make fun() static
    OR If we create an object of the Main class and then call the method on that object then the program compiles fine without any compiler error.
     */



    /*

    class Main {
    public static void main(String args[]) {
        System.out.println(fun());
    }
    int fun() {
        return 20;
    }
}
    Output: Compiler Error               */





    /*

        // filename Main.java
    class Main {
        public static void main(String args[]) {
              Main obj = new Main();
            System.out.println(obj.fun());
        }
        int fun() {
            return 20;
        }
    }

    // Output: 20            */





    /*

        // filename Test1.java
    class Test1 {
       public static void main(String args[]) {
           System.out.println(fun());
       }
       static int fun() {
           static int X= 0;         //static local variables are not allowed in Java.
           return ++X;
       }
    }

    Output: Compiler Error              */





/*

    class Test1 {
        private static int X;
        public static void main(String args[]) {
            System.out.println(fun());
        }
        static int fun() {
            return ++X;
        }
    }
// Output: 1                 */



    }

