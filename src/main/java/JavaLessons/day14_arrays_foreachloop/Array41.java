package JavaLessons.day14_arrays_foreachloop;

import java.util.Arrays;

public class Array41 {
    public static void main(String[] args) {


//Example 1- Check if the array elements are in the natural order. "A", "B", "C" ==> true  -  "A", "C", "B" ==> false

        //1.way


        String srr[] = {"Ayhan", "Beyhan", "Ceyhan"};



        System.out.println(Arrays.toString(srr));

        String newSrr[] = new String[srr.length];      //I will prepare a spare array


        for (int i = 0; i < srr.length; i++) {         // copy an array, or String nweSrr[] = Arrays.copyOf(srr, srr.length);

            newSrr[i] = srr[i];
        }

        System.out.println("Before sort: " + Arrays.toString(newSrr));

        Arrays.sort(newSrr);
        System.out.println("After sort: " + Arrays.toString(newSrr));


        //to compare new array with the orginal array.
        if (Arrays.equals(newSrr, srr)) {                                   //compara to arrays
            System.out.println("Array elements are in natural order");
        } else {
            System.out.println("Array elements are not in natural order");
        }

        System.out.println();


        //2.way

//        String str[] = {"Veli", "Michael", "Ali", "Maria"};
////      String sameStr[] = Arrays.copyOf(str,2);                              //It takes just first 2 elements
//
//        String sameStr[] = Arrays.copyOf(str, str.length);                    //It takes all elements
//
//        System.out.println("Before sort: " + Arrays.toString(sameStr));

//        Arrays.sort(sameStr);
//        System.out.println("After sort: " + Arrays.toString(sameStr));
//
//
//        if (sameStr.equals(str)) {                              // esitse
//            System.out.println("Array elements are in natural order");
//        } else {
//            System.out.println("Array elements are not in natural order");
//        }

//---------------------------------------------------------------------------------------------------



//Example 2- How to check an element if it exists in an array or not

        int arr[] = {32, 14, 2, 11};

        //1.Way:
        for(int w : arr){
            if(w==14){
                System.out.println(w + " exists");
                break;
            }
        }

        //2.Way:
        // NOTE 1: binarySearch() method returns the index of existing element
        // NOTE 2: binarySearch() method returns the order number with negative sign for non-existing elements
        // NOTE 3: To use binarySearch() method you HAVE TO use sort() method otherwise the output will not be meaningful
        // NOTE 4: Do not use binarySearch() method for repeated elements, it does not give correct answer everytime


        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 8));   //-2


//------------------------------------------------------------------------------------------------------------


//Example 3- Type code to find if a given element exists in the given array.  //Print the console if exists or not


        int array [] = {34,52,12,37,29};
        int expectedElement = 12;

        Arrays.sort(array);

        int index = Arrays.binarySearch(array, expectedElement);

        if(index>=0) {
            System.out.println("Element exists..");
        } else{
            System.out.println("Element does not exists..");
        }



//----------------------------------------------------------------------------



//Example 4- Find the number of vowels in a String  (a.e.i.o.u)


        //1. way

        String str1 = "I like to move it move it";

        String str2[] = str1.split("");

        int count=0;


        for(String w:str2) {

            boolean isVowel = w.equalsIgnoreCase("a") || w.equalsIgnoreCase("e") || w.equalsIgnoreCase("i")
                            || w.equalsIgnoreCase("o") || w.equalsIgnoreCase("u") ;

            if(isVowel) {
                count++;
            }
        }

        System.out.println("there is " + count + " vowels in this string");




        //2. way

        String str3 = "I like to move it move it";

        str3 = str3.toLowerCase().replaceAll("[^aeiou]", "");

        System.out.println("there is " + str3.length() + " vowels in this string");



        //3.Way:

        String str4 = "I like to move it move it";
        String arr1 [] = str4.toLowerCase().split("");

        int counter=0;

        for(String w : arr1){
            switch(w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;

            }
        }
        System.out.println("The number of vowels is " + counter);           //10



//---------------------------------------------------------------------------------------------------



//Example 5- Find the smallest element and greatest negative element in an integer array
//for example:  {-12, 18, -5, 23, -2}  -->Smallest positive is 18, greatest negative is -2

        int[] a = {-12, 18, -5, 23, -2};

        Arrays.sort(a);         // -12 -5 -2 18 23

        int negative = a[0];

        int positive = a[a.length-1];


        for(int w:a) {

            if(w>0) {

                positive = Math.min(positive, w);
            }

            if(w<0) {

                negative = Math.max(negative, w);
            }

        }

        System.out.println("Greatest negative is: " + negative + ", Smallest positive is: " + positive);





    }
}







