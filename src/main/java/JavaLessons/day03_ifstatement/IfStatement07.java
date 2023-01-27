package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement07 {

    public static void main(String[] args) {



/* Example 1- If age greater than or equal to 35 and gender equal to M it prints Man,
 otherwise it prints Woman. Boy or Girl when age less than 35.
 */


        int age = 32;
        char gender= 'M';

        if(age>=35) {

            if(gender=='m' || gender=='M') {
                System.out.println("Man");
            } else {
                System.out.println("Woman");
            }

        } else {
            if(gender=='m' || gender=='M') {
                System.out.println("Boy");
            } else {
                System.out.println("Girl");
            }
        }



/*  Note: "|" checks both conditions.
                          "||" does not check the second condition, if first one is true
                          "||" is faster than "|"

            Note:    & means "and":  If you use "&" between 2 things it means you want both.
            "&" and "&&" do the same but
           "&&" does not check the second condition if the first condition is false.
           "&" checks both conditions every time.

 */


//---------------------------------------------------------------------------------------------


//Example 02 - Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)



            Scanner scan= new Scanner(System.in);
            System.out.println("Enter your age");

            //create container for the input
            int age1= scan.nextInt();

            if(age1>=0 && age1<=4){
                System.out.println("baby");
            }else if(age1>=5 && age1<=12){
                System.out.println("child");
            }else if(age1>=13 && age1<=20){
                System.out.println("teenager");
            }else if(age1>=21 && age1<=30){
                System.out.println("adult");
            }else{
                System.out.println("not expected age");
            }



    }
}
