package Others.Topics.Constructor;

public class MyClass02 {

    int x;
    static int y;

    MyClass02(int i) {
        x += i;
        y += i;
    }



    public static void main(String[] args) {
            new MyClass02(2);
        MyClass02 mc = new MyClass02( 3);

        System.out.println(mc.x + "," + mc.y);
    }
}
