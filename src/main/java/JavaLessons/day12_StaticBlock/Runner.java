package JavaLessons.day12_staticblock;

public class Runner {
    public static void main(String[] args) {



//runner class has main method in it.

        //To access a non-static variable you have to create object.
        VariableTypes01 obj = new VariableTypes01();


  //      obj.name = //by using to object I am able to access name. but not age.
        //non-static variables can be acces by object.
        //static variables can be acces by class

        System.out.println(obj.name);       //Tom Hanks


  //      VariableTypes01.age

        //To access a static variable no need to create object, just class name is enough.
        System.out.println(VariableTypes01.age);    //13


        //Actually you can access to static  class members by using objects, it is not recommended.
        System.out.println(obj.age);


        //add method is not static, if something is not static, i have to use object.

        System.out.println(obj.add(3,5));       //8

        System.out.println(obj.multiplication(3,5));    //15











    }
}
