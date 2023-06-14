package Batch159.day25_inheritance_overriding;

public class Civic extends Honda{

    public void ecoSystem(){
        System.out.println("Using Civic is not expensive...");
    }

    public Civic() {
        super(2023);
        System.out.println("Civic constructor");
    }

    public Civic(boolean hybrid){
        this();  //go to constructor in this class  //super(2021); go to parent class, get constructor with int parameter
        System.out.println("Civic constructor with boolean parameter...");
    }
}
