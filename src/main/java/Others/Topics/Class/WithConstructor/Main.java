package Others.Topics.Class.WithConstructor;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Black", "Renault Megane", 1.6, 4, "Terje Ringen");   //I created a new object, Class:Vehicle, car1:object name

        car1.showInfos();


        Car car2 = new Car();           //it uses constructor without parameter, and gives default values
        car2.showInfos();

        Car car3 = new Car("Purple", "Civic");
        car3.showInfos();

        //https://www.youtube.com/watch?v=mStBu4YETEo&list=PLIHume2cwmHctrHFHADb0slNyn95x2M4I&index=22

    }
}
