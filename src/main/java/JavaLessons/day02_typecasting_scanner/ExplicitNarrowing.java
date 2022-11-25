package JavaLessons.day02_typecasting_scanner;

public class ExplicitNarrowing {
    public static void main(String[] args) {


        int num1 = 50;

        short num2 = (short) num1;  //50

        System.out.println(num2);




        byte num3 = (byte) num1;  //50     //byte -128 ile 127

        System.out.println(num3);  //50




        int num4 = 500;

        byte num5 = (byte) num4;
        System.out.println(num5);  //-12




        int a = 135;

        byte b = (byte) a ;   //-128--------------127

        System.out.println("b: " +b);

    }
}
