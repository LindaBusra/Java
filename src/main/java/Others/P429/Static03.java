package Others.P429;

public class Static03 {

    static int a = 10;

    public static void main(String[] args) {

        Static03 t1 = new Static03();

        Static03 t2 = new Static03();



        t1.a = a + 2;

        t2.a = a + 3;

        System.out.println(t1.a);

        System.out.println(t2.a);

    }
}
