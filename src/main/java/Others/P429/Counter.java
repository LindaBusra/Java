package Others.P429;

public class Counter {

    int count = 0;

    Counter() {

        count += 2;

        System.out.println(count);

    }


    public static void main(String[] args) {

    Counter obj = new Counter();
    System.out.println(obj.count);     // output 2  2


    }
}