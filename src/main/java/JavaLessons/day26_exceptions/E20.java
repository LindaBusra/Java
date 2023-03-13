package JavaLessons.day26_exceptions;

public class E20 {

    public static void main(String[] args) {

        String str = "abcd";

        try{

            Object obj = new Integer[12];
            str = (String)obj;  //When you tray to cast object data type to String you get exception

        } catch (ClassCastException e) {

            System.out.println("There is an exception");
        }

        System.out.println(str);

    }
}
