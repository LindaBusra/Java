package JavaLessons.day18_datetime_class_vararrgs.BuildClass02;

public class Employee {

    /*
    Create an Employe class
    Attributes:name, age, salary, location
    Behavior : raiseSalary
     */

    //non-static attributues
    String name;
    String location;
    double salary;
    int age;


    //Create constructor
    public Employee(String name, String location, double salary, int age) {
        this.name = name;
        this.location = location;
        this.salary = salary;
        this.age = age;
    }


    void raiseSalary(){
        this.salary = this.salary * 1.2;
    }
}
