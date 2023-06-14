package Others.Topics.Constructor;

public class Staticc {

    static int counter = 0;
    int age = 0;

    public Staticc() {

        counter++;
        age++;
    }

    public static void main(String[] args) {
        Staticc obj1 = new Staticc();
        Staticc obj2 = new Staticc();
        Staticc obj3 = new Staticc();

        System.out.print(obj1.counter);
        System.out.print(obj2.counter);
        System.out.print(obj3.counter);

        System.out.print(" - ");

        System.out.print(obj1.age);
        System.out.print(obj2.age);
        System.out.print(obj3.age);

    }
}
