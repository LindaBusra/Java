package Others.javaQuestionBank_TechPro;

public class Side6_WrapperClasses {
    public static void main(String[] args) {


// 1- Type a code to find the sum of the minimum value of the byte and the maximum value of short data types

        byte min = Byte.MIN_VALUE;
        short max = Short.MAX_VALUE;

        System.out.println(min + max);


// 2- Type a code to convert “103” String to byte and to convert “2351” String to short then print
//the difference on the console.


        byte b1 = Byte.valueOf("103");
        short s1 = Short.valueOf("2351");

        System.out.println(b1+s1);




    }
}
