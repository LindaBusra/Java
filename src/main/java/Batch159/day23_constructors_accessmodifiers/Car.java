package Batch159.day23_constructors_accessmodifiers;

public class Car {          //this is my template

    //Methods have "return type" but Constructors do not have
    //Methods can use any name, Constructors must use Class name as name


    public String make;
    public String model;
    public int year;
    public int price;


    //First we create template-->after object-->with object we can do actions
    //From a single template I can create many different objects

    //actually it creates from java automatically
    public Car(){

    }


    //right click-->Generate-->Constructor-->choose values you will put in constructor
    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }


    public Car(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }
}
