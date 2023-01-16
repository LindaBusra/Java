package JavaLessons.day18_datetime_class_vararrgs;

public class Varargs03 {

    /*
    Variable Argument (Varargs):
    The varrags allows the method to accept zero or muliple arguments. Before varargs either we use overloaded method or
    take an array as the method parameter but it was not considered good because it leads to the maintenance problem.
    If we don't know how many argument we will have to pass in the method, varargs is the better approach.

    Advantage of Varargs:
    We don't have to provide overloaded methods so less code.

    Syntax of varargs:
    return_type method_name(data_type... variableName){}

    accessModifier methodName(datatype… arg) {
    // method body
    }

    public static String format(Locale l, String format, Object... args) {
    // body
}

    There can be only one variable argument in the method.
    Variable argument (varargs) must be the last argument.


    Examples of varargs that fails to compile:

    void method(String... a, int... b){}//Compile time error

    void method(int... a, String b){}//Compile time error





     */
    public static void main(String[] args) {
        display();//zero argument
        display("my", "name", "is", "varargs");//four arguments


        display1();//zero argument
        display1("hello");//one argument
        display1("my", "name", "is", "varargs");//four arguments

        display2(500,"hello");//one argument
        display2(1000,"my","name","is","varargs");//four arguments

    }

    static void display(String... values) {
        System.out.println("display method invoked ");
    }


    static void display1(String... values) {
        System.out.println("display method invoked ");
        for (String s : values) {
            System.out.println(s);
        }
    }


    static void display2(int num, String... values) {
        System.out.println("number is " + num);
        for (String s : values) {
            System.out.println(s);
        }
    }
}