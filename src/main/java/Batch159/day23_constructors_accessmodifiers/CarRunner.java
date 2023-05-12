package Batch159.day23_constructors_accessmodifiers;

public class CarRunner {

    public static void main(String[] args) {

        //create an object from Car class
        Car car1 = new Car();           //it uses default constructor without parameters. We did not assign any value yet.

        //Whatever we have in a class we can call it like that
        System.out.println(car1.make);      //null
        System.out.println(car1.model);     //null
        System.out.println(car1.year);      //0
        System.out.println(car1.price);     //0


        Car car2 = new Car("Toyota", 2021);
        System.out.println(car2.make);
        System.out.println(car2.year);

        Car car3 = new Car("Toyota", "Civic", 2023, 35000);
        System.out.println(car3.make);
        System.out.println(car3.model);
        System.out.println(car3.year);
        System.out.println(car3.price);

    }
}
