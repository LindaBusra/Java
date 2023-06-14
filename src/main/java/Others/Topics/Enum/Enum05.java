package Others.Topics.Enum;

public class Enum05 {

    enum Transport {
        PLANE(600), TRAIN(80), AUTOMOBILE(50);

        int speed;

        Transport(int s){

            speed = s;
        }
    }


    public static void main(String[] args) {

        System.out.println(Transport.AUTOMOBILE.speed);

        Transport tp = Transport.AUTOMOBILE;
        System.out.println(tp.ordinal());

        if(tp.ordinal()<2) {
            System.out.println("It is not automobile");
        }

    }

}
