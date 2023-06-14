package JavaLessons.day12_staticblock;


/*
1-if you don't assign any value for "static" and "non-static" variables"
java assigns "default values2 to them but java doesn't assign default value for
local variables. (Because of that local variable is complaining.)

2-Default values are "0" for numeric data types, it is "null" for String. it is false
for boolean.

 */

public class StaticBlock01 {

/*
    /*
        1)Java Class Loader makes the classes ready to use
        2)When the classes make ready, class members are loaded according to some order.
          main method is the first to be loaded normally
        3)Sometimes we need something to be loaded before main method, for this scenario we use "static block".
          The codes inside the "static block" is executed before everything in the class, even before main method.
        4)Rule: "static" structures can work just with static class members.
                Do not put non-static class members into static method, it will give error
        5)"static block" can be used just with "static" variables, because of the rule in 4th step
        6)"static block" is used to initialize(assigning first value) "static variables"

        Note: When we create a variable inside the main method, we do not use "static" keyword, because
              Java knows everything inside the main is "static"
    */




    public static double pi;        //0.0  This is not local. so it is not compile.


    public static void main(String[] args) {

        System.out.println("This is main method");
        System.out.println(pi);

    }

    static{
        System.out.println("This is static block 1");
        pi=3.14;    //initializing pi variable
    }

    static{
        System.out.println("This is static block 2");

    }


//java class loader: makes the class ready to use for you.
//inside the class : main method and (variables, methods), static block
//it writes: 1-static block 2-main method 3-variables ve methods
//if there is 2 static block it writes from top.










    }











