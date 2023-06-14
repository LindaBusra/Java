package Others.javaQuestionBank_TechPro;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_71_79 {
    public static void main(String[] args) {


/*Question-71
        Find the middle element in an integer array
        Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10  */


//        int num[] ={12,5,8,13};
//        Arrays.sort(num);
//
//        int middle= num.length/2;
//
//        int length = num.length;
//
//
//        if(length%2 ==1) {
//
//            System.out.println(num[middle]);
//        }
//
//        if(length%2==0) {
//            int middleForEven = (num[middle] + num[middle-1])/2;
//            System.out.println(middleForEven);
//        }


//---------------------------------------------------------------------------------------------


//Question-2 Find the smallest positive element and greatest negative element in an integer array
//Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

//        int numbers[] = {-12, 18, -5, 23, -2};
//
//        Arrays.sort(numbers);
//
//        int positive = numbers[numbers.length-1];
//        int negative = numbers[0];
//
//        for(int w:numbers) {
//
//           if(w>0) {
//               positive = Math.min(w,positive);
//           }
//
//            if(w<0) {
//                 negative = Math.max(w, negative);
//            }
//         }
//
//        System.out.println("smallest positive: " + positive + " and greatest negative: " + negative);


        //2.way


//        int[] a = new int[]{-12, 18, -5, 23, -2};
//        Arrays.sort(a);
//        for (int i=0;i<a.length;i++){
//            if (a[i]<0 && a[i+1]>0) {
//                System.out.println("Maximum negative: " + a[i]);
//                System.out.println("Minimum positive: " + a[i+1]);
//            }
//        }


//---------------------------------------------------------------------------------------------


//3) Find the elements whose length is the smallest in a String array
//Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

//        String names[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
//        int minLenght = names[0].length();
//
//        for(String w: names) {
//
//            minLenght = Math.min(w.length(), minLenght);
//        }
//
//        for(String w:names) {
//
//            if(w.length() == minLenght) {
//                System.out.print(w + " ");
//            }
//        }


//---------------------------------------------------------------------------------------------


//4) Get the initials of the elements in a String array, if the String ends with 'n' or 'k'
//Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JMJ

//        String names[] = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
//
//        for(String w:names) {
//
//            if(w.endsWith("n") || (w.endsWith("k"))) {
//
//                System.out.print(w.charAt(0));
//            }
//        }


//---------------------------------------------------------------------------------------------


//5) Find the total number of characters used in String array elements
//        Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26

//        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
//
//        int sum = 0;
//
//        for(String w:b) {
//
//            sum += w.length();
//        }
//
//        System.out.println("the total number of characters: " + sum);


//---------------------------------------------------------------------------------------------


// 6) Count how many words start with 'a' or 'A' in a given String

//        String s = "Apex is an object oriented programming language";
//
//        String sr[] = s.split(" ");
//        int count = 0;
//
//        for(String w: sr) {
//
//            if(w.startsWith("a") || w.startsWith("A")) {
//                count++;
//            }
//        }
//
//        System.out.println(count + " words start with 'a' or 'A' in a given String");


//---------------------------------------------------------------------------------------------


// 7) Find the number of vowels in a String
//String s = "Apex is an object oriented programming language";


//        String s = "Apex is an object oriented programming language";
//
//        String st[] = s.toLowerCase().split("");
//        int counter = 0;
//
//        for(String w:st) {
//
//            boolean isVowel = w.equals("a") || w.equals("e") || w.equals("i") || w.equals("o") || w.equals("u");
//
//            if(isVowel) {
//                counter++;
//            }
//        }
//
//        System.out.println("the number of vowels in given string is: " + counter);


//---------------------------------------------------------------------------------------------


//8) Type code to find array elements whose first and last characters are same
//String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

//        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
//
//        for(String w: arr) {
//
//            int first = w.charAt(0);
//            int last = w.charAt(w.length()-1);
//
//            if(first==last) {
//                System.out.print(w + " ");
//            }
//        }


//---------------------------------------------------------------------------------------------


//9) Type code to find if a given element exists in a given array or not
//String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};

//        String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
//
//        String given = "Apex";
//        int count = 0;
//
//        for(String w:arr) {
//
//            if(given.equals(w)) {
//                count++;
//            }
//        }
//
//
//        if(count>0) {
//            System.out.println("Given element " + given + " exists " + count + " times");
//        } else {
//            System.out.println("given element " + given + " does not exists ");
//        }


//---------------------------------------------------------------------------------------------


//10- Type code to find sum of the number of characters of array elements


        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        int sum = 0;

        for (String w : arr) {

            sum += w.length();
        }

        System.out.println("sum of the number of characters: " + sum);


//---------------------------------------------------------------------------------------------


//11-) Type code to put all zeros to end in an integer array.
//Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)


        int num[] = {5, 0, 2, 0, 3};

        int newNum[] = new int[num.length];

        Arrays.sort(num);
        int j = 0;


        for (int i = num.length - 1; i >= 0; i--) {

            newNum[j] = num[i];
            j++;
        }

        System.out.println("The new array is " + Arrays.toString(newNum));


//---------------------------------------------------------------------------------------------


//12) Create an integer array by getting the elements from the user then print the difference
//between the smallest and the greatest elements on the console.


//        Scanner scan = new Scanner(System.in);
//        System.out.println("How many elements will you in the array");
//        int length = scan.nextInt();
//
//        int list[] = new int[length];
//
//
//        for(int i=0; i<length; i++) {
//
//            System.out.println("Enter your " + (i+1) +". element please");
//            list[i] = scan.nextInt();
//          }
//
//        Arrays.sort(list);
//
//
//        int greatest = list[list.length-1];
//        int smallest = list[0];
//
//        System.out.println("the difference is: " + (greatest-smallest));


//-----------------------------------------------------------------------------------------------------------------




    }}










