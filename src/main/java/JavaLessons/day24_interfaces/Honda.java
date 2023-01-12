package JavaLessons.day24_interfaces;

//For interface

public class Honda implements Ac, Brake, Engine{

//we used implement keyword in stedet for extends keyword.


    @Override
    public void digital() {
        System.out.println("This is digital AC");
    }

    @Override
    public void secureBrake() {
        System.out.println( "it stops securely");
    }

    @Override
    public void ecoEngine() {
        System.out.println("This is eco engine");
    }

    @Override
    public void price() {           //three of them are same.
        System.out.println("Brake Price");
    }



}
