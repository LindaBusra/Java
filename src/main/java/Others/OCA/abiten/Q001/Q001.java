package Others.OCA.abiten.Q001;

public class Q001 {
    public static void main(String[] args) {


        int x = 1;
        int y = 1;

        if (x++ < ++y) {            //X=1 < y=2
            System.out.print("Hello ");
        }else {
            System.out.print("Welcome ");
        }

        System.out.print("Log " + x + ":" + y);

        //What is the output

    }
}
