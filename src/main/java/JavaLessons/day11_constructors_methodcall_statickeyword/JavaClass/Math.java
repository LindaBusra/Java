package JavaLessons.day11_constructors_methodcall_statickeyword.JavaClass;

public class Math {


    public void display1(){
        System.out.println("Method without parameter");
    }

    public void display2(int a){
        System.out.println("Method with a single parameter: " + a );
    }

    public int addNumber(int a, int b) {

        int sum = a+b;
        return sum;
    }


    public static int square(int num) {     // If we use the static keyword, it can be accessed without creating objects.

        return num*num;
    }


    public static void main(String[] args) {

        int a=12, b=25;

        Math obj = new Math();    //create an object of main.
        //Note: The method is not static. Hence, we are calling the method using the object of the class.

        System.out.println("The sum of numbers is: " + obj.addNumber(a,b));


        System.out.println("The square of number is:" + square(a));  //We dont have to create object for calling this method because of it is static

        obj.display1();
        obj.display2(5);





    }




}
