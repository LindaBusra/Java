package JavaLessons.day26_exceptions;

public class E11 {
    public static void main(String[] args) {


        String str = "abc";


        try{

            int num =Integer.valueOf(str);
            System.out.println(num);

        } catch (NullPointerException e) {
            System.out.println("Is it null pointer exception?");
        } catch (NumberFormatException e) {
            System.out.println("It is NumberFormatException");
        }





    }
}
