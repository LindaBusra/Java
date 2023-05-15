package Batch159.day24_inheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat c1 = new Cat();     //Cat() default constructor
        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.eat();
        d1.drink();
        d1.bark();

        //Object class is parent of Animal. When we write d1.  we can see all methods that we can use from Object class
    }
}
