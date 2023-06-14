package Batch159.day26_polymorphism;

public class Cat extends Mammal{

    //right click-->generate-->Override Methods-->select the method you want-->OK

    @Override
    public void eat() {         //access modifier can not be narrower
//        super.eat();        //it means go to the parent, use the eat() method, but we dont need to use it
        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public int move() {     //I can not change return type. if you do not have "Covariant Data Types" return types must be the same
        return 150;
    }


    @Override
    public Integer weight() {       //we can not change  Integer to Short for example. There is no parent-child relationship between them.
        return 300;
    }


    @Override
    public Animal born() {          //We can say Cat, Mammal or Animal
        return new Cat();
    }


}
