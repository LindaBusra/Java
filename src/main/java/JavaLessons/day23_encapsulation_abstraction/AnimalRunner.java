package JavaLessons.day23_encapsulation_abstraction;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat c = new Cat();
//      Animal a = new Animal();        //It is impossible to create "object" from an "abstract class"

        c.eat();
        c.drink();
        c.move();
        c.meow();


    }
}
