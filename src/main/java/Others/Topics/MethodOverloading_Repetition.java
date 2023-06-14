package Others.Topics;

public class MethodOverloading_Repetition {
    public static void main(String[] args) {

/*

1-If you use a method inside the main method use "static" keyword between access modifier and return type.


/*if you have multiply methods whose names are same, java looks at the parameters
to select a specific method.
a)To select number of parameters are important
b)To select data types of parameters  are important

2-If you have multiple methods with the same name in a class, it is called "Method Overloading"
  How can you achieve method overloading?
a-create method with the same name
b-use the different parameters
        -change the number of parameters
        -change the data type of parameters
        -if the data types are different, you can change their places
under the general name (add), we have more topics. otherwise we have a lot of names for sam functionality. for example

 */


//less work + exact match

        //add(3,5) is called "Method Call" in Java

        System.out.println(add(3,5));          //1. methodu kapatirsam, 3. metotta calisir. auto Widening, daha buyuk kutuya koyuyoruz

        System.out.println(add(3,5, 8));    //sadece 2.methodda calisir, cunku 3 degerli

        System.out.println(add(3.5, 5.2));     //3.methodu kapatirsam calismaz, cunku double int'e sigmaz

        System.out.println(add(4, 3.4));       // just works in 3. method

        System.out.println(add(5, 5.6));        //(3-4 arasindan 4.yu  tercih eder, exact match, less work) 4.methodu kapatirsam, sadece 3. methodu kullanabilir

        System.out.println(add(5.4, 3));        //(ilk tercih 5, exact match, less work)  (3 ve 5'te calisir)

    }


    //create an add method which adds to integers

    public static int add(int a, int b) {               //1.method
        return a+b;
    }

    //create an add method which adds 3 integers
    public static int add(int a, int b, int c) {        //2.method
    return a+b+c;
        }

    //create an add method which adds to doubles
    public static double add(double a, double b) {      //3. method
        return a+b;
    }

    //Create an add method which adds 1 integer, 1 double

    public static double add(int a, double b) {         //4.method
        return a+b;
    }
//larger data type is data type of the result !


    //Create an add method which adds 1 double and 1 integer

    public static double add(double a, int b) {         //5.method
        return a+b;
    }
//larger data type is data type of the result !

}
