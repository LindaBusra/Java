package Others.Topics.OverloadingExample;

public class Main {

    public static void main(String[] args) {

        Test test1 = new Test(10);
        Test test2 = new Test(12, 15);
        System.out.println(test1.i);
        System.out.println(test2.i);

    }
}
