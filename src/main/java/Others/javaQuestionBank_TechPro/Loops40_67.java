package Others.javaQuestionBank_TechPro;

import java.util.Scanner;

public class Loops40_67 {
    public static void main(String[] args) {

/* Question-1
Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
with a space between two consecutive integers
 */

//        for (int i=120; i>10; i--) {
//            if(i%4==0 && i%6==0) {
//                System.out.print(i + " ");
//            }
//        }

//while ile cozum

//        int i=120;
//        while(i>10){
//            if(i%4==0 && i%6==0){
//                System.out.print(i +" ");
//            }
//            i--;
//        }

//do ile cozum

//
//        int j=120;
//        do{
//            if(j%4==0 && j%6==0){
//                System.out.print(j + " ");
//            }
//            j--;
//        }while(j>10);
//


//------------------------------------------------------------------------------------------------------------------


//Question 2-  Type code to print repeated characters in a String.
// For example; accessories ⇒ ces

//        String str = "accessories";
//        String temp ="";
//
//        for(int i=0; i<str.length(); i++) {
//
//            String ch = str.substring(i,i+1);
//
//            if(str.indexOf(ch) != str.lastIndexOf(ch)) {
//                if(!temp.contains(ch)) {
//                    temp = temp + ch;
//
//                }
//
//            }
//         }
//
//        System.out.println("Repeated characters in this string is : " + temp);




/* Question-3) Type code to check whether a String is palindrome or not. If a String is the same with its
reverse then it is called palindrome. For example; “anna”, “123321” are palindromes

 */

//        String a = "1233251";
//        String temp = "";
//
//        for(int i = a.length()-1; i>-1; i--) {
//            temp = temp + a.charAt(i);
//
//        }
//
//        if(temp.equals(a)) {
//            System.out.println("It is palindrome");
//        } else {
//            System.out.println("It is not palindrome");
//        }


//------------------------------------------------------------------------------------------------------------------



/*  Question 4)
Type code to print the unique digits in an integer. Example; 223878 ⇒ 37
 */
//        int b = 223878;
//        String num = String.valueOf(b) ;
//
//        for(int i = 0; i<num.length(); i++) {
//
//            if(num.indexOf(num.charAt(i)) == num.lastIndexOf(num.charAt(i))  ) {
//                System.out.print(num.charAt(i));
//            }
//        }
//        System.out.println("\n---------------------------------------------------------");

//------------------------------------------------------------------------------------------------------------------




/* Question-5 Type code to draw the following image by using a for loop.
A A A A A
A A A A A
A A A A A           */

//        for(int i=0; i<3; i++) {
//            for ( int j=0; j<5; j++) {
//                System.out.print("A ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("\n---------------------------------------------------------");


//------------------------------------------------------------------------------------------------------------------

/* Question 6-  Type code to draw the following image by using a for loop.
A
A A
A A A
A A A A      */

//        for(int i = 1; i<5; i++) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("A ");
//            }
//
//            System.out.println();
//        }
//
//
//        System.out.println("\n-------------------------------------------------------------");




/* Question 7- Type code to create multiplication table like
3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
 */


//        for(int i=1; i<11; i++) {
//            System.out.print("3x" + i + "=" + (3*i) + " ");
//        }
//
//        System.out.println("\n-------------------------------------------------------------");


// Question-8) Type code to print odd integers from 20 to 3 in the same line with a space between two
//consecutive ones.

//        for(int i=20; i>4; i--) {
//            if(i%2 != 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println("\n-------------------------------------------------------------");




// Question-9) Type code to print all lowercase characters in a String with an asterix.
//For example; 'Ali Can?' ==> l*i*a*n*

//    String name = "Ali Can?";
//    name =name.replaceAll("[^a-z]", "");
//
//    for(int i = 0; i<name.length(); i++) {
//        System.out.print(name.charAt(i) + "*");
//    }
//        System.out.println("\n-------------------------------------------------------------");





//Question 10) Type code to print digits just in the decimal part of the given decimal number with an
//asterix. For example; 75.4238 --> *4*2*3*8

//        double n = 75.4238;
//        String m = String.valueOf(n);
//
//        int dec = m.indexOf(".");     //2
//        String newM = m.substring(dec+1);    //4238 olur
//
//
//        for(int i = 0; i<newM.length(); i++) {
//            System.out.print("*" + newM.charAt(i));
//        }
//        System.out.println("\n-------------------------------------------------------------");





//Question 11) Type code to reverse a String. Example; Mark ==> kraM

//        String ad = "Mark";
//
//        for(int i=ad.length()-1; i>=0; i--) {
//            System.out.print(ad.charAt(i));
//        }
//        System.out.println("\n-------------------------------------------------------------");





/*Question 12-  Type code to draw the following image by using a for loop.
A A A A A A A A
A X X X X X X A
A X X X X X X A
A X X X X X X A  */


//        int rows = 4, columns = 8;
//
//        for (int i = 1; i <= rows; i++) {
//
//            String s = "";
//            if (i == 1) {     //alt satiri A X X X X X X A  seklinde istersem if(i==1 || i==rows)
//                for (int k = 1; k <= columns; k++) {
//                    s = s + "A ";
//                }
//                System.out.println(s);
//            } else {
//                s = s + "A ";
//                for (int m = 2; m < columns; m++) {
//                    s = s + "X ";
//                }
//                s = s + "A ";
//                System.out.println(s);
//            }
//        }









        //oylesine E04_02

 /*     A A A A A A A A
        A X X A A X X A
        A X X A A X X A
        A X X A A X X A  */


//        int rows = 4, columns = 8;
//        for(int i=1; i<=rows; i++){
//
//            String s = "";
//            if(i==1 ){     //alt satiri A X X X X X X A  seklinde istersem if(i==1 || i==rows)
//                for(int k=1; k<=columns; k++){
//                    s = s + "A ";
//                }
//                System.out.println(s);
//            }else{
//                s = s + "A ";
//                for(int m=1; m<3; m++){
//                    s = s + "X ";
//                }
//
//                for(int n=3; n<5; n++){
//                    s = s + "A ";
//                }
//
//                for(int h=4; h<6; h++){
//                    s = s + "X ";
//                }
//
//                s = s + "A ";
//                System.out.println(s);
//            }
//        }





//Question 13) Type code to find the sum of the integers from 3 to 14


//        int sum = 0;
//        for(int i=3; i<14; i++) {
//            sum +=i;
//        }
//
//        System.out.println("the sum of the integers from 3 to 14: " + sum);
//    }





// Question 14) Type code to find the multiplication of the integers from 3 to 9

//        int multiply = 1;
//
//        for (int i = 3; i < 10; i++) {      //181440
//            multiply = multiply * i;
//        }
//
//        System.out.println("sayilarin carpimi: " + multiply);






// Question 15) Type code to print characters from 'C' to 'A' on the console by using do-while loop


//1.way

//        String result = "";
//        for(char i = 'A'; i<'D'; i++){
//            result = result + i;
//        }
//        System.out.println(result);


//2.way

//        char ch = 'A';
//        String temp="";
//        do{
//            temp = temp + ch;
//            ch++;
//        }while(ch<='C');
//        System.out.println(temp);





// Question 16) Type all characters before the first occurrence of 'm' in a String

//        String st = "Christmas";
//        int firstM = st.indexOf("m");
//
//        if(firstM != 0){
//            System.out.println(st.substring(0, firstM));
//        }
//




//Question 17) Type code to find the sum of the digits in an integer

//        int numb = 1284;
//        int sumDigit = 0;
//
//        for(int i=numb; i>0; i/=10) {
//
//            sumDigit += i%10;
//        }
//
//        System.out.println("the sum of the digits in an integer is: " + sumDigit);





//Question 18) Type code to print unique characters in a String. For example; Hello ==> Heo



//        String str = "Hello";
//        String temp ="";
//
//        for(int i=0; i<str.length(); i++) {
//
//
//            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
//
//                temp = temp + str.charAt(i);
//            }
//        }
//
//        System.out.println(temp);




//Question 19) Find the total number of characters different from space and punctuation marks in a String

//    String str ="Java is a strongly typed, object-oriented programming language.";
//
//    String newStr = str.replaceAll("\\p{Punct}","").replace(" ", "");
//
//    System.out.println("the total number of characters different from space and punctuation marks : " +newStr.length());





/* Question 20- 20) Type code to draw the following image by using a for loop.
* * * * * *
* * * * *
* * * *
* * *
* *
*         */



//        int row=6;
//        for(int i=6; i>0; i--) {
//            for(int j=i; j>0; j--) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }



//------------------------------------------------------------------------------------


// Question 21- Type code to find the sum of the unique digits of an integer
//Example: 12133455 --> 2+4=6

//        int num =12133455;
//        String str = String.valueOf(num);
//        int sum = 0;
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



//-----------------------------------------------------------------------------------------------------



// Question 22-  Type code to print integers from 3 to 9 except 5

//    for(int j=3; j<10; j++) {
//
//        if(j==5) {
//            continue;
//        }
//        System.out.print(j+ " ");
//    }


//--------------------------------------------------------------------------------------------



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
//        System.out.println("\n");




//Question 24) Ask the user how many fibonacci numbers he wants to see. Then write the code that prints
//these fibonacci numbers. Example: if user enters 6 output will be 1 1 2 3 5 8

//        Scanner scan = new Scanner(System.in);
//        System.out.println("How many fibonacci numbers do you want to see");
//        int num = scan.nextInt();
//
//
//        int fibo1 = 1;
//        int fibo2 = 1;
//        int fibonacci = 0;
//        System.out.println(fibo1 + " " + fibo2 + " ");
//
//
//        for (int i = 1; i <num-1; i++) {
//            fibonacci = fibo1 + fibo2;
//                    System.out.print(fibonacci + " ");

//            fibo1 = fibo2;
//            fibo2 = fibonacci;
//
//
//        }


//Alternatif
/*
Fibonacci serilerinde sonraki sayı, önceki iki sayının toplamıdır, örneğin 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 vb.
Fibonacci serisinin ilk iki sayısı 0 ve 1’dir.
 */

//        Scanner reader = new Scanner(System.in);
//
//        System.out.println("Enter the number n:");
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

//--------------------------------------------------------------------------------------------------------



// Question 25- A number is called an Armstrong number if it equals the sum of the cube of its every digit.
//For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which equals the
//cube of every digit. Type a code to check if the given number is the Armstrong number or
//not.   Like 1634, 153

//            Scanner scan = new Scanner(System.in);
//            System.out.println("Enter the Number: ");
//            int originalNum = scan.nextInt();  //save it
//
//            int num1=originalNum, num2=originalNum;
//            int sum = 0, remainder=0, digitNumber = 0;
//
//
//
//            while(num1>0) {
//                num1 /= 10;
//                digitNumber++;              //I will find number of digits
//            }
//
//
//
//            while (num2>0)
//            {
//                remainder = num2 % 10;
//                sum += Math.pow(remainder, digitNumber);
//                num2 /= 10;
//            }
//
//            if(sum == originalNum)
//                System.out.println(originalNum + " is an Armstrong number.");
//            else
//                System.out.println(originalNum + " is not an Armstrong number.");


//------------------------------------------------------------------------------------------------------


///* QuestionBank  Side 66 - 26) Get a String and a character from user
//Count the number of characters between the first occurrence and the last occurrence of the
//given character in the String
//Do not count the space characters
//If the character which user selected is displayed just once in the String return -1
//If the character which user selected does not exist in the String return -1
//For example; "Java  is easy" - 'a' ==> 5
// "Java is easy" - 'w' ==> -1
// "Java is easy" - 'e' ==> -1
// */



//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a String...");
//        String s = scan.nextLine();
//        System.out.println("Enter a character...");
//        char ch = scan.next().charAt(0);
//
//        s=s.trim().replaceAll(" ", "");
//
//
//        String chNew= String.valueOf(ch);
//
//
//        int fIndexOfCh = s.indexOf(ch);
//        int lIndexOfCh = s.lastIndexOf(ch);
//        String sNew = s.substring(fIndexOfCh+1,lIndexOfCh+1);   // altta bunu length'e bir ekelyerek hallettim
//
//
//
//        if(fIndexOfCh == lIndexOfCh) {
//            System.out.println(-1);
//        } else {
//
//            System.out.println(sNew.length()-1);            //
//        }



//----------------------------------------------------------------------------------------------------------


//Question

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a String...");
//        String s = scan.nextLine();
//        System.out.println("Enter a character...");
//        char ch = scan.next().charAt(0);
//        int a = s.indexOf(ch);
//        int b = s.lastIndexOf(ch);
//
//        String withoutSpace = s.replaceAll("[\\s]", "");
//        String between = withoutSpace.substring(withoutSpace.indexOf(ch)+1 , withoutSpace.lastIndexOf(ch)+1);
//        int c = between.length()-1;
//        if (a==b){
//            System.out.println(-1);
//        }else System.out.println(c);




////-----------------------------------------------------------------------------------------------------------------


//Question 27-) From a given array find all pairs whose sum is a given number.
//If the array is {4, 6, 5, -10, 8, 5, 20} and the number is 10 then output will be
//4+6=10, 5+5=10, -10+20=10

//        int arr[] = {4, 6, 5, -10, 8, 5, 20};
//
//        int number = 10;
//
//
//        for(int i=0; i<arr.length; i++) {
//
//                for(int j=i+1; j<arr.length; j++) {
//
//                   if(arr[i] + arr[j] == number ) {
//                       System.out.println(arr[i] + "+" + arr[j] + "=" + number);
//                   } else{
//
//                   }
//                }
//            }








}

}