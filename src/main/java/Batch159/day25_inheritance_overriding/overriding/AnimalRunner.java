package Batch159.day25_inheritance_overriding.overriding;

public class AnimalRunner {
    public static void main(String[] args) {

        /*
        1) If a variable exists in a class Java uses the variable from the class itself
        2)If a class does not have the requested variable in it Java looks for the variable from the parent classes
        3)If you use "this" inside the constructor, it means you are calling a variable from the same class.
        3)If you use "super" inside the constructor, it means you are calling a variable from the first level parent class.

         What is the difference between "this()" and "super()" ?
         "this()" is used to call constructor from the class itself
         "super()" is used to call constructors from the first level parent class

         What is the difference between "this" and "this()" ?
         "this()" is used to call constructor from the class itself
         "this" is used to call a variable from the same class

         What is the difference between "super" and "super()" ?
         "super()" is for calling constructors from the first level parent class
         "super" is for calling variable from the first level parent class                */


        Cat myCat = new Cat();    //output is 14 and 6 I call the Cat();
        System.out.println(myCat.initial);  //A, Cat class does not have variable initial, so it goes to
                                            // parent class, Mammal and fetches the data from there
        System.out.println(myCat.age);      //14, Cat class has the variable age already, so no need to use parent class variable


        //When you create an object you can select the data type of the object from the class itself or from any parent class

        Object cat0 = new Cat();

        //When you select a variable in inheritance, focus on "data type of the object"
        //the variable will be looked for starting from the class used "data type of the object"

        Animal cat1 = new Cat();
        System.out.println("Data type is Animal: " + cat1.age);

        Mammal cat2 = new Cat();
        System.out.println("Data type is Mammal: " + cat2.age);
        System.out.println(cat2.name);      //Takes from parent class

        Cat cat3 = new Cat();
//        Cat cat4 = new Mammal();   or Cat cat5 = new Animal();   not possible
        System.out.println("Data type is Cat: " + cat3.age);

    }
}
