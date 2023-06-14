package Others.Topics.Class;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();   //I created a new object, Class:Vehicle, car1:object name


        car1.setColor("Black");         //It was private. set:set value, get: bring it
        car1.setOwner("Terje Ringen");


        car1.model = "Renault Megane";
        car1.engine =1.6;
        car1.setDoors(1);           //!!!


        System.out.println("The owners of car: "  + car1.getOwner());
        System.out.println("The colors of car: "  + car1.getColor());
        System.out.println("The model of car: "  + car1.model);
        System.out.println("The engine of car: "  + car1.engine);
        System.out.println("The doors of car: "  + car1.getDoors());
        car1.start();
        car1.stop();


        //public: it is accessible form everywhere.
        //private:it is accessible just from class.


    }
}
