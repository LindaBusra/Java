package Others.JavaSlides;

public class Slide109_MyConstructor {

    //Slide s109

    int x = 5;

    Slide109_MyConstructor() {
        System.out.print("-X" + x);
    }

    Slide109_MyConstructor(int x) {
        this();
        System.out.print("-X" + x);
    }

    public static void main(String[] args) {
        Slide109_MyConstructor mc1 = new Slide109_MyConstructor(4);    // -x5-x4-
        Slide109_MyConstructor mc2 = new Slide109_MyConstructor();        //-x5
    }
}
