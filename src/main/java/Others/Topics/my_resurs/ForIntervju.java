package Others.Topics.my_resurs;

import java.util.*;

public class ForIntervju {
    public static void main(String[] args) {



//Find repeated characters in a string

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to see repeated characters");
        String str = scan.nextLine();


        str = str.trim().replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
        String arr[] = str.split("");
        Arrays.sort(arr);
        String output = "";


        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }

            if (!output.contains(arr[i])) {            //If they are not same characters,
                output = output + arr[i] + count + " ";
            }
        }
        System.out.println(output);





 /* 9) Type a program like; given an array whose length is 3, return an array with the elements "rotated left"
        For example; if the array is [1, 2, 3] output will be [2, 3, 1].

*/
//        int arr[] = {1,2,3};
//
//        int brr[] = new int[arr.length];
//
//
//        brr[arr.length-1] = arr[0];
//
//
//        for(int i=1; i<arr.length; i++) {
//
//            brr[i-1] = arr[i];
//        }
//
//        System.out.println(Arrays.toString(brr));

//-----------------------------------------------------------------------

        // Example 2:From the list, If the number of characters is more than 3, remove them from the link list.  (


        LinkedList<String> names = new LinkedList<>();

        names.add("Chris");
        names.add("Alexander");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");


        for(int i=0; i<names.size(); i++) {

            if(names.get(i).length()>4) {
                names.remove(names.get(i));
                i--;
            }
        }

        System.out.println(names);      //[Mark, Tom, Hans]

//-----------------------------------------------------------------------------------------

    //type code to check if a given String is Palindrome

//    String str = "radar";
//    String temp = "";
//
//    for(int i=str.length()-1; i>=0; i--){
//        temp = temp + str.charAt(i);
//    }
//
//    if(temp.equals(str)) {
//        System.out.println("It is palindrome");
//    } else {
//        System.out.println("It is not palindrome");
//    }
//

//------------------------------------------------------------------

        //type code to check if a given integer is Palindrome

//    int a = 123521;
//    String fromN = String.valueOf(a);
//    String space = "";
//
//    for(int i=fromN.length()-1; i>=0; i--) {
//        space = space + fromN.charAt(i);
//    }
//
//    if(space.equals(fromN)) {
//        System.out.println("it is palindorme");
//    } else {
//        System.out.println("it is not palindrome");
//    }


//-----------------------------------------------------------



/*   Ask user to enter arrays element. And put the zeros to the end without change order the other elements
     Put all zeros to end in an integer array
     {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
     {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
 */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the length of Arrays04");
//        int length = scanner.nextInt();
//        System.out.println("Enter elements of array");
//        int[] arr = new int[length];
//
//        int arrNew[] = new int[length];
//
//
//        int idx = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//
//            if (arr[i] != 0) {
//
//                arrNew[idx] = arr[i];
//                idx++;
//            }
//        }
//
//
//        System.out.println(Arrays.toString(arrNew));





//---------------------------------------------------------------------------------------------

        // Bir dizide bir elemandan kac adet vardir?

//        String str ="Java, I like Java?";
//
//        String[] array = str.split("");      //18 elemanli bir array olusur
//        System.out.println("the length of array is " + array.length);   //18
//
//        int counter = 0;
//
//        for(int k=0; k<array.length; k++) {
//
//            if(array[k].equals("a")) {
//                counter++;
//            }
//        }
//        System.out.println("The number of character: " + counter);  //4
//
//        //2.way
//        String[] arrayA = str.split("a");   //a ile parcalara ayirdim, bunun bir eksigi benim eleman sayimdir.
//        System.out.println(arrayA.length-1);            //4

//---------------------------------------------------------------------------------


//2) Find the smallest positive element and greatest negative element in an integer array
//Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2


//        int ab [] = {-12, 18, -5, 23, -2};
//
//        Arrays.sort(ab);
//
//        int positive = ab[ab.length-1];
//
//        int negative = ab[0];
//
//        for(int w: ab) {
//
//            if(w>0) {
//
//                positive = Math.min(positive, w);
//            }
//
//            if(w<0) {
//
//                negative = Math.max(negative, w);
//            }
//        }
//
//
//        System.out.println("Smallest positive is:" + positive +" greatest negative is : " + negative);
//
//
////2.way
//        for(int i=0; i<ab.length; i++) {
//
//            if(ab[i]<0 && ab[i+1]>0) {
//
//                System.out.println("minimum: " + ab[i+1]);
//                System.out.println("maximum: " + ab[i]);

//------------------------------------------------------------------------------------------



//type code to find the sum of the digits of an integer.

//    int given = 456;
//    int sumOfDigits = 0;
//
//    for(int i=given; i>0; i=i/10) {
//
//        sumOfDigits = sumOfDigits + i%10;
//    }
//
//            System.out.println("the sum of the digits of an integer " + sumOfDigits);



//-------------------------------------------------------------------------------------------------


