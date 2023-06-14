package Others.OCA.abiten.Q083;

public class Q083 {         //public class Test

    public static void main(String[] args) {

        Q083 ts = new Q083();
        System.out.println(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);


    }

    public static boolean doStuff(){
        return !isAvailable;
    }

    static boolean isAvailable = true;
}

