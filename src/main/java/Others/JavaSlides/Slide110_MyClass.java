package Others.JavaSlides;

public class Slide110_MyClass {

    int x =3;
    int y= 5;

    Slide110_MyClass(){
        x += 1;
        System.out.print("-X" + x);
     }

    Slide110_MyClass(int i){
        this();
        this.y = i;
        x += y;
        System.out.print("-X" + x);
    }

    Slide110_MyClass(int i, int i2){
        this(3);
        this.x -= 4;
        System.out.print("-X" + x);     //-x4-x7-x3
    }


    public static void main(String[] args) {
        Slide110_MyClass mc11 = new Slide110_MyClass(4,3);
    }
}
