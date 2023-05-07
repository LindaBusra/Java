package JavaLessons.day11_constructors_methodcall_statickeyword;

public class Car_Repetition {



/*
1-Constructors are used to create object form a clas.
2-Java puts default constructors inside every class.
3-Default constructors does not have no any  parameters   inside the constructor parenthesis
4-Constructor name must match with the class names

How to create a constructor?
1-Type acces modifier
2-Type the class name as constructor name
3-Open-close parenthesis
4-Open curly brace and press enter
5-In a class we can have multiple constructors.

Passive features:variables, active features:methods (in every class we can have variables and methods.)

What are the difference between "constructors" and "methods"?
1-Constructors do not have return type but methods must have.
2-Constructors names must be some with the class name because of you cann not decide constructors name,
but method names can be assigned by developer.
 */

    String make;
    String model;
    double price;
    int year;

//That constructor is same with the default constructor. It is very simple
// Java vil create a reserve area. it name will be model.
// user gave me M4 (model name) M4 is not inside the reserve area.
// you put it just inside the cosntructor. i will get reservt area from the class
//    this.model -->this is my reservt area. and than i will tel  the java.
//   this.model = model; "if there is any data inside the model put it in reserv area.
//after typing that code what will happen?
//when I type this.model=model; and user give me "B4", java put "B4 in the resevrt area.
//If you type that codem it means you put "M4" over here(in heap, in model)



    //it is not inside the resert area.



    public Car_Repetition() {              //when I write this part, default one remote by java

    }

    public Car_Repetition(String make, String model, double price, int year) {
        this.make = make;       //it means in the Vehicle class...
        this.model = model;
        this.price = price;
        this.year = year;


    }



    public static void main(String[] args) {

        Car_Repetition c1 = new Car_Repetition(); //I created an object, car object and I put a name in the object.
        c1.make = "Honda";  //I changed its feature.
        c1.model = "Civic";
        c1.price = 10000;
        c1.year = 2015;
        System.out.println(c1);

        Car_Repetition c2 = new Car_Repetition();
        c2.make = "Audi";
        c2.model = "S5";
        c2.price = 20000;
        c2.year = 2019;

        Car_Repetition c3 = new Car_Repetition("BMW", "M4" , 70000, 2019);
        Car_Repetition c4 = new Car_Repetition("Mercedes", "GLE", 80000, 2022);

    }
}

