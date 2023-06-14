package Others.MyPractice.P2;

public class Q34 {

    public static void main(String[] args) {



//Example 01:
        StringBuilder strBld = new StringBuilder("MyLoveJava");

        String str = strBld.substring(3);
        System.out.println(str);
        System.out.println(strBld); //Output?


        System.out.println(strBld.substring(3)); //Output?


//Example 02:
        StringBuilder strBld1 = new StringBuilder("Java is easy");
        strBld1.delete(5, 9);
        System.out.println(strBld1);// Output?

    }
}
