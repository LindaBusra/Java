package Batch159.day32_exceptions;

public class Exceptions04 {

    public static void main(String[] args) {

    /*  Application communicate with database. Every minute you connected with database and work with data you pay money. (Almost all databases are in cloud.)
    After completing our task we should cut the connection from database. For every scenario I have to cut connection.

        1)finally block is used for the codes will be executed for every scenario
          like cutting connection with the database
        2)Could you please explain "final", "finally", and "finalize"
                "final": We learned this
                    Final Variable: to create constant variables
                    Final Methods : Prevent Method Overriding
                    Final Classes: Prevent Inheritance

                "finally": finally keyword is used with try-catch blok to provide statements, it is executed under every condition
                "finalize": It is a method, it is used before destroying data in memory by Garbage Collector.
                finalize() method is executed by Garbage Collector before the object is destroyed.

                Garbage collector scans the memory constantly. it finds some ting to throw to trash, java puts these tings in a package
                and destroys it. Putting throwable data in to a package is called finalize. Before destroying data java finalize data like
                put in to a package.
                java decide when it is used, where it is used, but you can also use it. To keep memory clean, use finalize method
                and garbage collector is javas task.
     */

        System.out.println(divide(6,2));
        System.out.println(divide(6,0));


    }
    //Example 1: Create a method divides to integers
    public static int divide(int a, int b) {

        try{
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());     // technical message: / by zero
            return 0;
        } finally {
            System.out.println("The operation is completed");   //it is executed under every condition
        }

    }
}
