package Batch159.day25_inheritance_overriding;

public class Honda extends Vehicle {

    public void brake(){
        System.out.println("Honda stops securely...");

    }

    public void engine(){
        System.out.println("Honda uses perfect engine...");
    }

    public Honda() {
        super();  //go to parent class and use constructor from parent class, it must be first line in constructor
        System.out.println("Honda Constructor");
    }

    public Honda(int year){
        super("Luxury Honda");
        System.out.println("Honda constructor with int parameter...");
    }
}

