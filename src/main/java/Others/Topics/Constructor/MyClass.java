package Others.Topics.Constructor;
//Slide110
public class MyClass {

    int x = 3;
    int y = 5;          //y=3

    MyClass() {
        x+=1;           //7--3
        System.out.print("-X" + x);   //-x4-x7-x3
    }
    MyClass(int i) {
        this();
        this.y = i;
        x += y;
        System.out.print("-X" + x);
    }

    MyClass(int i, int i2) {
        this(3);
        this.x -= 4;
        System.out.print("-X" + x);
    }

    public static void main(String[] args) {

        MyClass mc1 = new MyClass(4,3);
    }
}


