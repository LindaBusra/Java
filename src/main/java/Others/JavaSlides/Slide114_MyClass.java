package Others.JavaSlides;

public class Slide114_MyClass {

    int x;
    static int y;

    Slide114_MyClass(int i) {
        x += i;
        y += i;

    }

    public static void main(String[] args) {

        new Slide114_MyClass(2); ///X=2 olur
        Slide114_MyClass mc = new Slide114_MyClass(3);
        System.out.println(mc.x + "," + mc.y);          //3,5






    }
}
