package JavaLessons.day27_exceptions;

public class E01 {

    public static void main(String[] args) throws InterruptedException {


//Write a program for example of try  and catch block. In this example check whether the given
//array size is negative or not.

        try {

            int[] arr = new int[-4];

            System.out.println(arr.length);

        } catch (NegativeArraySizeException e) {
            System.out.println("Arrays04 size can not be negative");
        }

        Thread.sleep(2000);  // it stopped the system 2 seconds.


    }
    }
