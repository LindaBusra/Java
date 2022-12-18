package JavaLessons.day11_constructors_methodcall_statickeyword;

public class StaticBlock01 {



//Notes about Static Block

/*
 1-when you click on main method run buton in main method, (there is class loader in java),
 2- class loader will be activated.
 3-and class loader get starter that class-->public class StaticBlock01 {. Then class will be loaded into the memory

//when you click on main method run buton, Class Loader will be activated and it will load the class into the memory

 There is code inside the class, and there is an order in java for execute them.

Sometimes we need some data just after the class loader. For that kind of scenarios we use "static block"

When you use static block it will be executed before "main method", "any other methods" "constructors"
I mean it will be the first executed.

Note:Static Block is used to initialize "static variables" when we want them before everything in the class.


We will work with database. We will remove same data, we will work with some data. we have many task in database.
To connect data base-->before everything  !!!

When we have a task 1-Going to database 2-Create static block and put the code in it, and do whatever you want


if you have multiple "static block" execution order will be from top to down

Instead of a large, with many lines code, You should split the codes in to small parts, :) one method one action

m1() {
m1a--Atomic funksjon, it has just 2-3 lines in it.
m1b
m1c

}


 */

    static double pi;
    static double eNumber;

    public StaticBlock01(){
        System.out.println("Constructor");
    }


    ////Type your code inside the static block to connect database.When you load that class, database connection wil be ready for you
    static{
        System.out.println("First static block");
        pi =3.14;
    }

    static{
        System.out.println("Second static block");
        eNumber=2.7;
    }

//java will load the class at the beginning, while java loaded class,
// it wil be executed static block the same time, together with the static block we will have pi value.

    public static void main(String[] args) {

        System.out.println("main method");
        StaticBlock01 obj1 = new StaticBlock01();
        double r= 2;
        double area = pi*r*r;
    }



}
