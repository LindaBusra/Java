package JavaLessons.day10_DoWhileLoop;

import java.util.Scanner;

public class DoWhile06 {

    public static void main(String[] args) {




 //Find the digits of a number by using do-while

        int number=1234;

        int sumDigit=0;

        do{
            sumDigit += number%10;
            number = number/10;

        }while (number>0);

        System.out.println("The sum of digits: " + sumDigit);




//----------------------------------------------------------------------------------------------------


        //break

        while(true) {                           //it is true always
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a character");
            String s= scan.next();

            if(s.equalsIgnoreCase("Q"))    {
                System.out.println("Exit from program");
                break;
            }
        }



//----------------------------------------------------------------------------------------------------


        //continue-->Print all positive number less than 10, except 4 and 6

        int k = 0;
        while(k<10) {

            if(k==4 || k==6) {
                k++;                    //if we are not writing i++, it gives 1 2 3 and after that it become infinitive
                continue;
            }
            System.out.println("k: " + k);
            k++;

        }


    }
}
