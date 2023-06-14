package JavaLessons.day20_accessmodifiersinheritance;

public class Car extends Motorized{




    public Car(String make) {
        super(16); //it means go to the parent
        System.out.println("Vehicle constructor with String parameter");
    }

    public Car(int price) {
        super(20);
        System.out.println("Vehicle constructor with integer price");
    }
}
