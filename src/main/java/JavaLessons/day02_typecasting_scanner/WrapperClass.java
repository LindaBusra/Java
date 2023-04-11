package JavaLessons.day02_typecasting_scanner;


import java.sql.SQLOutput;

public class WrapperClass {
    public static void main(String[] args) {


        /*
        Wrapper Class  :

        Java created a new structure which has "primitive value" and "methods" together.
        That new structure is called "Wrapper class"


        Non-primitives have "methods" together with values.
        We can do many actions by using "methods", thi is good.
        But primitive do not have any "methods" because of that we can not any actions in primitive.

        Wrapper classes are "non-primitive data types. non primitives start by upper cases.

        Primitive   Wrapper Class
        byte        Byte
        short       Short
        int         Integer
        long        Long
        float       Float
        double      Double
        boolean     Boolean
        char        Character

        //Note: MIN_VALUE, MAX_VALUE, SIZE are "constant variables" that contains "constant value"
        //If a variable has a constant value use just wrapper class by typing the initial in uppercase only
        // and use the constant variable in uppercase only nad adding "_" between the multiple words.

         */

        System.out.println(Byte.MIN_VALUE);  //-128
        System.out.println(Integer.SIZE); //32
        System.out.println(Short.MIN_VALUE + Short.MAX_VALUE);  //-1

        int i = 12;  //There is no method
        Integer k = 13;


        char c = 'A';   //primitive
        Character d = 'A';   //Character.


        //autoboxing :  to convert "primitive data" to "wrapper class" of the primitve data
        byte b =23;
        Byte wb = b;


        //Unboxing : To convert "wrapper class" to its "primitive data"
        Short ws= 34;
        short s = ws;



    /*
    Wrapper Class
    Primitive data types does not have any action, they have just values. They created by java.
    primitive dont have any methods. Because of that we can not do any actions with primitives.

    Non-primitive data types has action. They created by human / programmers. They have methods,
    this is useful and good. We can do many actions by using 'methods'.

    Java created a new structure which has "primitive value" and "methods" together.
    That new structure is called "Wrapper class"

    We can add methods to primitive data types and by adding methods
    they become non-primitive.!!!!
     */


        int ii =12;  //there is no method, just value... it is primitive.
        Integer kk = ii; //  there are many methods in the coding.
        System.out.println(kk);      //12


        char cc = 'A';
        Character dd = 'A';  //
        System.out.println(dd);      //A


//Autoboxing :  To convert "primitive data" to  "wrapper class" data type.
//Autoboxing is convert char to Character, for example


        byte bb= 23;  //close to add any actions/methods
        Byte wbb = bb;  // the poeng is to addition of the methods. We say to java, I have one container,
        // it is not open to the actions. I want to give some actions to it.



//Unboxing :  To convert "wrapper class" to its primitive data"

        Short wss = 34;  //open to be added the methods.
        short ss = wss;   //container is closed to add methods.




//How to get the minimum and maximum values of numeric data?
        System.out.println("Integer max value is " +Integer.MIN_VALUE);
        System.out.println("Integer min value is " + Integer.MAX_VALUE);
        System.out.println("Byte max value is " + Byte.MAX_VALUE);
        System.out.println("Byte min value is " + Byte.MIN_VALUE);
        System.out.println("Character max value is " + Character.MAX_VALUE);
        System.out.println("Character min value is " + Character.MIN_VALUE);

    }
}
