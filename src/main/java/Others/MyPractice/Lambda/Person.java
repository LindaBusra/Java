package Others.MyPractice.Lambda;

public class Person {

    private String firtsName;

    private String lastName;

    private int age;


    public Person(String firtsName, String lastName, int age) {
        super();
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.age = age;

    }


    public String getFirstName() {

        return firtsName;
    }


    public void setFirstName() {

        this.firtsName = firtsName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName() {

        this.lastName = lastName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(){


        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firtsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
