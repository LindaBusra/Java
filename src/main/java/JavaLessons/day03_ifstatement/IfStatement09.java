package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement09 {


    public static void main(String[] args) {



// Type code to check if a String has an uppercase initial and dot at the end.
//Example: For 'Ali' your code should print false on the console
// For 'ali.' your code should print false on the console
// For ‘ Ali. ’ your code should print false on the console
// For 'Ali.' your code should print true on the console
// For 'ALI.' your code should print true on the console


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String please");
        String m1 = input.nextLine();

        char first = m1.charAt(0);
        boolean isTrue = (m1.length() == m1.trim().length()) && ((first >= 'A' & first <= 'Z') && (m1.charAt(m1.length() - 1) == '.'));

        if (isTrue)  {

            System.out.println(true);

        } else {
            System.out.println(false);
        }



//Example: Find Leap year


        int year = 2017;


        if ((year%4==0 && year%100 != 0) || (year%400 ==0 )) {
            System.out.println(year + " is leap year. And february has 29 days this year");
        } else {
            System.out.println(year + " is not leap year. And february has 28 days this year.");
        }




    }
}
