package Others.javaQuestionBank_TechPro;

import java.util.Arrays;
import java.util.Scanner;

public class Side71_79_Arrays {
    public static void main(String[] args) {




//Q04_after- Find the middle element in an integer array
//Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
// (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10


//int[ ] a = new int[ ]{12, 5, 8, 13};        // 5 8 12 13
//Arrays.sort(a);
//
//int indexForMiddle = a.length/2;
//
//if(a.length%2 !=0 ) {
//
//    System.out.println(a[indexForMiddle]);
//} else  {
//    System.out.println((a[indexForMiddle] + a[indexForMiddle-1])/2) ;
//}


//-------------------------------------------------------------------------------



//2- Find the smallest positive element and greatest negative element in an integer array
//Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

//        int num[] = {-12, 18, -5, 23, -2};
//
//        Arrays.sort(num);
//        int min=0; int max=0;
//
//        for(int i=0; i<num.length; i++) {
//
//            if(num[i]<0 && num[i+1]>0) {
//
//                System.out.println("Maximum negative: " + num[i]);
//                System.out.println("Minimum positive: " + num[i + 1]);
//
//            }
//         }



//or---




//        int num[] = {-12, 18, -5, 23, -2};
//
//
//        Arrays.sort(num);
//
//        int positive = num[num.length-1];
//        int negative=num[0];
//
//        for(int w: num) {
//
//            if(w>0) {
//
//                positive = Math.min(positive,w);
//
//            }
//
//            if(w<0) {
//
//                negative = Math.max(negative,w);
//
//            }
//        }
//
//        System.out.println("greatest negative: " + negative + " " + "smallest positive: " + positive);


//------------------------------------------------------------------------------------------------------------



//3-Find the elements whose length is the smallest in a String array
// Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli


//    String names[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli" };
//
//
//    int minlength =names[0].length();
//
//    for(int i=0; i<names.length; i++) {
//
//        if(names[i].length() <minlength) {
//
//            System.out.println(names[i]);
//        }
//    }



//----------------------------------------------------------------------------------------------------------



//4-Get the initials of the elements in a String array, if the String ends with 'n' or 'k'
//Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM


//
//        String str[] = { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
//
//    for(String w: str) {
//
//        if(w.endsWith("n") || w.endsWith("k")) {
//            System.out.print(w.substring(0,1));
//        }
//    }



//---------------------------------------------------------------------------------------------------------------



//5- Find the total number of characters used in String array elements
//Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26

//       String name[] = { "Kemal", "Jonathan", "Mark", "Angie", "Veli" };
//
//        int sum = 0;
//
//    for(String w:name) {
//
//        sum += w.length();
//    }
//
//        System.out.println("The total number of characters used in String array elements: " + sum);



//-----------------------------------------------------------------------------------------------------


//6-Count how many words start with 'a' or 'A' in a given String

//        String s = "Apex is an object oriented programming language";
//
//        String ss[] = s.split(" ");
//
//        int counter = 0;
//
//        for(String w: ss) {
//
//            if(w.startsWith("a") || w.startsWith("A")) {
//                counter++;
//            }
//        }
//        System.out.println(counter + " words start with 'a' or 'A' in a given String");

///---------------------------------------------------------------------------


//7) Find the number of vowels in a String

//        String str = "Apex is an object oriented programming language";
//
//     String newStr[] = str.toLowerCase().split("");
//     int howMany = 0;
//
//     for(String w : newStr) {
//
//         switch(w) {
//             case "a":
//             case "e":
//             case "i":
//             case "o":
//             case "u":
//                 howMany++;
//
//         }
//          }
//        System.out.println("The number of vowels in this String: " + howMany);


//-------------------------------------------------------------------------------



//8) Type code to find array elements whose first and last characters are same


        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

//       for(int i=0; i<arr.length; i++) {
//
//           String first = arr[i].substring(0,1);
//           String last = arr[i].substring(arr[i].length()-1);
//
//           if(first.equals(last)) {
//
//               System.out.print(arr[i]+ " ");
//           }
//
//
//       }

//or


//        for(String w: arr) {
//
//            String first = w.substring(0,1);
//            String last = w.substring(w.length()-1);
//
//            if(first.equals(last)) {
//
//                System.out.print(w + " ");
//            }
//        }


//-------------------------------------------------------------------------------------------------------------------------



//9-Type code to find if a given element exists in a given array or not

//        String[] arry = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
//
//        String given = "Apex";
//        int count= 0;
//
//        for(String w: arry) {
//
//            if(w.equals(given)) {
//
//                count++;
//            }
//        }
//
//        if(count>0) {
//            System.out.println("Given element exists in the array " + count + " times") ;
//        } else {
//            System.out.println("given element does not exist in the array");
//        }



//------------------------------------------------------------------------------------------------------------



//10-) Type code to find sum of the number of characters of array elements

 String[] array = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        int sum = 0;

        for(String w:array) {

            sum += w.length();
        }

        System.out.println("Sum of the number of characters of array elements: " + sum );


//-----------------------------------------------------------------------------------------------------------------



 //11) Type code to put all zeros to end in an integer array.
        //Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        int[] num1 = { 5, 0, 2, 0, 3};

        int[] num2 = new int[num1.length];
        int j = 0;

        Arrays.sort(num1);          // 0 0 2 3 5


        for(int i= num1.length-1; i>=0; i--)  {

            num2[j] = num1[i];
            j++;
        }

        System.out.println(Arrays.toString(num2));      // [5, 3, 2, 0, 0]



//-----------------------------------------------------------------------------------------------------------------


//12) Create an integer array by getting the elements from the user then print the difference
//between the smallest and the greatest elements on the console.


//        Scanner scan = new Scanner(System.in);
//        System.out.println("How many elements will you enter");
//        int numbers = scan.nextInt();
//
//        int[] num = new int[numbers];
//        int smallest = num[0];
//        int greatest = num[0];
//
//
//        for(int i=0; i<numbers; i++ ) {
//
//            System.out.println("Type " + (i+1) + ". element");
//            num[i] = scan.nextInt();
//
//            smallest = Math.min(num[i], smallest);
//            greatest = Math.max(num[i], greatest);
//
//        }
//
//        System.out.println("the smallest: " + smallest + " the greatest: " + greatest);



//----------------------------------------------------------------------------------------------













    }
}
