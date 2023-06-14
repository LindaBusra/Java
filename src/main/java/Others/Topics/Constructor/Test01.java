package Others.Topics.Constructor;

public class Test01 {
    static int i;
    int j;

    static {
        i=10;
        System.out.println("Static block called");
    }

    Test01() {

        System.out.println("Constructor called");
    }
}

class Main{

    public static void main(String[] args) {
        Test01 t1 = new Test01();
        Test01 t2 = new Test01();

    }
}