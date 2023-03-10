package JavaLessons.day26_exceptions;

public class E06 {
    public static void main(String[] args) {


        try{
            System.out.println("First statement of try block");
            int num=45/0;
            System.out.println(num);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("Out of try-catch-finally block");


        //the system generated exception message is shown but before that the finally block
        // successfully executed.
    }
}
