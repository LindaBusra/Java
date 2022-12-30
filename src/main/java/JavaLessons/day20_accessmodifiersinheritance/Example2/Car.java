package JavaLessons.day20_accessmodifiersinheritance.Example2;

public class Car extends Motorized{




    public Car(String make) {
        super(16); //it means go to the parent
        System.out.println("Car constructor with String parameter");
    }

    public Car(int price) {
        super(20);
        System.out.println("Car constructor with integer price");
    }
}
