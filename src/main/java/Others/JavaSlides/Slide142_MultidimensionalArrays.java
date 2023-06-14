package Others.JavaSlides;

import java.util.*;

public class Slide142_MultidimensionalArrays {
    public static void main(String[] args) {




//1) Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }


//   int[][] a =    { {1,2,3}, {4,5,6} } ;
//
//   int sum = 0;
//
//   for(int[] w: a) {
//
//       for(int m : w) {
//
//           sum += m;
//       }
//   }
//
//        System.out.println("The sum of all elements in the multi dimensional array : " + sum);



//------------------------------------------------------------------------------------------------------



//2- Find the product of the last elements in the array elements of the
//given multi dimensional array { {1,2,3}, {4,5}, {6} }



//        int arr[][] = { {1,2,3}, {4,5}, {6} };
//        int pr =1;





//        for(int[] w: arr) {
//
//            pr= pr*w[w.length-1];
//        }
//        System.out.println(pr);         //90





//--------------------------------------------------------------------------------------------------------





// 3) Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
// arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }



//        int arr1[][] = { {1,2}, {3,4,5}, {6} } ;
//
//
//        int arr2[][] = { {7,8,9}, {10,11}, {12} };
//
//
//
//        int sum = 0;
//
//
//        for(int i=0; i<arr1.length; i++) {
//
//            int minLength= Math.min(arr1[i].length, arr2[i].length);
//
//            for(int j=0; j<minLength; j++) {
//
//                sum+= arr1[i][j] + arr2[i][j];
//
//                }
//
//            }
//
//        System.out.println(sum);















// 4) Find the sum of the elements in the array elements of the given multi dimensional array
//{ {1,2,3}, {4,5}, {6,7} } and return an array.
//For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}



        int num[][] = { {1,2,3}, {4,5}, {6,7} };
        int arr[] = new int[num.length];

        int sum = 0;

        for (int i =0; i<num.length; i++) {

            for (int j = 0; j<num[i].length;j++){
                sum = sum + num[i][j];
            }
            arr[i] = sum;
            sum = 0;


        }
        System.out.println(Arrays.toString(arr));      //[6, 9, 13]



        //or

//Find the sum of the elements in the array { {1,2,3}, {4,5}, {6,7} } and return an array.
// For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}

//        int arr[][]={ {1,2,3}, {4,5}, {6,7} };
//        int sum=0;
//        int i=0;
//
//        int arr2[] = new int[arr.length];
//        for(int []w:arr) {
//
//            for(int m :w ) {
//                sum=sum+m;
//
//            }
//            arr2[i] = sum;
//            sum=0;
//            i++;
//        }
//        System.out.println(Arrays.toString(arr2));



//-----------------------------------------------------------------------------------------------------------------



//5- Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
//For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study” output will be 14.
//Hint: Use split()


//
//    String str = "Java is easy, if you study. Nothing is easy, if you do not study";
//    str = str.trim().replaceAll("\\p{Punct}", "");
//
//    String[] strNew = str.split(" ");
//
//        System.out.println(Arrays.toString(strNew));
//        System.out.println(strNew.length);



//-----------------------------------------------------------------------------------------------------------------



// 6-Write a Java program to remove a specific element from an array.



//        String[] str = {"Java", "is", "easy", "to", "learn"};
//        String toRemove = "easy";
//
//        String newStr[] = new String[str.length-1];
//        int i =0;
//
//        for(String w: str) {
//
//            if(! w.equals(toRemove)) {
//                newStr[i] = w;
//                i++;
//
//            }
//        }
//        System.out.println(Arrays.toString(newStr));
//




//Write a Java program to remove a specific element from an array.


//        int[][] arr  =  { {1,2}, {3,4,5}, {6} };



//  int[] arr ={1, 4, 5, 7, 8};
//  Arrays.sort(arr);
//
//  for(int i=arr.length-1; i>=0; i--) {
//
//      System.out.print("*" + arr[i] );
//
//
//  }


//        int[] arr ={1, 4, 5, 7, 8,12,20};
//
//
//        for(int i=0; i<arr.length; i++) {
//
//
//            if(i%2==0 ) {
//                System.out.print(arr[i] + " ");
//            }
//        }





// 8) Ask user to create an integer array and type all odd numbers on the console.
//Scanner scan = new Scanner(System.in);
//System.out.println("How many elements will you type?");
//int num = scan.nextInt();
//
//int[] numbers = new int[num];
//
//
//
//
//for(int i=0; i<num; i++) {
//
//    System.out.println("Type " + (i+1) + ". element");
//    numbers[i] = scan.nextInt();
//
//}
//
//for(int w : numbers) {
//
//    if(w%2 ==1) {
//        System.out.print(w + " ");
//    }
//}



// 1) What type of data can you store in an array? this is an interview question.

// 2) Do primitive data types have reference?

// 3) Which memory do arrays are stored in?

// 4) Create an array whose length is 4 and print the second element on the console.

// 5) Type a code to print all elements of an array on the same line on the console.

// 6) Type a code to print all elements in reverse order by putting "*" before each of them on the same line

// 7)  HOMEWORK : Type code to print the elements whose indexes are even numbers.

// 8) Ask user to create an integer array and type all odd numbers on the console.

/* 9) Type a program like; given an array whose length is 3, return an array with the elements "rotated left"
        For example; if the array is [1, 2, 3] output will be [2, 3, 1].
*/

/* https://en.wikipedia.org/wiki/Left_rotation
 In an array, moving all items to the next lower location.
The first item is moved to the last location, which is now vacant.
 */


// 10) / 2) Find the smallest positive element and greatest negative element in an integer array
//Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2


// 11) /3) Find the elements whose length is the smallest in a String array
//Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

//        String arr[] ={"Kemal", "Jonathan", "Mark", "Angie", "Veli"};









   //     Type code to print the elements whose indexes are odd numbers.

//        int[] ar ={1, 4, 5, 7, 8,12,20};
//
//
//        for(int i=0; i<ar.length; i++) {
//
//
//            if(i%2==1 ) {
//                System.out.print(ar[i] + " ");
//            }
//        }







// 8) Ask user to create an integer array and type all even numbers on the console.
//Scanner scan = new Scanner(System.in);
//System.out.println("How many elements will you type?");
//int num = scan.nextInt();
//
//int[] numbers = new int[num];
//
//
//
//
//for(int i=0; i<num; i++) {
//
//    System.out.println("Type " + (i+1) + ". element");
//    numbers[i] = scan.nextInt();
//
//}
//
//for(int w : numbers) {
//
//    if(w%2 ==0) {
//        System.out.print(w + " ");
//    }
//}


            }
        }







