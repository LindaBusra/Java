package Others.javaQuestionBank_TechPro;

public class WrapperClasses {
    public static void main(String[] args) {

//Q-1 Type a code to find the sum of the minimum value of the byte and the
//maximum value of short data types.

        byte min = Byte.MIN_VALUE;
        short max = Short.MAX_VALUE;

        System.out.println("the minimum value of byte: "+ min +
        " and the maximum value of short:"  + max);

//Q-2  Type a code to convert “103” String to byte and to convert “2351” String to
// short then print the difference on the console.

        byte b = Byte.valueOf("103");
        short s = Short.valueOf("2351");
        System.out.println(b+s);   //2248











    }
}
