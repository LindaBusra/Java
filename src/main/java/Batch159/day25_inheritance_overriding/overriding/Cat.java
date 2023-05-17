package Batch159.day25_inheritance_overriding.overriding;

public class Cat extends Mammal{

    public int age =14;
    public String name = "Tom";
    public boolean old =false;
    public double x =2.3;

    public Cat(){

        System.out.println(this.age);
        System.out.println(super.age);
    }
}
