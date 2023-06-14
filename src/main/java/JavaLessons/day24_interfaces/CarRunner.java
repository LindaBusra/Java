package JavaLessons.day24_interfaces;

public class CarRunner {
    public static void main(String[] args) {


        System.out.println(Ac.price);

        System.out.println(Brake.price);

        System.out.println(Engine.price);

        System.out.println(Brake.luxury);

//variables with same name, we can call them with interfaces name. Because of that variables are static.
//To call static, use interface name to acces to the value.

        Honda h = new Honda();

        System.out.println(h.calculate());      //it was default, we call it with object
        System.out.println(Ac.climate());       //you call it with interface name. it was static



    }
}
