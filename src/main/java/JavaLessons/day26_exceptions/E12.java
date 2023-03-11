package JavaLessons.day26_exceptions;

public class E12 {

    public static void main(String[] args) {




        String str =null;

        try{
            System.out.println("Can we find length of str");
            System.out.println(str.length());
        } catch (NullPointerException e) {

            System.out.println("No, because it was null");
        }
    }
}