////Ask user to type a positive  Integer and type code to find the sum of the unique digits of that integer

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Type a positive integer");
//        String a = scan.nextLine();
//        int sum = 0;
//
//
//        String str = String.valueOf(a);
//
//
//        for(int i=0; i<str.length(); i++) {
//
//            String ch = str.substring(i, i+1);
//
//            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
//                sum = sum + Integer.valueOf(ch);
//            }
//        }
//
//        System.out.println("the sum of the unique digits of an integer: " + sum);
//


//------------------------------------------------------------------------------------------------------------
        //Example 5: Type code to check if a character is unique in a String or not
        //           "Hello" ==> H is unique, e is unique, o is unique


//        String str = "Hello";
//        String temp = "";
//
//
//        for(int i=0; i<str.length(); i++){
//
//            String ch =str.substring(i,i+1);
//
//            if(str.indexOf(ch)==str.lastIndexOf(ch)) {
//
//                temp += str.substring(i,i+1);
//            }
//        }
//
//        System.out.println("The unique characters :" + temp);



//------------------------------------------------------------------------------------------




//type code to find the sum of the unique digits of an integer.

//     int p = 12321;   //    3
//
//        String newN = String.valueOf(p);
//        int sumOfDigit = 0;
//
//        for(int i=0; i<newN.length(); i++) {
//
//            String ch = newN.substring(i,i+1);
//
//            if(newN.indexOf(ch)==newN.lastIndexOf(ch)) {
//
//                sumOfDigit = sumOfDigit + Integer.valueOf(ch);
//            }
//        }
//        System.out.println(sumOfDigit);



 //Sum of digits

//      String str = "3456";
//    int sum = 0;
//
//    for (int i = 0; i<str.length(); i++) {
//        String digit = str.substring(i, i+1);
//        sum=  sum + Integer.valueOf(digit);
//
//    }
//    System.out.println(sum);




//*Check perfekt number  using for Loop
//A perfect number is a number that is equal to the sum of its positive divisors
//(excluding the number itself). For example, 6, 28, 496 etc. are perfect number

//        int num = 496;
//        int sum=0;
//
//        for(int i=1; i<num; i++) {
//
//            if(num%i == 0) {
//
//                sum += i;
//            }
//        }
//
//        if(sum==num ) {
//            System.out.println(num  + " is a perfect number");
//        } else {
//            System.out.println(num  + " is not a perfect number");
//        }
//


 //-------------------------------------------------------------------------------




// Type code to print repeated characters in a String. For example; accessories ⇒ ces


//        String s = "accessories";
//        String d = "";
//
//        for(int i=0; i<s.length(); i++){
//            String c = s.substring(i,i+1);
//            if(s.indexOf(c)!=s.lastIndexOf(c)){
//                if(!d.contains(c)){
//                    d = d + c;
//                }
//            }
//        }
//        System.out.println(d);


//or


//        String str = "accessories";
//
//        String repeatedChars = "";
//        int i =0;
//
//        do{
//            String s = str.substring(i, i+1);
//            if(str.indexOf(s) != str.lastIndexOf(s) && !repeatedChars.contains(s)){
//                repeatedChars = repeatedChars + s;
//            }
//            i++;
//        }while(i<str.length());
//        System.out.println(repeatedChars);//ces



//--------------------------------------------------------------------------------------------------------


/*        Fibonacci serilerinde sonraki sayı, önceki iki sayının toplamıdır, örneğin 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 vb.
                Fibonacci serisinin ilk iki sayısı 0 ve 1’dir.
                */

//        Scanner reader = new Scanner(System.in);
//
//        System.out.print("N Sayısını Girin:");
//        int n = reader.nextInt();
//
//        int n1=0,n2=1,n3;
//        System.out.print(n1+" "+n2);//0 ve 1 yazdır
//
//        for(int i=2;i<n;++i)//Döngü 2 den başlıyor çünkü ilk 2 terim 0 ve 1 her zaman yazılacak
//        {
//            n3=n1+n2;
//            System.out.print(" "+n3);
//            n1=n2;
//            n2=n3;
//        }
//        System.out.println();

//----------------------------------------------------------------------------------



// Question 23- Ask the user to enter an integer to check if it is a prime number or not. Example: if user
//enters 43 output will be “43 is a prime number”, if user enters 120 output will be “120 is not a
//prime number”, if user enters negative integers output will be “Enter a positive integer”

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int num = scan.nextInt();
//        int count = 0;
//
//        if(num<0) {
//            System.out.println("Enter a positive integer");
//
//        } else {
//            for (int i = num - 1; i > 1; i--) {        //except from 1 and number it selv
//
//
//                if (num % i == 0) {
//                    count++;
//                }
//            }
//            if(count==0) {
//                System.out.println(num + " is a prime number");
//            } else {
//                System.out.println(num + " is not a prime number");
//            }
//        }




//Type code to find the sum of the unique digits of an integer
//Example: 12133455 --> 2+4=6

//        int num =12133455;
//        String str = String.valueOf(num);
//        int temp = 0;
//
//        for(int i=0; i<str.length(); i++) {
//
//            String ch = str.substring(i,i+1);
//
//            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
//
//                temp = temp + Integer.valueOf(ch);
//            }
//
//        }
//        System.out.println(temp);

