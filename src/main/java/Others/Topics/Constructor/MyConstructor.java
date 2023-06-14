package Others.Topics.Constructor;

public class MyConstructor {
//Slide 109

    int x=5;
    MyConstructor() {
        System.out.print("-X" + x);
    }

    MyConstructor(int x) {
        this();
        System.out.print("-X" + x);
    }

    public static void main(String[] args) {

        MyConstructor mc1 = new MyConstructor(4);
        MyConstructor mc2 = new MyConstructor();
    }

}
