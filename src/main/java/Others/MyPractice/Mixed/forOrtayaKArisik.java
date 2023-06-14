package Others.MyPractice.Mixed;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class forOrtayaKArisik {


    public static void main(String[] args) {



//Question 1- What is the output?


//        int X=5;
//        System.out.println(X>2 ? X<4 ? 10 : 8 : 7);







//Question-2 : What is the result of a, b, c, d?


//        int a = 5;
//        int b = 2;
//        int c;
//        int d;
//
//        c = ++b;
//        d = a++;
//        c++;
//        b = --a;
//        a = --c;
//        d = b--;
//
//
//        System.out.print("a: "+a+"\nb: " + b + "\nc: " + c + "\nd: " + d);
//        System.out.println();
//




//Question 3

//        int a = 5;
//        int b = 2;
//        int c;
//        int d;
//        c = ++b;
//        d = a++;
//        c++;
//        d = b--;
//        b= a++;
//        c = --b+ (--a);
//
//        System.out.println(a+b+c+d);
//



//Question 4-



//        int sayi1 = 10;
//        int sayi2 = sayi1 + 1;
//
//        sayi2 += 5;
//        int sayi3 =  sayi2++;
//        int sayi4 = ++sayi1;
//
//
//        System.out.println(sayi1+sayi2+sayi3+sayi4);



















//Question 3- For this array : {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};

//a) Find index of "Sigrund" and  output must be like that --> Index for "Sigrun" is : 2












//b) Find index of "Einar" and  output must be like that --> Index for "Einar" is : 3

//c) Sort the array elements in ascending order according to their lengths. {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};
//d) Sort the array elements in descending order according to their lengths. {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};



















/* Question 4- Check PERFECT NUMBER using for Loop
A perfect number is a number that is equal to the sum of its positive divisors
(excluding the number itself). For example, 6, 28, 496 etc. are perfect number      */




//Question 5-
       /*
       String TvPrice= "$ 1200.99";
       String MousePrice= "$ 30.99";

       Type a code to find the sum of the TV and mouse prices.

     */



//Question 6- Find the number of vowels in this  String  >> "I like to move it move it"


//Question 7- Type code to find digit of a given numer. For example : 1245



/* Type code for this pattern

    <><><><><>
    <><><><>
    <><><>
    <><>
    <>

*/











//ANSWERS



//Question 1- What is the output?


//        int X=5;
//        System.out.println(X>2 ? X<4 ? 10 : 8 : 7);   //8



//------------------------------------------------------------------------------------------------


//Question-2

//        int a = 5;
//        int b = 2;
//        int c;
//        int d;
//
//        c = ++b;        //  c=3, b=3
//        d = a++;        //  d=5, a=6
//        c++;            //  c=4
//        b = --a;        // b=5; a=5
//        a = --c;        // a=3, c=3
//        d = b--;        //    d=5, b=4
//
//        System.out.print("a: "+a+"\nb: " + b + "\nc: " + c + "\nd: " + d);
//        System.out.println();         a: 3 b: 4 c: 3 d: 5



//------------------------------------------------------------------------------------------------


//Question 3-Sort the array elements in descending order according to their lengths. {"Vidar", "Michael", "Sigrund", "Maria", "Susanne"};


//a) Find index of "Sigrund"
//        String s1[] = {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};
//
//        int ind1 = Arrays.binarySearch(s1, "Sigrund");
//
//        System.out.println("Index for \"Sigrun\" is : " + ind1);


//
////b) Find index of "Einar"
//
//       String s2[] ={"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};
//
//
//        Arrays.sort(s2);
//
//        int ind2 = Arrays.binarySearch(s2, "Einar");
//        System.out.println("Index for \"Einar\" is : " + ind2);  //-1    order no


///c) Sort the array elements in ascending order according to their lengths. {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};

//        String s3[] ={"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};
//
//        Arrays.sort(s3, Comparator.comparingInt(String::length));
//        System.out.println(Arrays.toString(s3));                //[Ole, Vidar, Maria, Michael, Sigrund, Susanne]



//        d) Sort the array elements in descending order according to their lengths. {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};


//        String s4[] ={"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};
//
//        Arrays.sort(s4, Comparator.comparingInt(String::length).reversed());
//        System.out.println(Arrays.toString(s4));          //   [Michael, Sigrund, Susanne, Vidar, Maria, Ole]










//
////--------------------------------------------------------------------------------------------------------------------------------
//
////c) Sort the array elements in ascending order according to their lengths. {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};
//
//        String s3[] ={"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};
//
//        //Sort the array elements in ascending order according to their lengths. {"Veli", "Michael", "Ali", "Maria", "Susanne};
//        Arrays.sort(s3, Comparator.comparingInt(String::length));
//
//        System.out.println(Arrays.toString(s3));                //[Ole, Vidar, Maria, Michael, Sigrund, Susanne]
////--------------------------------------------------------------------------------------------------------------------------------
//
//
////d) Sort the array elements in descending order according to their lengths. {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};
//
//        String s4[] ={"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};
//
//        //Sort the array elements in descending order according to their lengths. {"Veli", "Michael", "Ali", "Maria", "Susanne};
//        Arrays.sort(s4, Comparator.comparingInt(String::length).reversed());
//
//        System.out.println(Arrays.toString(s4));            //[Michael, Sigrund, Susanne, Vidar, Maria, Ole]



//--------------------------------------------------------------------------------------------------------------------------------

/* Question 4- Check PERFECT NUMBER using for Loop
A perfect number is a number that is equal to the sum of its positive divisors
(excluding the number itself). For example, 6, 28, 496 etc. are perfect number      */


//int number = 496;
//int sum = 0;
//
//for(int i=1; i<number; i++) {
//
//    if(number%i == 0) {
//        sum = sum + i;
//
//    }
//
//}
//
//if(sum == number) {
//    System.out.println(number + " is perfect number");
//} else {
//    System.out.println(number + " is not perfect number");
//}

//--------------------------------------------------------------------------------------------------------------------------------


//Question 5-
       /*
       String TvPrice= "$ 1200.99";
       String MousePrice= "$ 30.99";

       Type a code to find the sum of the TV and mouse prices.

     */


//        String TvPrice = "$ 1200.99";
//        String MousePrice = "$ 30.99";
//
//        TvPrice = TvPrice.replace("$ ", "");    //12.99
//        MousePrice = MousePrice.replace("$ ", "");      //35.99
//
//        double forTv = Double.valueOf(TvPrice) ;
//        double forBook = Double.valueOf(MousePrice);
//
//        System.out.println(forTv + forBook);  // 1231.98


//--------------------------------------------------------------------------------------------------------------------------------



//Question 6- Find the number of vowels in this  String  >> "I like to move it move it"

//        String str ="I like to move it move it";
//        String newStr = str.replaceAll("[^aeiou]", "");
//        System.out.println("There is " + newStr.length() + " vowels in this String" ) ;     //9



//Question 7- Type code to find digit of a given numer. Foer example : 1245

//        int number1 = 1245;
//        int count = 0;
//
//        while(number1>0) {
//
//            number1 = number1/10;
//            count++;
//        }
//
//        System.out.println("The number has " + count + " digits");      //4




/*Question 8 -Type code for this pattern

<><><><><>
<><><><>
<><><>
<><>
<>

*/

//
//        for(int i=5; i>0; i--) {
//            for(int j=i; j>0; j--) {
//                System.out.print("<>");
//
//            }
//            System.out.println();
//        }



//Example 4- Multiplication table with for loop and while loop

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to see the multiplication table on the console:");
        int num = scan.nextInt();


        int y=1;

        while(y<11) {

            System.out.println(num + "X" + y + "=" + num*y);
            y++;
        }



        for(int i=1; i<11; i++) {

            System.out.println(num + "X" + i + "=" + num*i);
        }




























   }

}
