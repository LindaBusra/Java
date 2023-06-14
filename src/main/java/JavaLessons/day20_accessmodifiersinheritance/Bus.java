package JavaLessons.day20_accessmodifiersinheritance;

public class Bus extends Motorized{

    public Bus(int numOfPassengers) {

        super(35);
        System.out.println("Bus constructor with integer parameter");
    }
}
