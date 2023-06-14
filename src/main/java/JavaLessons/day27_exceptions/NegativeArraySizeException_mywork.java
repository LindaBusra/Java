package JavaLessons.day27_exceptions;

public class NegativeArraySizeException_mywork {

    public static void main(String[] args)  {





        try {
            int arr[] = new int[-5];
            System.out.println(arr.length);
        } catch (NegativeArraySizeException e) {

            System.out.println("Arrays04 size can not be negative");
        }


    }
}