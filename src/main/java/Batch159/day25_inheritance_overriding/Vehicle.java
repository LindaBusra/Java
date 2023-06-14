package Batch159.day25_inheritance_overriding;

public class Vehicle {
    /*
    1)Every class except from "Object Class" has parent class
    2) Object Class is the "Parent Class" of all Classes in Java.
    3) Just "Object Class" does not have any "Parent Class" in Java.
    4)Java executes constructors from top to bottom in inheritance
    5)To be able to execute constructors from top to bottom Java goes to the Object Class first by the help of super().
    6) super() is for calling constructor from the first level "parent class"
    7) super() is located by Java into every constructor but it invisible to us.
    8) If you want to make it visible, you can type it explicitly
    9) When you type "super()" explicitly you have to type it into the first line inside the constructor body.
    10) "this()" is for calling constructors from the class itself.
    11) When you type "this()", you have to type
    12) this() and super() cannot be used in the same constructor together, because if you put anyone of them in the first line
    the other one cannot be put in the first line
     */

    public void move(){
        System.out.println("All vehicles move...");
     }

    public void pricing(){
        System.out.println("To buy a vehicle you should pay the price...");
    }


    public Vehicle() {
        super();    //we can not use super() and this() in the same, first line.
        System.out.println("Vehicle Constructor...");       //to make it visible I added a message
    }


    public Vehicle(String name){
        this(); //it must be first line
        System.out.println("Vehicle constructor with String parameter...");
    }

    }


