package JavaLessons.day21_inheritance;

public class Car {


    public void Engine(){
        System.out.println("All cars have engine...");

    }

    public Car() {
        System.out.println("Car class constructor 1");
    }

    public Car(String engineType) {
        System.out.println(engineType);
    }


    public Car(int engineSize) {
        this("Gas");                // // constructor with String selected
        System.out.println(engineSize);
    }

    public Car(String engineMake, int enginePrice) {
        this(5000);                 // constructor with int selected
        System.out.println(engineMake + " - " + enginePrice);
    }


//task:When I create car object I have to select : 1-Engine Type, 2-Engine Size 3-Engine Make and Price





}



