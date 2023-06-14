package Others.MyPractice.P3;

public class Person {
    private String name;
    private String lastname;
    private int id;
    private int age;
    private int salary;


    public Person(String name, String lastname, int id, int age, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    public static void main(String[] args) {

        Person p1 = new Person("Terje", "Ringen", 123, 32, 28000);

        System.out.println(p1.name);
        System.out.println(p1.lastname);


    }

    public static String getEmail(String name, String lastname) {

        return (name.replace(" ", "") + lastname + "@gmail.com").toLowerCase();


    }


}
