package JavaLessons.day26_exceptions;

public class E26 {

    public static void main(String[] args) {


        try{
            int a[]=new int[6];
            a[2]=10/0;
            System.out.println("I am at the end of try block");
        }
        catch(ArithmeticException e){
            System.out.println("Warning: ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("Warning: Some Other exception");
        }
        System.out.println("Out of try-catch block...");

    }
}
