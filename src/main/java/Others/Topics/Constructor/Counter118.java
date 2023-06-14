package Others.Topics.Constructor;

public class Counter118 {


    int count;
    static int stCount;

    public Counter118() {
        count++;
        stCount++;
    }
    public int getCount(){
        return count;
    }
    public static int getStCount() {
        return stCount;

    }
}
//    public class TestCounter {
//        public static void main(String[] args) {
//            Counter118 cs1 = new Counter118();
//            Counter118 cs2 = new Counter118();
//            Counter118 cs3 = new Counter118();
//            Counter118 cs4 = new Counter118();
//            Counter118 cs5 = new Counter118();
//            Counter118 cs6 = new Counter118();
//
//            System.out.println("count is: " + cs1.getCount());
//            System.out.println("stCount is: " + cs1.getStCount());
//
//        }
//    }