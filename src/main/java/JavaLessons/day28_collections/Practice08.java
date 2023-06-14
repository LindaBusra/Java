package JavaLessons.day28_collections;

import java.util.Arrays;
import java.util.HashSet;

public class Practice08 {

    public static void main(String[] args) {


    //To convert HashSet to Arrays04

        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Welcome");
        hashSet.add("To");
        hashSet.add("Geeks");
        hashSet.add("For");
        hashSet.add("Geeks");


        System.out.println("The HashSet: " + hashSet);


        // Creating the array and using toArray()
        String[] arr = new String[hashSet.size()];
        arr = hashSet.toArray(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("The arr[] is:");
        for (int j = 0; j < arr.length; j++)
            System.out.print(arr[j] + " ");

        System.out.println();




 //--------------------------------------------------------------------

        HashSet<String> hashSet1 = new HashSet<String>();


        hashSet1.add("Welcome");
        hashSet1.add("To");
        hashSet1.add("Geeks");
        hashSet1.add("For");
        hashSet1.add("Geeks");

        // Displaying the HashSet
        System.out.println("The HashSet: "  + hashSet1);


        String[] arr1 = new String[7];
        arr1 = hashSet1.toArray(arr);

        System.out.println(Arrays.toString(arr1));





    }
}
