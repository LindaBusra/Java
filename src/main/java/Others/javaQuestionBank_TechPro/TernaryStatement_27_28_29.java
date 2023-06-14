package Others.javaQuestionBank_TechPro;

public class TernaryStatement_27_28_29 {
    public static void main(String[] args) {

/* 1) Use ternary to print "Valid Password" if the password has at least 8 characters different
from space characters. "Invalid Password" if the password has less than 8 characters
different from space character.

 */
        String password = "TR @23";

        String result = password.replaceAll("\\s", "").length()>=8 ? "Valid Password" :
                        "Invalid Password" ;

        System.out.println(result);


/* 2) Use ternary to print
a) "Isosceles Triangle" if two sides of a triangle are equal in length.
b) "Equilateral Triangle" if all sides of a triangle are equal in length.
c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied

 */
    double a=1.5, b=6.5, c=3.5;
    String result2 =  a==b && b==c ? "Equilateral Triangle" :
            ( (a==b && a!=c) || (a==c && a!=b) ||(b==c && b!=a) ? "Isosceles Triangle" :"Neither isosceles, nor equilateral");


        System.out.println(result2);


/*3) Use ternary to print
a) "Round up by last digit" and print the rounded value if the last digit of an integer is greater than or equal to 5
b) "Round down by last digit" and print the rounded value if the last digit of an integer is less
than 5
 For example; 127 will be rounded up and the value will be 130
 125 will be rounded up and the value will be 130
 123 will be rounded down and the value will be 120  */

int num = 224;
String result3 = num %10>=5 ? ("after round up by last digit:" + (num/10+1)*10)
        : ("after round down by last digit:" + (num/10)*10);
System.out.println(result3);



/* 4) Type Apex code by using nested ternary.
Write a program to check if a year is a leap year or not.
If the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.  */
int year = 2040;
        String isLeap = (year%100==0) ? ( (year%400==0) ? ("Leap") : ("Not Leap") ) :   //kosul1
                ( (year%4==0 ? ("Leap") : ("Not Leap") ));   //kosul2

        System.out.println(isLeap);


/*        5) Type code to check the password
        If it has more than 8 characters, initial should be 'i'
        If it does not have more than 8 characters initial should be 'K'
        Solve the task by using nested-ternary   */

        String pWord = "XXXXXXXXX";
        String res = pWord.length()>8 ? pWord.startsWith("i") ? "Valid" : "Invalid" :   //1.kosul
                pWord.startsWith("K") ? "Valid" : "Invalid";        //2.kosul
        System.out.println(res);











    }
}
