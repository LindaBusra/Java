package JavaLessons.day20_accessmodifiersinheritance.Example2;

public class Motorized extends Vehicle{

    public Motorized(int capacity) {

        super("Be careful");            //java put that one default. it is invisible. if you type it  is visible
        System.out.println("Motorized constructor with integer parameter");

        //if we have constructor without parameter in Vehicle,  super() is default here. But if we have a cosntructor with parameter
        //we have to super here.

        //default super() is just unparametirazed constructor
        //if I write super("Be careful");  it means java does not use default constructor, use this one

    }

}