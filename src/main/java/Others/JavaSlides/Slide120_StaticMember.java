package Others.JavaSlides;

public class Slide120_StaticMember {

    static int x;
    int y;

    Slide120_StaticMember() {
        x+=2;
        y++;
    }

    static int getSquare() {        //method
        return x*x;
    }

    public static void main(String[] args) {

        Slide120_StaticMember sm1 = new Slide120_StaticMember();
        Slide120_StaticMember sm2 = new Slide120_StaticMember();
        int z = sm1.getSquare();   //16
        System.out.println("-X" + z + "-y" + sm2.y);  //-x16-y1


    }


}
