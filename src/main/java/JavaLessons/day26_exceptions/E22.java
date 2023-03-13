package JavaLessons.day26_exceptions;

public class E22 {
    public static void main(String[] args) {


//What is the output?

        try{

            System.out.println("We have an array");
            int arr[] = {10,11,12,13};

            for(int i=0; i<5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {   //We can write also  (ArrayIndexOutOfBoundsException e)

            System.out.println("Out Of Exception");
        } finally {
            System.out.println("Done!");
        }


    }
}
