package JavaLessons.day12_staticblock;

public class VariableTypes01 {



    public String name = "Tom Hanks";   //"name" is "object" or "instance" or "nonstatic" variable


    //age is "static" or "class" variable"
    public static int age = 13;

//local variable,  //return-->int, string

//if you create a variable inside a method, it is called "local variable
//When you create a local variable it is mandatory to assign a value. If you try to use a
//local variable without assigning a value it complains.
//Local variables can be used just inside the method. if you try to use it outside the method it will give error.


//Note:if the return type is different from void, you have to return keyword inside the method

//Note:When you create a method use "return" keyword  in the last line. You cannot type any code after "return" keyword.

    public int add(int a, int b) {

        int x=13;  //local variable
        System.out.println(name);
        return a+b;
    }

//Create a method to do multiplication

    public int multiplication(int c, int d) {

        String s ="java"; //local variable

        return c*d;
    }








}
