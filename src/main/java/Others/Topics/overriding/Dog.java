package Others.Topics.overriding;

public class Dog extends Mammal{

    @Override //This is Annonarion and checks the Overriding rules.
    //If you do any mistake in Overriding, you will get Compile Time Error
    public void eat() {
        System.out.println("Dogs eat");         //just I uptades body
    }

    public void bark(){
        System.out.println("Dogs bark");
    }
}
