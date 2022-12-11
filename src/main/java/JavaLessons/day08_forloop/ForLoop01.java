package JavaLessons.day08_forloop;

public class ForLoop01 {
    public static void main(String[] args) {




//Example 1: Type code to print "Hi" five times on the console

    //There is no repetition,it is not difficult
    String s = "Hi";


    for(int i =1; i<6; i++ ) {
        System.out.println(s);
    }


    /*To do repated actions Java created "Loops"
    There are 4 lopps in Java: i)for-loop 2)while-loop  3)for-each-loop

    Increment: To increase the value  i++;  (with addition og multiplication)
    i = i+5;    i+=5;   i = i*5;    i *= 5;

    Decrement: To decrease value of a variable.  (with - and /)
    i = i-3;    i-=3;   i = i/5;    i /=%;    */



//------------------------------------------------------------------------------------------------


//Example 2-Type all integers from 11 to 44 in the same line with a space between consecutive integers.


    for(int i=11; i<45; i++) {
        System.out.print(i + " ");
    }


//------------------------------------------------------------------------------------------------



//Example-3 Type all integers from 44 to 11 in the same line with a space between consecutive integers.

        for(int i=44; i>10; i--) {
            System.out.print(i + " ");
        }











    }
}
