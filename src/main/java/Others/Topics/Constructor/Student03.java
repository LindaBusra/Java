package Others.Topics.Constructor;

public class Student03 {
    String name ="Emily";
    int age = 20;

    Student03 (String name, int age) {

        this.name = name;
        this.age = 22;
    }

    public static void main(String[] args) {
        Student03 st = new Student03("Oliver", 21);
        System.out.print(st.name);
        System.out.print(", " + st.age);
    }
}
