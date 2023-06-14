package Others.MyPractice.P5;

public class Q102 {
    public static void main(String[] args) {

//What is the sum of a and b?

 byte a=40, b=50;
// byte sum = a+b;   //it gives error
// byte sum = (byte) a + b;  //it gives error
// byte sum = (byte) a + (byte) b;  //it gives error
        byte sum = (byte) (a+b) ;
        System.out.println(sum);




    }
}
