package Others.JavaSlides;

import java.util.Scanner;

public class Slide76_NestedTernary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 // 1-Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
 //the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”

        System.out.println("Enter an integer");
        int number = scanner.nextInt();

        System.out.println((number % 2 == 0) ? "The integer is even" : "The integer is odd");
        System.out.println("-------------------------------------------------------------------------------------------");


//  2-Type java code by using ternary and if-else. Ask user to enter two integers
//Write a program to print the minimum one on the console.

        System.out.println("Enter two integers");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println((n1<n2)? n1 : n2);
        System.out.println("-------------------------------------------------------------------------------------------");


//  3-Type java code by using ternary.
//Write a program to print absolute value of an integer entered by user


        System.out.println("Enter a value");    //ya bir harf girerse???
        int number1 = scanner.nextInt();

        if(number1>=0) {
            System.out.println("absolute value of " +  number1 + " is " + number1);

        } else {
            System.out.println("absolute value of " +  number1 + " is " + (number1*(-1)));
        }
        System.out.println("-------------------------------------------------------------------------------------------");


//  4- Type java code by  using ternary.
//Take values of length and width of a rectangle from user and check if it is square or not.

        System.out.println("Enter length of a rectangle");
        int length = scanner.nextInt();
        System.out.println("Enter width of a rectangle");
        int width = scanner.nextInt();

        String result = (width == length) ? "It is square" : "It is rectangle" ;
        System.out.println(result);


// 5-Ask user to enter a String. If the String has 2 characters, output will be
//“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”

        System.out.println("Type a String");
        String str = scanner.next();

        String rslt = (str.length() == 2) ? "It is valid for state abbreviations" : "It is not valid for state abbreviations" ;
        System.out.println(rslt);


//6-Ask user to enter an integer. If the number has 3 digits, output will be
//“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”


        //1.yol

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int num = input.nextInt();

        String s1 =String.valueOf(num);

        System.out.println(s1.length()==3 ? ("The number has 3 digits") : ("The number has no 3 digits"));


        //2.yol
        System.out.println("Enter an integer");
        int sayi = scanner.nextInt();
        int sayac = 0;


        while(sayi > 0) {
            sayi /= 10; // sayi = sayi / 10;
            sayac++;
        }

        System.out.println(sayac == 3 ? "This number has 3 digits" : "This number has no 3 digits." );

//7- Ask user ta enter a number. If the number is less than 10 and greater
//than or equal to 0, calculate its cube. Otherwise, calculate its square.

        System.out.println("Enter an number");
        double  num2 = scanner.nextDouble();

        String result2 = (num2<10 && num2<=0) ? "it is cube" : "it is square";
        System.out.println("result: " + result2);













// ---------------------------------------------------------------------------------------

        int y = 5;
        System.out.println((y > 5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y));
        //y=8 icin sonuc 16, y=12 icin sonuc 36. y=4 icin sonuc 7, ve y=5 icin sonuc 8
// ---------------------------------------------------------------------------------------

        String newName = "Veli";

        System.out.println((newName.length()>3) ? (newName.contains("i")? "Veli" : "No name") : ("Ali"));   //Ali
        //newName= Ali icin sonuc Ali   ve   Veli icin sonuc Veli

        System.out.println(newName.equals("Ali") ? (newName.charAt(0) == 'a' ?  "Good" : "Bad") : ("The worst"));
        //newName= Ali icin sonuc Bad   ve   Veli icin sonuc The worst


    }
}
