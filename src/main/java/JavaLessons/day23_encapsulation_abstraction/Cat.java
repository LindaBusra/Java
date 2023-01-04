package JavaLessons.day23_encapsulation_abstraction;

public class Cat extends Mammal{


    //Abstraction

    @Override
    public void eat() {

        System.out.println("Cats eat...");
     }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    public void move() {
        System.out.println("Cats move...");
    }

    public void meow() {
        System.out.println("Cats meow...");
    }

}
