package Batch159.day24_inheritance;

public class Vehicle {

    /*
    1-Variables and methods with the same name in inheritance come from bottom to top
    2-"this" keyword is for getting variable value from the class itself or calling method from the class itself.
    3-"super" keyword is for getting variable value from the parent class or calling method from the parent class.
    4-Java runs the constructors from top to down in inheritance, because without having a child
    it is impossible to have child
    5- "super()" is for calling constructor from first level parent class
    6-"super()" exist as default in every constructor, normally it is invisible, if you want you can type it explicitly
    7-By putting appropriate parameters inside the "super()" parenthesis, you can select whatever constructor you want
    from the parent class.
    8- "this()" is for calling constructors from the class itself.

     */

    public int age=12;

    public void move(){

        System.out.println("Vehicles move...");
    }

    public Vehicle(){
        super();        //it is optional to write it
        System.out.println("Vehicle constructor 1");
    }

    public Vehicle(int a){
        this(); //It takes me to the constructor without parameter in the Vehicle class
        System.out.println("Vehicle constructor 2" + a);
    }
}
