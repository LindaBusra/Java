package JavaLessons.day10_dowhileloop;

import java.util.Scanner;

public class WhileLoops09 {

    public static void main(String[] args) {



/* Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
with a space between two consecutive integers  */


        int i=120;
        while(i>10){
            if(i%4==0 && i%6==0){
                System.out.print(i +" ");
            }
            i--;
        }
        System.out.println();




//Example.

        int k=12;
        int sum = 0;
        while(k<68) {
            sum = sum + k;
            k++;
        }

        System.out.println("The sum is " + sum);
        System.out.println();



//------------------------------------------------------------------------------



// Example 5- Password example



        Scanner scan = new Scanner(System.in);
        String s = "";
        do {
            System.out.println("Enter your password");
            s = scan.nextLine();
            if(s.length()>6 && s.charAt(0)=='A') {
                System.out.println("It is okay");
            }else {
                System.out.println("Make the length longer than 6");
            }
        }while(!(s.length()>6));
        scan.close();


    }
}
