package Others.Topics.Constructor;

public class Slide107 {         //Slide107-->Student
    String name;
    int age;
    String phone;

    Slide107() {}

    Slide107(String name, int age, String phone) {
        this.phone = phone;
        this.name =name;

    }

    public static void main(String[] args) {
        Slide107 s1 = new Slide107();
        Slide107 s2 =  new Slide107("John", 25, "029-998877");
        System.out.println(s2.name + ", " + s2.age + ", " + s2.phone);
    }
}
