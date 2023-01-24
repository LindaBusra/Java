package JavaLessons.day14_arrays_foreachloop;
import java.util.Arrays;
import java.util.stream.*;
public class Array_Stream {
    public static void main(String[] args) {


        // Creating an integer array
        int arr[] = { 1, 2, 3, 4, 5 };

        // Using Arrays.stream() to convert array into Stream
        IntStream stream = Arrays.stream(arr);

        // Displaying elements in Stream
        stream.forEach(str -> System.out.print(str + " "));




//        String[] arr = { "Geeks", "for", "Geeks" };
//
//        // Using Arrays.stream() to convert array into Stream
//        Stream<String> stream = Arrays.stream(arr);
//
//        // Displaying elements in Stream
//        stream.forEach(str -> System.out.print(str + " "));





//        String[] arr = { "Geeks", "for", "Geeks","A", "Computer", "Portal" };
//
//        Stream<String> stream = Arrays.stream(arr, 3, 6);
//
//        // Displaying elements in Stream
//        stream.forEach(str -> System.out.print(str + " "));         //A Computer Portal




//        int arr[] = { 1, 2, 3, 4, 5 };
//
//        IntStream stream = Arrays.stream(arr, 1, 3);
//
//        // Displaying elements in Stream
//        stream.forEach(str -> System.out.print(str + " "));



//------------------------------------------------------------------------------

//                int arr[] = { 1, 2, 3, 4, 5};   //Find the sum of elements
//
//                int sum = 0;
//                sum = Arrays.stream(arr).sum();
//                System.out.println(sum);
//


//------------------------------------------------------------------------------
//
//                int arr[] = { 1, 2, 3, 4, 5};
//                // Let's try the imperative style first(which we
//                // are familiar with)
//                int sum = 0;
//                for (int i = 0; i < arr.length; i++)
//                    sum += arr[i];
//                System.out.println("Average using iteration :" +
//                        (sum / arr.length));
//
//                // Let's try the declarative style now
//                sum = Arrays.stream(arr) // Step 1
//                        .sum(); // Step 2
//                System.out.println("Average using streams : " +
//                        (sum / arr.length));
//
//                // forEach()
//                // It iterates through the entire streams
//                System.out.println("Printing array elements : ");
//                Arrays.stream(arr)
//                        .forEach(e->System.out.print(e + " "));


//-----------------------------------------------------------



        int data[] = { 1, 2, 3, 4, 5 };

        //iterative way to compute sum and average of an array
        int total = 0;

        for(int i = 0; i< data.length; i++) {
            total+= data[i];
        }

        System.out.println("Sum : " + total);
        System.out.println("Average : " + total/data.length);



        //declarative way to compute sum and average of an array
        total = Arrays.stream(data).sum();

        System.out.println("Sum : " + total);
        System.out.println("Average : " + total/data.length);

    }
}
