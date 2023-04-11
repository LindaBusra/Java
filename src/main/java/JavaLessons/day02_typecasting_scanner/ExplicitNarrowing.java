package JavaLessons.day02_typecasting_scanner;

public class ExplicitNarrowing {
    public static void main(String[] args) {


        int num1 = 50;
        short num2 = (short) num1;  //50
        System.out.println(num2);



        byte num3 = (byte) num1;  //50     //byte from -128 to 127
        System.out.println(num3);  //50



        int num4 = 500;

        byte num5 = (byte) num4;
        System.out.println(num5);  //-12--> 127+256=  383  -->I need 117   (128-117+1 = 12)-->answer is -12


        int number1=386;
        byte number2= (byte)number1;  //127+256=383  I need 3 more     -128 -127 -126--> answer is -126
        System.out.println(number2);



        int a = 135;
        byte b = (byte) a ;   //-128-------0-------127    we have 8 more... -128, -127, .... -121
        System.out.println("b: " +b);   //-121



        int num=130;
        byte number = (byte)num;
        System.out.println(number);   //--126





    }
}
