package Others.OCA.abiten.Q099;

public class Employee {

    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age) {
        setName(name);
        setAge(age);
        setSalary(2000);
    }


    public Employee(String name, int age, int salary) {
        this(name, age); //this() must be here
        setSalary(salary);
    }

    //getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void printDetails () {
        System.out.println(name +" : "+age+" : "+salary);
    }
}