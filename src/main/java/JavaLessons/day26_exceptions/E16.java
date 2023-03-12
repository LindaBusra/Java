package JavaLessons.day26_exceptions;

public class E16 {
    public static void main(String[] args) {



//What is the output?

        try{

            int arr[] = {7,8,9,10};

            for(int i=0; i<10; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {   //We can write also  (Exception e)

            System.out.println("We have exception here");
        } finally {
            System.out.println("Finish");
        }


    }
}
