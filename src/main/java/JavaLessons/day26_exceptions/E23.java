package JavaLessons.day26_exceptions;

public class E23 {
    public static void main(String[] args) {


        try{
        int num1 =22;  int num2= 2;
        System.out.println(num1/num2);
        } catch (ArithmeticException e) {
            System.out.println("There is problem here");
        } finally {
            System.out.println("No anymore");
        }

        System.out.println();

        try{
        int num1 =22;  int num2= 0;
        System.out.println(num1/num2);
        } catch (ArithmeticException e) {
        System.out.println("There is problem here");
        } finally {
        System.out.println("No anymore");
    }
}

}
