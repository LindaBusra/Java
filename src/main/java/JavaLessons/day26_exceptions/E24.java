package JavaLessons.day26_exceptions;

public class E24 {
    public static void main(String[] args) {


        String s1 = "";
        String s2 = null;

        try{
            s1 = s1 + "J";
            System.out.println(s2.length());
            s1 = s1 + "a";
        } catch(ArithmeticException e) {
            s1 = s1 + "v";
        } catch(NullPointerException e) {
            s1 = s1 + "a";
        } finally {
            s1 = s1 + "v";
        }
        s1 = s1 + "a";
        System.out.println(s1);
    }
}
