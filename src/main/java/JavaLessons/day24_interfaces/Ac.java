package JavaLessons.day24_interfaces;


/*
    1)An interface can not have concrete method. all methods in an ineterface should be abstract
    2)All methods in an interface are "public" and "abstract" as default.
    Because of that even you don't declare the methods "public" and "abstract". they will be public and abstract
    public abstract void digital(); and void digital(); are same


    //In classes Ali was confusing because of body. in mother eat(){Vegetarianer); in father eat(){Meet)
    //in interface there is multiply inheritance. because there is no body. eat() is both of them.

    3-If parent interfaces have methods with the same name, overriding just one of them  will be enough.

    4-Parent interfaces cannot have with the same name and the different return types. If you do that,
    java gives you compile time error

    5)Variables in an interface are "public", "static", "final"
    "public sttaic final int price=2300";  and "int price=2300"   are same

    6)Variables in interfaceses are static as default. Therefore no need to create object to access variables
    in interfaces.

    7)Whenever you need to call any variable uses interfaces name to call.

    8)"Class" parent of another "class" I use extends
    "Interface" parent of another "Interface"  I used extends

    "Interface" parents of "Class" -->implement
    "Class" can not be  parent of "Interface"-->impossible. An interface can have just "interface" as parent


 */
public interface Ac extends BigAc {

    void digital();   //Even you write or not it will be public and abstract

    void price();

    int price = 2300;            // I did not type final, but java knows it. when assign a new value, it complaining

    String name = "Perfect AC";     //it is public static final


  /*All methods must be abstract in interface. But developer insist.
  To create concrete method in an interface, you have to options.
  i)use "default" keyword         2)use "static" keyword

   */

    //use "default" keyword
    public default int calculate(){     //if you remove default keyword, java complaining.
        return 12000;
    }

    //use static keyword
    public static boolean climate(){
        return true;
    }

    //if you dont use default pr static keyword you can not put body.


}
