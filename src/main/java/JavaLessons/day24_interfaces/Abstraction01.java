package JavaLessons.day24_interfaces;

public abstract class Abstraction01 {


    /*
    "final" keyword is very important in Java.
    1)"final" keyword can be used for variables.
        public final int age=12;   (final variable)-->
        -If you make a variable final, you can not change its value.
        -"final variables" must be initialized.  --> public final double pi;  it complaining
        pi++;  //Can not assign a value to final variable "pi"

    2)"final" keyword can be used for methods.
        "final methods" body can not be updated.

    3)"final" keyword can be used for classes.
        "final classes" can not have child classes.  Because a child cannot inherit from final

    Note:"Abstract classes" have something to do for child classes. If there is no child class,
    having to do list is not sensible. "final classes" can not have child classes. Therefore Java does
    not allow to make an  abstract class final.

    // public final abstract int add(); it is complaining. Final method body will be under protection by Java.
    Because it shouldn't be updated.
    But abstract methods do not have body, Java will look for the body to protect when it could
    not find it will complain.




     */


    public int age;
    public final double pi = 3.14;
    public abstract int add();


   //private abstract int add();      //Illegal combination of modifiers: 'abstract' and 'private'
    //if we use abstract we can not use private.

}

