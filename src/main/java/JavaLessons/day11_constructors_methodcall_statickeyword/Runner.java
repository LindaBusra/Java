package JavaLessons.day11_constructors_methodcall_statickeyword;

public class Runner {

    public static void main(String[] args) {

        //Create an object from Car class
        //Example   Scanner scan = new Scanner(System.in);

       Car audi = new Car();
       System.out.println(audi.make);
       System.out.println(audi.model);

       Car bmw = new Car("BMW", "M5", 2022, 50000);
       System.out.println(bmw.make);
       System.out.println(bmw.model);

       Car mercedes = new Car("Mercedes", "C300", 2023, 60500);
       System.out.println(mercedes.make);
       System.out.println(mercedes.model);

       Car itCar = new Car("Rolls Royce", "Cullinan", 2023);
       System.out.println(itCar.make);
       System.out.println(itCar.model);
       System.out.println(itCar.year);

       Static01 obj1 = new Static01();  //-->Static01'deki constructor'i kullaniyor
       Static01 obj2 = new Static01();
       Static01 obj3 = new Static01();

       System.out.println(obj3.nonStaticCounter);  //1
       System.out.println(obj3.staticCounter);     //3




//Car clasi ile Runnner ayni package'da ise birsey import etmeye gerek tok.

//If any class you want to use, is in the same package no need to import it.

/*
//objelerin icinde sadece n-static counter var.



 */

    }
}
