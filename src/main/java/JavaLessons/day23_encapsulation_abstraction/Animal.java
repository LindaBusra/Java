package JavaLessons.day23_encapsulation_abstraction;


    /*
    1)Sometimes no child uses the implementation from the parent class. Therefore  the body part of the method
    in parent class is being unusable.
    If something is unusable we do not want to type it.
    If you dont type the body of a method, you will have "method without body" (Like angles).
    It is called "Abstract Method"

    2)Regular methods (Concreate Methods), methods with body focus on 2 things. i)What to do
    ii)How to do.
    Abstract methods focuses on just "What to do"

    3)If you make a method "abstract" it will be mandatory to override for all child classes.
    like  To do list.

    4)"Abstract method" can be created just "Abstract classses"
    To make a class abstract put "abstract" keyword between access modifier and class keyword.

    5)When you remove method body you have to use "abstract" between the access modifier
    and the "return type" of the method.

    6)It is impossible to create "object" from an "abstract class"
    but it does not mean abstract classes dont have "constructors". They have
    constructors but constructors are not use to create object.

    7)Abstract classes can have "concrete methods" as well.

    8)"Concrete Methods" may or may not be overridden by Child Classes.

    9)"Abstract Methods" can not be put into a non-abstract (Concrete) class.



     */



public abstract class Animal {          //We added abstract, if  a class abstract you can not create an object

    //Abstraction

    public abstract void eat();

    public abstract void drink();

    public abstract void move();



}
