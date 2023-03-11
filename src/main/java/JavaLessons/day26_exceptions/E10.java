package JavaLessons.day26_exceptions;

public class E10 {
    public static void main(String[] args) {


        int arr[] = {1,2,3,4,5};

        try{
            System.out.println("I have an array");
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hops! We have a problem here. Information about it:");
            System.out.println(e);
        }
    }
}