//----------------------------------------------------------------------------------------





//*Check perfekt number  using for Loop
//A perfect number is a number that is equal to the sum of its positive divisors
//(excluding the number itself). For example, 6, 28, 496 etc. are perfect number

//int num = 496;
//int sum=0;
//
//for(int i=1; i<num; i++) {
//
//    if(num%i == 0) {
//
//        sum += i;
//    }
//}
//
//      if(sum==num ) {
//          System.out.println(num  + " is a perfect number");
//      } else {
//          System.out.println(num  + " is not a perfect number");
//      }



// [0, 2, 3, 0, 12, 0] put the zeros to the end

        int a[] = {0,2,3,0,12,0};

        Arrays.sort(a); //0 0 0 2 3 12

        int newA [] = new int[a.length];
        int j=0;

        for(int i= a.length-1; i>=0; i--) {

            newA[j] = a[i];
            j++;
        }

        System.out.println(Arrays.toString(newA));



//
        //A number is called an Armstrong number if it equals the sum of the cube of its every digit.
//For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which equals the
//cube of every digit. Type a code to check if the given number is the Armstrong number or
//not.

//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a number");
//        int num= input.nextInt();
//        int a=0;
//        int kntrl=0;
//
//        for (int i =num; i>0; i=i/10){
//            a=i%10;
//            kntrl= kntrl +(a*a*a);
//        }
//        if (kntrl==num){
//            System.out.println("armstrong ");
//        }else{
//            System.out.println("not");
//        }



//---------------------------------------------------------------------


        // How to remove duplicates from an ArrayList [2,3,2,2,5]-->[2.3.5]
//
//        ArrayList<Integer> originalList = new ArrayList<>();
//
//        originalList.add(2);
//        originalList.add(23);
//        originalList.add(2);
//        originalList.add(2);
//        originalList.add(5);
//
//        ArrayList<Integer> uniqueList = new ArrayList<>();
//
//        for(Integer w:originalList) { {
//
//            if(! uniqueList.contains(w)) {
//                uniqueList.add(w);
//            }
//        }
//        }
//
//        System.out.println(uniqueList);
//


//---------------------------------------------------------------------------------------

        //Find the sum of the elements in the array { {1,2,3}, {4,5}, {6,7} } and return an array.
// For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}

//        int arr[][]={ {1,2,3}, {4,5}, {6,7} };
//        int sum=0;
//        int i=0;
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


//----------------------------------------------------------------------------------------------------------


//        //Example 1-   [0, 2, 3, 0, 12, 0] put the zeros to the end
//
//        int a[] = {0,2,3,0,12,0};
//
//        Arrays.sort(a);     //0,0,0,2,3,12
//
//        int b[] =new int[a.length];
//        int i=0;
//
//        for(int j=a.length-1; j>=0; j--) {
//
//            b[i] = a[j];
//            i++;
//
//        }
//        System.out.println(Arrays.toString(b));     //[12, 3, 2, 0, 0, 0]




//Example 4. Type code to find the longest word in the sentence


//        String s = "I want to go to university to learn more";
//
//        String ss[] = s.split(" ");
//
//        String longest = "";
//
//
//        for(String w: ss) {
//
//            if(w.length()>longest.length()) {
//
//                longest = w;
//            }
//        }
//
//        System.out.println("The longest word in the sentence is: " + longest);



        //2.way

//        String s = "I want to go to university to learn more";
//        String words[] = s.split(" ");
//
//        System.out.println(Arrays.toString(words));   // [I, to, go, to, to, want, more, learn, university]
//
//        Arrays.sort(words, Comparator.comparingInt(String::length));
//
//        System.out.println(Arrays.toString(words));
//
//        System.out.println(words[words.length-1]);      // university



//Find the smallest element and greatest negative element in an integer array
//Example:  {-12, 18, -5, 23, -2}  -->Smallest positive is 18, greatest negative is -2

//        int[] a = {-12, 18, -5, 23, -2};
//
//        Arrays.sort(a);         // -12 -5 -2 18 23
//
//        int negative = a[0];
//
//        int positive = a[a.length-1];
//
//
//        for(int w:a) {
//
//            if(w>0) {
//
//                positive = Math.min(positive, w);
//            }
//
//            if(w<0) {
//
//                negative = Math.max(negative, w);
//            }
//
//        }
//
//        System.out.println("Greatest negative is: " + negative + ", Smallest positive is: " + positive);



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
//            if(w>0) {
//                positive = Math.min(w,positive);
//            }
//
//            if(w<0) {
//                negative = Math.max(w, negative);
//            }
//        }
//
//        System.out.println("smallest positive: " + positive + " and greatest negative: " + negative);
//
//
//        //2.way
//
//        int[] a = new int[]{-12, 18, -5, 23, -2};
//        Arrays.sort(a);
//        for (int i=0;i<a.length;i++){
//            if (a[i]<0 && a[i+1]>0) {
//                System.out.println("Maximum negative: " + a[i]);
//                System.out.println("Minimum positive: " + a[i+1]);
//            }
//        }



        //--------------------------------------------------


    }
}
