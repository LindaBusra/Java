package Others.JavaSlides;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Slide96_Do_While {
    public static void main(String[] args) {

        /*1) Write a program to print numbers from 1 to 5 on the console by using do-while loop.*/


        int i = 1;

        do {
            System.out.print(i + " ");
            i++;

        } while (i < 6);
        System.out.println();
//----------------------------------------------------------------------------------------------


// 2) Write a program to print numbers from 10 to 3 on the console by using do-while loop.

        int y = 10;
        do {
            System.out.print(y + " ");
            y--;

        } while (y > 2);
        System.out.println();
//----------------------------------------------------------------------------------------------



/* 3)Write a program to print numbers which are divisible by 5 between 1 and 100 on the console
by using do-while loop.  */

        int k = 1;

        do {
            if (k % 5 == 0) {
                System.out.print(k + " ");
            }
            k++;
        } while (k < 101);
        System.out.println();
//----------------------------------------------------------------------------------------------


//4) Write a program to print letters from c to m on the console by using do-while loop.

        char ch = 'c';

        do {
            System.out.print(ch + " ");
            ch++;
        } while (ch <= 'm');
        System.out.println();
//----------------------------------------------------------------------------------------------


//-5) Ask user to enter a number.
//If the number is divisible by 10 then print "Won!" on the console
//otherwise ask user to enter another number.
//Use do-while loop

//        Scanner scan = new Scanner(System.in);
//        int num;
//
//        do{
//            System.out.println("Enter a number to play");
//            num = scan.nextInt();
//
//            if(num%10 == 0) {
//                System.out.println("Won!");
//            }
//
//        } while( num%10 == 0);
//        System.out.println("Lost!");
//        System.out.println();

//----------------------------------------------------------------------------------------------

/* 6) Ask user to enter a name.
If the name contains the letter ‘a’ then print "Won!" on the console
otherwise ask user to enter another name.
Use do-while loop

 */

//      Scanner scan = new Scanner(System.in);
//      String name;
//
//      do{
//          System.out.println("Enter a name for play");
//          name = scan.nextLine();
//          name = name.toLowerCase();
//          if(name.contains("a")) {
//              System.out.println("Won!");
//          }
//      }while(name.contains("a"));
//
//        System.out.println("Lost");
//        System.out.println();

//----------------------------------------------------------------------------------------------



/*  7-Ask user to enter a String
Print the characters whose indexes are odd on the console
For example; Germany ==> e m n
 */


//      Scanner scan = new Scanner(System.in);
//      String str;
//      int m;
//
//      do {
//          System.out.println("Enter a String");
//          str = scan.nextLine();
//          for (m = 0; m < str.length(); m++) {
//              if (str.indexOf(str.charAt(m)) % 2 != 0) {
//                  System.out.print(str.charAt(m) + " ");
//              }
//
//          }
//
//      }while (str.indexOf(str.charAt(m)) % 2 != 0) ;


//2.way  7-Ask user to enter a String
//Print the characters whose indexes are odd on the console
//For example; Germany ==> e m n
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String please!");
        String str = input.next();
        int ind;

        for(int h=0; h<str.length(); h++) {

            ind = str.indexOf(str.charAt(h));

            if(ind % 2 != 0) {
                System.out.print(str.charAt(h));  //rbe
            }
        }


















    }
}