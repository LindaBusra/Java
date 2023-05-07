package JavaLessons.day11_constructors_methodcall_statickeyword;

public class Car {


/*When you create a class you will use it to create an object most probably.
because of that when you create a class Java puts constructor in it automatically.
Its name is default constructors are invisible.

If you create your own constructor, java deletes the "Default Constructor";

How to create constructor?
-Constructor name must match with the class name.

What is the different between "Constructors and methods"
1-Constructors do not have return type but methods have.
2-Constructor name must match with the class name buts method name can be any name.
3-Constructor are used to create object but methods are used to create some actions.


*/
    String make = "Toyota";
    String model = "Prius";
    int year = 2020;
    int price =20000;


    public Car() {

        System.out.println("Vehicle constructor 1");

            }

    public Car(String make,String model,int year, int price ) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;


    }

    public Car(String make,String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }

    }

