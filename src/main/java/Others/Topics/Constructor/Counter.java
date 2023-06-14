package Others.Topics.Constructor;

public class Counter {


   static int count = 0;      //instance variable, I will attech the count to the objects

    Counter() {         //there is no return type, it is constructor
        count += 2;
        System.out.println(count);

    }


    public static void main(String[] args) {

        Counter c1 = new Counter();              //c1, c2 and c3 object
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(c1.count);
        System.out.println(c2.count);
        System.out.println(c3.count);
    }
}
