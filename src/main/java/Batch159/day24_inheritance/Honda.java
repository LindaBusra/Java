package Batch159.day24_inheritance;

public class Honda extends Car{

    public int age = 6;

    public void move(){

        System.out.println("Hondas move...");
    }

    public Honda(){
        super();
        System.out.println("Honda constructor 1");
    }

    public Honda(int a){
        this(); //It takes me to the constructor without parameter in the Honda class
        System.out.println("Honda constructor 2" + a);
    }
}
