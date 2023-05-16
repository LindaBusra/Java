package Batch159.day24_inheritance;

public class Civic extends Honda {

    public int age = 4;

    public void move(){

        System.out.println("Civics move...");
    }

//    public Civic(){
//
//        System.out.println(this.age);      //this.age means  age variable from this class   4
//        System.out.println(super.age);      //super.age means  age variable from parent class  6  (just from parent, not from grandparent)
//
//        this.move();        //move() from this class  -->Civics move...
//        super.move();       //move() from Honda class -->Hondas move...
//    }

    public Civic(){
        super();        //go to the parent
        System.out.println("Civic constructor 1");
    }

    public Civic(int a){

        super(6);   //It takes me to the constructor with int parameter in the Honda class
        System.out.println("Civic constructor 2: " + a);
    }
}
